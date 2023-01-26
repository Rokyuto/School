import math

bool = "Не"
num = int(input())
NumSquareRoot = math.sqrt(num)
if NumSquareRoot == int(NumSquareRoot):
    bool = "Да"
else:
    bool = "Не"

print(bool)