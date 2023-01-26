n = int(input())
myList1 = []
myList2 = []
myList3 = []

for i in range(n * 2):
    if i < n:
        myList1.append(int(input()))
    else:
        myList2.append(int(input()))

def Reverse(list):
    list.reverse()
    return list

Reverse(myList2)

myList3.extend(myList1)
myList3.extend(myList2)
print(myList3)
    