n = int(input())
m = int(input())

myList1 = []
myList2 = []
myList3 = []

for i in range(n):
    myList1.append(int(input()))

for j in range(m):
    myList2.append(int(input()))
  
  
def Reverse(list):
    list.reverse()
    return list

Reverse(myList1)
Reverse(myList2)
    
myList3.extend(myList1)
myList3.extend(myList2)

print(myList3)