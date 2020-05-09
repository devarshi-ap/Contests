#number of adjectives, a, and nouns, n.
a = int(input())
n = int(input())

#list to hold adjectives and nouns
adj = []
nouns = []

#adds words to list of adjectives
for i in range(a):
    word = input()
    adj.append(word)

#adds words to list of nouns
for i in range(n):
    word = input()
    nouns.append(word)
    
#iterates thru both lists and prints the combos of each adj and noun at index i and j
for i in range(len(adj)):
  for j in range (len(nouns)):
    print(adj[i] + " as " + nouns[j])