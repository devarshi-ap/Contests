n = int(input())    #asks user for number to shift
k = int(input())    #asks user for number of times to shift N
sum = n             #holds sum of shifted numbers

for i in range(k):
    n *= 10
    sum += n
    
print (sum)