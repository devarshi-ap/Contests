month = int(input())
day = int(input())

if(month < 2):      #before the month of Feb
    print ("Before")

if(month > 2):    #after the month of Feb
    print ("After")
    
if(month == 2 and day < 18):    #during Feb but before the 18th
    print ("Before")

if(month == 2 and day > 18):    #during Feb but after the 18th
    print ("After")
    
if(month == 2 and day == 18):   #on Feb 18
    print ("Special")
