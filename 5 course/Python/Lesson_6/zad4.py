numsList = [1, 2, 3, 4, 5, 6, 7, 8, 9]
num = int(input("Enter num: "))


def check_for_num(list, num):
    counter = 0
    for element in range(len(list)):
        if num <= element:
            list[counter] = 0
        counter += 1


check_for_num(numsList, num)
print(numsList)
