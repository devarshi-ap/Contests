numbers = int(input())  #number of numbers
n = []

#ask user for number and append it to a list
for i in range(numbers):
    num = int(input())
    n.append(num)

#iterates thru the list, prints the smallest number and removes it
for x in range(len(n)):
    print (min(n))
    n.remove(min(n))
