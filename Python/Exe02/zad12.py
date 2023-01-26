n = int(input())
myList = []
reverseList = []

def f_InputNums():
    newNum = int(input())
    if newNum >=0 and newNum <=9: 
        f_FillList(newNum)  
    else:
        f_InputNums()
        

def f_FillList(newNum):
    myList.append(newNum)
    
    
def f_Loop():
    for i in range(n):
        f_InputNums()
    f_Reverse()
        
        
def f_Reverse():
    for element in myList:
        reverseList.append(10 - int(element))
    f_Print()
        
def f_Print():
    for currentElement in reverseList:
        print(currentElement)
        
f_Loop()