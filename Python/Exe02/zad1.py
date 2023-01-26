n = int(input("Enter List Length: "))
myList = []
biggestNum = 0

for i in range(n):
    newNum = int(input())
    myList.append(newNum)
    if newNum > biggestNum: biggestNum = newNum

print(biggestNum)