# CCC '13 S1 - From 1987 to 2013

def isDistinct(year):
	StringYear = str(year)

	for digit in StringYear:
		if StringYear.count(digit) > 1:
			return False
	
	return True


y = int(input()) + 1	# + 1 to handle start years that are distinct

while True:
	if isDistinct(y):
		print(y)
		break
	else:
		y+=1
