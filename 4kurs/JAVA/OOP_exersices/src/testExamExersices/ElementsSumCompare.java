package testExamExersices;

import java.util.Scanner;

public class ElementsSumCompare {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = myScanner.nextInt();
        }
        int sum = myScanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    System.out.println(arr[i] + " , " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("Cant find nums");
    }
}
