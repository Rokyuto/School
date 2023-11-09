num = int(input("Enter Number: "))


def checkPalindrom(number):
    reversedNum = str(number)[::-1]
    if str(number) == reversedNum:
        return 1
    else:
        return 0


print(checkPalindrom(num))
