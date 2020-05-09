#prompts for number of antenna and eyes on alien
antenna = int(input()) 
eyes = int(input())

if(antenna >= 3 and eyes <= 4):   #at least 3 antenna and at most 4 eyes; Troy Martian
    print ("TroyMartian")

if(antenna <= 6 and eyes >= 2):   #at most 6 antenna and at least 2 eyes; VladSaturnian
    print ("VladSaturnian")

if(antenna <= 2 and eyes <= 3):   #at most 2 antenna and at most 3 eyes; GraemeMercurian
    print ("GraemeMercurian")
else:
    print ("")  #no ouput if no description matches with the aliens