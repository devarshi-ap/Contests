# CCC '01 J2 - Mod Inverse

x = int(input())
y = int(input())
exists = False
modIn = 0

for i in range(1,y):
    if (i*x)%y == 1:
        exists = True
        modIn = i

if exists:
    print(modIn)
else:
    print("No such integer exists.")
