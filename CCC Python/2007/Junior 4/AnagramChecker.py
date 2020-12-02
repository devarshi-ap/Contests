# CCC '07 J4 - Anagram Checker

a = str(input()).lower()
b = str(input()).lower()


if(sorted(a) == sorted(b)):
    print("Is an anagram.")
else:
    print("Is not an anagram.")
