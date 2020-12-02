# CCC '06 J3 - Cell-Phone Messaging

one = "adgjmptw"
two = "behknqux"
three = "cfilorvy"
four = "sz"

while True:
    time = 0
    x = ""
    word = str(input())
    if word == 'halt':
        break
    for letter in word:
        if letter in one:
            time += 1
            x += str(one.index(letter) + 2)
        elif letter in two:
            time += 2
            x += str(two.index(letter) + 2)
        elif letter in three:
            time += 3
            x += str(three.index(letter) + 2)
        else:
            time += 4
            if letter == 's':
                x += '7'
            else:
                x += '9'
    for i in range(1, len(x)):
        if x[i] == x[i - 1]:
            time += 2

    print(time)
