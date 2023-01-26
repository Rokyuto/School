import java.util.Random;
import java.util.Scanner;
import java.util.Arrays; //Work with Arrays

public class BubbleSort_Homework {

    static int[] myArray;
    static int[] EvenArr;
    static int[] OddArr;
    static int countEven = 0;
    static int countOdd = 0;

    public static void main(String[] args) {

        try (Scanner MyScanner = new Scanner(System.in)) {
            Random MyRandom = new Random();

            System.out.print("Въведете брой елемнти в масива: ");
            int Arr_Elements_Quantity = MyScanner.nextInt();

            myArray = new int[Arr_Elements_Quantity]; //Set myArray Size

            for (int Arr_Element = 0; Arr_Element < myArray.length; Arr_Element++) {
                myArray[Arr_Element] = MyRandom.nextInt(100); //Fill myArray with Random between 0 and 99
            }
        }
        divideArrays(); //Декларираме размери на четния и нечетния масив

        //Принтираме масивите преди да бъдат сортирани
        System.out.println("Преди Сортиране: ");
        System.out.println("MyArray: " + Arrays.toString(myArray));
        System.out.println("Even Number Array: " + Arrays.toString(EvenArr));
        System.out.println("Odd Number Array: " + Arrays.toString(OddArr));

        sortAscending(); //Сортиране на четните числа по нарастващ ред
        sortDescending(); // Сортиране на нечетните числа по намаляващ ред

        // РАЗПЕЧАТВАНЕ НА ТРИТЕ МАСИВА СЛЕД СОРТИРАНЕ::
        System.out.println();
        System.out.println("След сортиране: ");
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.println("Even Number Array: " + Arrays.toString(EvenArr));
        System.out.println("Odd Number Array: " + Arrays.toString(OddArr));

    }

    static void divideArrays() {
        // преброяване (чрез for-each цикъл, подобен е на for-цикъл)
        for (int temp_int : myArray) {
            if (temp_int % 2 == 0) // ако е четен
            {
                countEven++;
            } else // ако не е четен
            {
                countOdd++;
            }
        }

        EvenArr = new int[countEven]; // инициализирам четния масив
        OddArr = new int[countOdd];  // инициализирам нечетния масив

        // разделяне
        int count_all = 0;
        int count_even = 0;
        int count_odd = 0;

        while (count_all < myArray.length) {
            if (myArray[count_all] % 2 == 0) // ако е четен
            {
                EvenArr[count_even] = myArray[count_all]; // Добавяме четният елемент от MyArr към четния масив
                count_even++;
            } else // ако е нечетен
            {
                OddArr[count_odd] = myArray[count_all]; // Добавяме нечетният елемент от MyArr към нечетния масив
                count_odd++;
            }
            count_all++;
        }
    }

    // Сортиране на myEvenArr
    static void sortAscending() {
        int n = EvenArr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (EvenArr[j] > EvenArr[j + 1]) {
                    int temp = EvenArr[j]; //Променлива за размяна на дввата съседни елемента
                    EvenArr[j] = EvenArr[j + 1];
                    EvenArr[j + 1] = temp;
                }
            }
        }
    }

    // Сортиране на myOddArr
    static void sortDescending() {
        int n = OddArr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (OddArr[j + 1] > OddArr[j]) {
                    int temp = OddArr[j+1]; //Променлива за размяна на дввата съседни елемента
                    OddArr[j + 1] = OddArr[j];
                    OddArr[j] = temp;
                }
            }
        }
    }

}