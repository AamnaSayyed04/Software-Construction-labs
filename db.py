
import resrvation

import MySQLdb
 
 
db=MySQLdb.connect("localhost","root","","restaurant")
cursor=db.cursor()

user=raw_input("Enter Username: ")
pas=raw_input("Enter Password: ")


 
#wascursor.execute("INSERT INTO user_authentication(Username,Password) Values(%s,%s)",(user,pas))
 
cursor.execute("Select password from user_authentication where Username='"+user+"'")
data=cursor.fetchone()


if data != None and data==pas:
    print "true"
else:
    print "false"



cust=resrvation.Customer('Noor')           
reserve=resrvation.Reserve_Table(cust,4,'16:00')


res=resrvation.Hotel_Resources()
table=res.check_table_availability(reserve.people)
res.tables_capacity[table]-=1
time=res.valid_time(reserve.get_time())

if(table!='No table available' and time==True):
    end=reserve.get_time()
    end_time=int(end[0:2])+1
    entry="INSERT into reservation(Name,Booked_table,Start_Time,End_Time) Values(%s,%s,%s,%s)"
    cursor.execute(entry,(cust.get_name(),table,reserve.get_time(),str(end_time)+':00'))
    db.commit()
else:
    print "No table available at this time.Sorry!"
    
cursor.execute("SELECT * from reservation")
data=cursor.fetchall()

print data


