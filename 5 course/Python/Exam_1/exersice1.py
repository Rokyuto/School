def check_tree(tuple):
    for num in tuple:
        if(num % 3 == 0):
            print(num , " : CAN BE DEVIDED BY 3")
        else:
            print(num , " : CAN'T BE DEVIDED BY 3")


myTuple = (5,3,8,9,7)
check_tree(myTuple)