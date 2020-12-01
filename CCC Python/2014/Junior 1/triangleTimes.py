#Asks for the 3 degrees of the triangle
d1 = int(input())	
d2 = int(input())
d3 = int(input())


if((d1 == 60) and (d2 == 60) and (d3 == 60)): 	#if all angles are 60, the triangle is equilateral
    print ("Equilateral")
    
elif(d1 + d2 + d3 == 180):
    if((d1 == d2) or (d1 == d3) or (d2 == d3)):	 #if any two of the 3 angles are equal, it’s Isosceles
        print ("Isosceles")
  
    elif((d1!=d2) and (d1!=d3) and (d2!=d3)):  #if none of the degrees are equal, the triangle is Scalene
        print ("Scalene")
else:
    print ("Error")
