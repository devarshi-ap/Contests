#ccc11j3 Sumac Sequences

a = int(input())
b = int(input())
count = 2

while a >= b and a >= 0 and b >= 0:
    count += 1
    c = a - b
    a = b
    b = c
    
print (count)
