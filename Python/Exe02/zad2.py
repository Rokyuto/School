n = int(input("Enter List Length: "))
myList = []

for i in range(n):
    newNum = int(input())
    myList.append(newNum)
    
myList.sort()
SecondBiggestNum = myList[len(myList) - 2]

print(SecondBiggestNum)