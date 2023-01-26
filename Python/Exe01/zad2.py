n = int(input("Enter Number 'n' in Range [1 - 100]: " ))
m = int(input("Enter Number 'm' in Range [1 - 100]: " ))

def f_CheckNums(n,m):
    if n >=1 and n <=100 and m >=1 and m <=100:
        for i in range(n,m+1):
            print(i)
    else:
        n = int(input("Enter Number 'n' in Range [1 - 100]: " ))
        m = int(input("Enter Number 'm' in Range [1 - 100]: " ))
        f_CheckNums(n,m)
        

f_CheckNums(n,m)