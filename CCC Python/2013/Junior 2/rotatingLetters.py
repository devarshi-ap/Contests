word = input()  #prompt user for word

canRotate = True

#iterates thru each character in the word and identifies the list of characters that can rotate
for c in word:
    if(c == 'I' or c == 'O' or c == 'S' or c == 'H' or c == 'Z' or c == 'X' or c == 'N'):
        canRotate = True
    else:
        canRotate = False
    
if canRotate:
    print ("YES")
else:
    print ("NO")
