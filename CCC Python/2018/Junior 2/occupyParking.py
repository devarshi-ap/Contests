#number of parking spots, yesterday's spots, today's spots
pS = int(input())
y = input()
t = input()
ss = 0

#iterates thru the indices of each string and checks fi they're equal
for c in range(pS):
    if t[c] == y[c]:
        if t[c] == "C":
            ss += 1

print (ss)
