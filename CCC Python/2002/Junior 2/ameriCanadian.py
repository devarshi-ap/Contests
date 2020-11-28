# CCC '02 J2 - AmeriCanadian

consonant = "bcdfghjklmnpqrstvwxz"

while True:

	word = str(input())

	if word == "quit!":
		break

	if (len(word) > 4) and (consonant.count(word[-3]) == 1) and (word[-2:] == "or"):
		cad = word[:-1] + "u" + word[-1]
		print(cad)
	else:
		print(word)
