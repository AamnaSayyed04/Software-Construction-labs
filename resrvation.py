
class Customer:
    def __init__(self,name):
        self.name=name
        
    def set_name(self,name):
        self.name=name
        
    def get_name(self):
        return self.name
    
    
class Reserve_Table:
    def __init__(self,cust,people,time):
        self.cust=cust
        self.people=people
        self.time=time
        
    def set_people(self,people):
        self.people=people
        
    def get_people(self):
        return self.people
    
    def set_cust(self,cust):
        self.cust=cust
        
    def get_cust(self):
        return self.cust
    
    def set_time(self,time):
        self.time=time
        
    def get_time(self):
        return self.time
    
class Hotel_Resources:
    
    tables_capacity={'extra_large_table':12,'large_tables':6,'medium_tables':4,'small_tables':2}
    
    def __init__(self):
        self.extra_large_table=1
        self.large_tables=3
        self.medium_tables=8
        self.small_tables=2
        
    def check_table_availability(self,no_of_people):
        if(no_of_people <=2 and self.small_tables!=0):
            return 'small_tables'
        elif(no_of_people <=4 and self.medium_tables!=0):
            return 'medium_tables'
        elif(no_of_people <=6 and self.large_tables!=0):
            return 'large_tables'
        elif(no_of_people <=12 and self.extra_large_tables!=0):
            return 'extra_large_tables'
        else:
            return 'No table available'
        
    def valid_time(self,given_time):
        hours=int(given_time[:2])
        minutes=int(given_time[3:])
        
        if(hours<11):
            return False
        elif(hours>=21 and minutes>=15):
            return False
        else: return True
        

        


