# CCC '20 J3 - Art

numDrops = int(input())
xCoord, yCoord = [], []

for _ in range(numDrops):
    x, y = input().split(',')
    xCoord.append( int(x) )
    yCoord.append( int(y) )

print("%d,%d" %(min(xCoord)-1, min(yCoord)-1))
print("%d,%d" %(max(xCoord)+1, max(yCoord)+1))
