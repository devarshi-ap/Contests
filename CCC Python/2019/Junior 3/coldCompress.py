# CCC '19 J3 - Cold Compress
# U.R.

N = int(input())


for i in range(N):
    s = ""
    text = list(str(input()))
    
    for c in text:
        if text.count(c) == 0:
            continue
        else:
            s += str(text.count(c)) + " " + c + " "
            text = list(filter((c).__ne__, text))
    
    print(s)
