package testExamExersices;

import java.util.Scanner;

public class printNumToN {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int positiveNum = myScanner.nextInt();
        if (positiveNum < 0)
        {
            positiveNum = myScanner.nextInt();
        }
        System.out.println(positiveNum);
        for (int i = 1; i <= positiveNum; i++)
        {
            System.out.print(i + " ");
        }
        for (int i = positiveNum - 1; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
}
