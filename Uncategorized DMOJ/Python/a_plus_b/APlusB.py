num = int(input())	#prompts user for number of problems to solve

for i in range(num):	
    x, y = map(int, input().split())		#splits the string into a list and maps it to ‘a’ and ‘b’ and prints it
    print(x + y)