#ccc16j2

magic = True

square = [[0 for x in range(4)]for y in range(4)]

for a in range(0, 4):
    square[a][0], square[a][1], square[a][2], square[a][3] = map(int, input().split(" "))
  
s = square[0][0]+square[0][1]+square[0][2]+square[0][3]

for b in range(0, 4):
    if s != square[b][0]+square[b][1]+square[b][2]+square[b][3]:
        magic = False
    
for c in range(0, 4):
    if s != square[0][c]+square[1][c]+square[2][c]+square[3][c]:
        magic = False
    
if magic:
    print("magic")
else:
    print("not magic")