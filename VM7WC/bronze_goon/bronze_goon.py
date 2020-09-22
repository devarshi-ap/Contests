#VM7WC '15 #1 Bronze - Goon

import shlex

#number is added to list and split into digits
digits = input()
d = list(digits)

d.remove('-')
d.remove('-')

s1 = int(d[0]) + int(d[1]) + int(d[2])
s2 = int(d[3]) + int(d[4]) + int(d[5])
s3 = int(d[6]) + int(d[7]) + int(d[8]) + int(d[9])

    
if (s1 == s2) and (s1 == s3):
    print ("Goony!")
else:
    print ("Pick up the phone!")
