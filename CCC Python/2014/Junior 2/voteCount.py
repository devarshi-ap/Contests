numVotes = int(input())
votes = input()
aCount = 0
bCount = 0

for i in range(numVotes):
    if votes[i] == "A":
        aCount += 1
    else:
        bCount += 1

if(aCount > bCount):
    print ("A")
elif(bCount > aCount):
    print ("B")
else:
    print ("Tie")
