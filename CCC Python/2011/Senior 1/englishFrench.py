nLines = int(input())   #number of lines to follow
text = []          #will hold the sentences in a list

 #holds the occurences of each letter in the text
s = 0
S = 0
t = 0
T = 0

#adds the sentences entered by the user to a list holding the texts
for i in range(nLines):
    sentence = input()
    text.append(sentence)

#finds the amount of occurences of each letter and records it
for phrase in text:
    s += phrase.count("s")
    S += phrase.count("S")
    t += phrase.count("t")
    T += phrase.count("T")
    


if (t + T) > (s + S):   #if there are more t and T, its ENGLISH text
    print ("English")

if (t + T) < (s + S):   #if there are more s and S, its FRENCH text
    print ("French")
    
if (t + T) == (s + S):  #if there is an equal amount, its FRENCH text
    print ("French")
