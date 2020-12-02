# CCC '20 J4 - Cyclic Shifts

a = str(input())
b = str(input())
cyclic = []
hasCyclic = "no"

for i in range(len(b)):
    if b in a:
        hasCyclic = "yes"
        break
    b = b[-1] + b[:-1]

print(hasCyclic)
