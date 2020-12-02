# CCC '13 J4 - Time on task

totalTime = int(input())
numChores = int(input())
lstTimes = []

for i in range(numChores):
	t = int(input())
	lstTimes.append(t)

lstTimes.sort()

maxChores = 0
time = 0

for i in lstTimes:
	if time + i <= totalTime:
		time += i
		maxChores += 1

print(maxChores)
