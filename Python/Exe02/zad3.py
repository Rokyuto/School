n = int(input("Enter List Length: "))
myList = []
sum = 0

for i in range(n):
    newNum = int(input())
    myList.append(newNum)
    sum += newNum

average = sum / len(myList)

print(average)