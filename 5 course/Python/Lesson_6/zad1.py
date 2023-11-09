def calc_squareArea(side):
    return side ** 2


def calc_triangleArea(side, height):
    return (side * height) / 2


def calc_rectangleArea(a, b):
    return a * b


def calc_rhombusArea(side, height):
    return side * height


def calc_trapezoidArea(base1, base2, height):
    return ((base1 + base2) * height) / 2


choice = int(input("Enter Figure to calc area (1-5): "))

if choice == 1:
    print(calc_squareArea(int(input("Enter square side: "))))
elif choice == 2:
    print(calc_rectangleArea(int(input("Enter rectangle width: ")), int(input("Enter rectangle height: "))))
elif choice == 3:
    print(calc_triangleArea(int(input("Enter Triangle Width: ")), int(input("Enter Triangle Height: "))))
elif choice == 4:
    print(calc_rhombusArea(int(input("Enter Rhombus Width: ")), int(input("Enter Rhombus Height: "))))
elif choice == 5:
    print(calc_trapezoidArea(int(input("Enter Trapezoid Base1: ")), int(input("Enter Trapezoid Base2: ")),
                             int(input("Enter Trapezoid Height: "))))


