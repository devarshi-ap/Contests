# CCC '03 J1 - Trident

t = int(input())
s = int(input())
h = int(input())


for x in range(t):
    print ("*" + s * " " + "*" + s * " " + "*")
  
print ((s*2 + 3)*"*")

for x in range(h):
    print ((s+1)*" " + "*" + (s+1) * " ")
