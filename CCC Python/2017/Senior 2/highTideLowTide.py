# CCC '17 S2 - High Tide, Low Tide

n = int(input())
allTides = []
low = []
high = []

allTides = list(map(int,input().split()))

for i in range(0,len(allTides),2):
    
    if allTides[i] < allTides[i+1]:
        low.append(allTides[i])
        high.append(allTides[i+1])
    else:
        low.append(allTides[i+1])
        high.append(allTides[i])

low.sort()
low.reverse()
high.sort()

finalTides = []

for i in range(len(allTides)//2):
    finalTides.append(low[i])
    finalTides.append(high[i])

print(*finalTides)
