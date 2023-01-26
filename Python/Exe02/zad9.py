n = int(input())
myList = []
median = 0


def f_FillList():
    for i in range(n):
        newNum = int(input())
        myList.append(newNum)
    f_FindMedian()
        
        
def f_FindMedian():
    if len(myList) % 2 == 0:
        median = ( float(myList[int(len(myList) / 2 - 1)]) + float(myList[int(len(myList) / 2)]) ) / 2
    else:
        median = myList[int(len(myList) / 2)]
        
    print(median)
    

f_FillList()