n = int(input())
myList = []
myList2 = []

for i in range(n):
    myList.append(int(input()))
    
for i in range(n):
    if i % 2 == 1:
        myList2.append( myList[i] + myList[i-1] )
    
print(myList2)