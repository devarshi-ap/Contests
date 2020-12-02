# CCC '06 J2 - Roll the Dice

m = int(input())
n = int(input())
count = 0

for x in range(1, m+1):

	for y in range(1, n+1):
		
		if x+y==10:
			count+=1


if count == 1:
	print("There is 1 way to get the sum 10.")
else:
	print("There are %d ways to get the sum 10." %count)
