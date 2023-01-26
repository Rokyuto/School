n = int(input("Enter List Length: "))
myList = []
sum = 0
maxDiff = 0
number = 0

for i in range(n):
    newNum = int(input())
    myList.append(newNum)
    sum += newNum

average = sum / len(myList)

for element in myList:
    diff = average - element
    if diff > maxDiff:
        maxDiff = diff
        number = element


print("Average: " , average)
print("Element: " , number)
