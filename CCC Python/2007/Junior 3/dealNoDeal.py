# CCC '07 J3 - Deal or No Deal Calculator

cases = [100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000]
knocked = []
t = 0
count = 0

n = int(input())

for i in range(n):
    c = int(input())
    knocked.append(cases[c-1])

offer = int(input())

for amt in cases:
    if amt not in knocked:
        t += amt
        count += 1

if offer >= (t/c):
    print("deal")
else:
    print("no deal")
