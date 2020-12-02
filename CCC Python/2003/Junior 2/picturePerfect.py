# CCC '03 J2 - Picture Perfect

from math import floor
from math import sqrt

while True:
    c = int(input())
    if c == 0:
        break
    else:
        l = int(floor(sqrt(c)))
        while c % l != 0:
            l -= 1
        
        w = c // l
        print("Minimum perimeter is {} with dimensions {} x {}".format((2*l + 2 * w), l, w))
