#asks user for boolean expression (string)
expression = input()

numNots = expression.count("not")    #Holds number of 'not's in the expression

#will hold either True or False (s will hold one, and d, the other)
s = ""
d = ""

if expression.count("True") > 0:
    s = "True"
    d = "False"
else:
    s = "False"
    d = "True"


#if numNots is even, print the boolean with it (True/False)
if numNots % 2 == 0:
    print (s)
else:
    print (d)