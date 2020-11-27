# CCC '00 S4 - Golf

d = int(input())
c = [int(input()) for i in range(int(input()))]
l = [5281 for i in range(d + 1)]
l[0] = 0

for i in range(d + 1):
  for j in range(len(c)):
    if d >= i + c[j]:
      if l[i] + 1 < l[i+c[j]]:
        l[i+c[j]] = l[i] + 1

if 5281 > l[d]:
  print("Roberta wins in " + str(l[d]) + " strokes.")
else:
  print("Roberta acknowledges defeat.")
