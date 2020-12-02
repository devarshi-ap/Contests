# CCC '19 J1 - Winning Score

a, b = 0,0
fa, fb = 3,3

for i in range(3):
    a += int(input()) * fa
    fa -= 1

for i in range(3):
    b += int(input()) * fb
    fb -= 1


if a > b:
    print("A")
elif a == b:
    print("T")
else:
    print("B")
