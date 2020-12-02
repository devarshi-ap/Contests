# CCC '19 S1 - Flipper

# initial matrix
init = [[1,2],[3,4]]
seq = str(input())


for i in seq:
	
	# swaps the values of first and second array's, position in respective array stays unchanged
	# ex. [1,2][3,4]  -->  [3,4][1,2]
	if i == "H":
		init[0][0], init[1][0] = init[1][0], init[0][0]
		init[0][1], init[1][1] = init[1][1], init[0][1]
	
	# swaps the values inside the first and second array, leaving the 2 arrays with the same values
	# ex. [1,2][3,4]  -->  [2,1][4,3]
	else:
		init[0][0], init[0][1] = init[0][1], init[0][0]
		init[1][0], init[1][1] = init[1][1], init[1][0]


print( init[0][0], init[0][1] )
print( init[1][0], init[1][1] )
