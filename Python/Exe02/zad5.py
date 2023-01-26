n = int(input("Enter List Length: "))
myList = []
sum = 0

def f_FillList(newNum):
    global sum
    myList.append(newNum)
    sum += abs(newNum)


def f_InputNums():
    newNum = float(input())
    if newNum >=-4999.99 and newNum <=4999.99: 
        f_FillList(newNum)  
    else:
        f_InputNums()
       
        
def f_Loop():
    for i in range(n):
        f_InputNums()
    print(sum)

f_Loop()