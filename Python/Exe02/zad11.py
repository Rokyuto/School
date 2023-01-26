n = int(input())
myList1 = []
myList2 = []
myList3 = []

for i in range(n * 2):
    if i < n:
        myList1.append(int(input()))
    else:
        myList2.append(int(input()))


for i in range(n):
    myList3.append( myList1[i] + myList2[i])

print(myList3)