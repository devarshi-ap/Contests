# CCC '03 S1 - Snakes and Ladders

win = False
count = 1

while not win:
  rollDice = int(input())

  if rollDice == 0:
    break
  
  count += rollDice
  
  if count == 9:
    count = 34
  elif count == 40:
    count = 64
  elif count == 54:
    count = 19
  elif count == 67:
    count = 86
  elif count == 90:
    count = 48
  elif count == 99:
    count = 77
  elif count == 100:
    print("You are now on square " + str(count))
    win = True
    break
  elif count > 100:
    count -= rollDice
  else:
    count = count
    
  print("You are now on square " + str(count))
  
if rollDice == 0:
  print("You Quit!")
else:
  print("You Win!")
