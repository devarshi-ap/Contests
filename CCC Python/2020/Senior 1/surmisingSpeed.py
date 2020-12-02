# CCC '20 S1 - Surmising a Sprinter's Speed

numObs = int(input())
speeds = []
v = []
maxVel = 0

for i in range(numObs):
    speeds.append(list(map(int, input().split(" "))))

speeds.sort()

for i in range(len(speeds) - 1):
    v.append((abs((int(speeds[i][1])) - int((speeds[i+1][1])))) / ((int(speeds[i+1][0])) - int((speeds[i][0]))))

print(max(v))
