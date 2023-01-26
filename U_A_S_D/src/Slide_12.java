import java.util.Scanner;

public class Slide_12 {

    public static void main(String[] args) {
        try (Scanner MyScanner = new Scanner(System.in)) {
            System.out.println("Въведете брой елементи в масива");
            int ArrayElementsQuantity = MyScanner.nextInt();

            int[] MyArray = new int[ArrayElementsQuantity];

            for (int i = 0; i < ArrayElementsQuantity; i++)
            {
                System.out.println("Въведете елемент № %d" + i);
                MyArray[i] = MyScanner.nextInt();
            }
            int CurrentBiggestNumber = MyArray[0];
            for (int j = 0 ; j < ArrayElementsQuantity ; j++)
            {
                if (MyArray[j]> CurrentBiggestNumber)
                {
                    CurrentBiggestNumber = MyArray[j];
                }
            }
            System.out.printf("Най-големия елемент е : %d", ArrayElementsQuantity);
        }

        System.out.println();
        System.out.println("Довиждане!");
    }
}
