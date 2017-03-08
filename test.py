# -*- coding: utf-8 -*-
"""
Created on Wed Mar 08 11:25:27 2017

@author: MaryamBaig
"""
import reservation
Booking=[]

cust=reservation.Customer('Maryam')           
reserve=reservation.Reserve_Table(cust,4,'15:00')

res=reservation.Hotel_Resources()
table=res.check_table_availability(reserve.people)
res.tables_capacity[table]-=1
time=res.valid_time(reserve.get_time())

if(table!='No table available' and time==True):
    Booking.append((cust.get_name(),table,reserve.get_time())
        

