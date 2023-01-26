n = int(input("Enter Number in Range [5 - 100]: " ))

def f_CheckNum(n):
    if n >=5 and n <=100:
        for i in range(1,n+1):
            print(i)
    else:
        n = int(input("Enter Number in Range [5 - 100]: " ))
        f_CheckNum(n)
        

f_CheckNum(n)