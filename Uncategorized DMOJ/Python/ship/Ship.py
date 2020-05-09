#prompts for parts in tact; ms is # of missing parts; mp is missing parts
ship = input()
ms = 0
mp = ""

#searches string for chars
if ship.count("B") < 1:
    mp += "B"
    ms += 1
    
if ship.count("F") < 1:
    mp += "F"
    ms += 1
    
if ship.count("T") < 1:
    mp += "T"
    ms += 1
    
if ship.count("L") < 1:
    mp += "L"
    ms += 1
    
if ship.count("C") < 1:
    mp += "C"
    ms += 1

#final output
if ms == 0:
    print ("NO MISSING PARTS")
else:
    print (mp)