def sum(num1, num2):
    return num1 + num2


def subst(num1, num2):
    return num1 - num2


def multi(num1, num2):
    return num1 * num2


def divide(num1, num2):
    return num1 / num2


number1 = int(input("Enter num1: "))
number2 = int(input("Enter num2: "))
operator = input("Enter operator: ")

if operator == "+":
    print(sum(number1, number2))
elif operator == "-":
    print(subst(number1, number2))
elif operator == "*":
    print(multi(number1, number2))
elif operator == "/":
    print(divide(number1, number2))
