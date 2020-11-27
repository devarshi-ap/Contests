# CCC '00 J2 - 9966

low = int(input())
high = int(input())
count = 0

for i in range(low, high+1):
    
    num = str(i)
    cantRotate = False
    rotatedNum = ""

    for digit in num:
        if digit == "0":
            rotatedNum += digit
        elif digit == "1":
            rotatedNum += digit
        elif digit == "6":
            rotatedNum += "9"
        elif digit == "8":
            rotatedNum += digit
        elif digit == "9":
            rotatedNum += "6"
        else:
            cantRotate = True
            break

    if num==rotatedNum[::-1] and not cantRotate:
        count += 1

print(count)
