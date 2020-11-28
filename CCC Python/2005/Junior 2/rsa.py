# CCC '05 J2 - RSA Numbers

start = int(input())
end = int(input())
numRSA = 0


for i in range(start, end+1):		# 10, 11, 12
	count = 0

	for x in range(1, end+1):			# 1->10, 11, 12
		if i % x == 0 :
			count += 1
	
	if count == 4:
		numRSA += 1


print("The number of RSA numbers between %d and %d is %d" %(start,end,numRSA))
