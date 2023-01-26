import java.util.*;

public class Bubble_Sort {

    static int[] myArr;

    public static void main(String[] args) {

        try (Scanner MyInput = new Scanner(System.in)) {
            Random MyRand = new Random();

            System.out.print("Въведете размер на масива : ");
            int Arr_Size = MyInput.nextInt();

            myArr = new int[Arr_Size];

            for (int i = 0; i < myArr.length; i++) {
                myArr[i] = MyRand.nextInt(100); //Пълним масива със случайни числа [0 - 99]
            }

            System.out.println("Преди сортиране с FOR: " + Arrays.toString(myArr));

            BubbleSortFor();

            System.out.println("След сортиране с FOR: " + Arrays.toString(myArr));

            for (int i = 0; i < myArr.length; i++) {
                myArr[i] = MyRand.nextInt(100); //Пълним масива със случайни числа [0 - 99]
            }
        }
        System.out.println();

        System.out.println("Преди сортиране с DO-WHILE: " + Arrays.toString(myArr));

        BubbleSortDo();

        System.out.println("След сортиране с DO-WHILE: " + Arrays.toString(myArr));
    }

    public static void BubbleSortFor() { //метод за сортиране чрез FOR
        int n = myArr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j]; //Променлива за размяна на дввата съседни елемента
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
    }

    public static void BubbleSortDo() {
        int n = myArr.length - 1;
        boolean swapped;
        n--;
        do {
            swapped = false;
            n--;
            for (int i = 0; i <= n; i++) {
                if (myArr[i] > myArr[i + 1]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;

                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}
