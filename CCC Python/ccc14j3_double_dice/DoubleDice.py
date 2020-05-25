#CCC '14 J3 - Double Dice

a = 100
d = 100
n = int(input())

for i in range(n):
    x, y = map(int, input().split())    #takes in x y as distinct elements
    
    if x > y:
        d -= x
    elif y > x:
        a -= y

print (a)
print (d)