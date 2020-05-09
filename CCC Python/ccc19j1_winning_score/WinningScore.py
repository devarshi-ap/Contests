x = 3
y = 3
ta = 0
tb = 0

#total points for Apples (input: 3s, 2s, 1s)
for i in range(3):
    pa = int(input())
    ta += pa * x
    x -= 1

#total points for Bananas
for i in range(3):
    pb = int(input())
    tb += pb * y
    y -= 1

#compares points and returns winner
if ta > tb:
    print ("A")
elif tb > ta:
    print ("B")
else:
    print ("T")