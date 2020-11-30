#prompts user for the last 4 digits
d1 = int(input())
d2 = int(input())
d3 = int(input())
d4 = int(input())

#checks criteria for telemarketer phone call properties
if ( (d1 == 8) or (d1 == 9) ) and ( (d4 == 8) or (d4 == 9) ) and (d2 == d3):
    print ("ignore")
else:
    print ("answer")
