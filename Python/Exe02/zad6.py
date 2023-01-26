myList = []
sum = 0

def f_FillList(newNum):
    global sum
    myList.append(newNum)
    if newNum % 3 == 0 and newNum > 15:
        sum += newNum


def f_InputNums():
    newNum = int(input())
    if newNum >=-5000 and newNum <=5000: 
        f_FillList(newNum)  
    else:
        f_InputNums()
       
        
def f_Loop():
    for i in range(7):
        f_InputNums()
    print(sum)

f_Loop()
