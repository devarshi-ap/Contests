#CCC '05 J3 - Returning Home

d = []
t = 0

while True:
    d.append(input())
    if d[t] == "SCHOOL":
        break
    t += 1

for a in range(len(d) - 2, -1, -2):
    print("Turn ", end = "")
    if d[a] == "R":
        print("LEFT ", end = "")
    else:
        print("RIGHT ", end = "")
    if a == 0:
        print("into your HOME.")
    else:
        print("onto " + d[a - 1] + " street.")
