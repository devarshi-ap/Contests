numPeople = int(input())	#number of people including Ren
ren = int(input())		#ren’s power level
y = True				

#this for loop will ask the user (numPeople - 1) times for a fighter’s power level
#if the inputted power level is greater than ren’s, s = false.

for p in range(numPeople - 1):
    if int(input()) >= ren:
        y = False

if y:
    print("YES")
else:
    print("NO")