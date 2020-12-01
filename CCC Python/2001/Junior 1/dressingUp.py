n = int(input())

for i in range(1, n+1,2):
    print('*'*i+' '*(n*2-i*2)+'*'*i)
    
for j in range(n-2,0,-2):
    print('*' * j + ' ' * (n * 2 - j * 2) + '*' * j)
