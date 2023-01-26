def f_InputCalcNum():
    sumEven = 0
    sumOdd = 0
    n = int(input())
    for i in range(n):
        m = int(input())
        if m % 2 == 0:
            sumEven += m
        else:
            sumOdd += m
    print("Сума четни:" , sumEven )
    print("Сума нечетни:" , sumOdd )

f_InputCalcNum()