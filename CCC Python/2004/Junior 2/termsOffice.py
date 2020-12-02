# CCC '04 J2 - Terms of Office

m = 0
t = 0
p = 0
d = 0

a = int(input())
b = int(input())

for i in range(a, b + 1):
  if m == 0 and t == 0 and p == 0 and d == 0:
    print("All positions change in year ",i)
    
  m = (m+1)%4
  t = (t+1)%2
  p = (p+1)%3
  d = (d+1)%5
