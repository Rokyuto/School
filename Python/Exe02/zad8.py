n = int(input())
averageArit = 0
count = 0
sum = 0
numsList = []
myList = []

for i in range(n):
    newNum = int(input())
    sum += newNum
    myList.append(newNum)
    
averageArit = sum / n
for element in myList:
    if element > averageArit:
        count += 1

print(count)