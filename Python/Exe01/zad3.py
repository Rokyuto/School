def f_InputNums():
    n = int(input("Enter Number 'n' in Range [1 - 100]: " ))
    m = int(input("Enter Number 'm' in Range [1 - 100]: " ))
    if n >=1 and n <=100 and m >=1 and m <=100:
        f_Print(n,m)
    else:
        f_InputNums()


def f_Print(n,m):
    for i in range(m):
        print(n, end="")
        

f_InputNums()