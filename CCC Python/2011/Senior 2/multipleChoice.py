#ask user for number of questions
n = int(input())

#lists that will hold questions answers and answer key
qa = []
ans = []

testScore = 0

#ask user for the questions answers and adds it to a list of question answers
for i in range(n):
    q = input()
    qa.append(q)

    
#ask user for the answer key and adds it to a list of answers
for i in range(n):
    a = input()
    ans.append(a)
   

# creates pairs of elements in the 2 lists and will increment testScore by 1 if they match
for a, b in zip(qa, ans):
  if a == b:
    testScore += 1

print (testScore)
