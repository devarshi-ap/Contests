#ccc02s2

from fractions import Fraction as frac
import fractions

den = int(input())
num = int(input())
w = 0

if den > num and den % num != 0:
    
    while den > num:
        den = den - num
        w += 1
    
    d = fractions.gcd(den, num)
    den = den // d
    num = num // d
    
    print ("%d %d/%d" % (w, den, num))

else:
    print (frac(den, num))
