package testExamExersices;

import java.util.Scanner;

public class NumsToN {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        for (int num = 1; num <= n; num++) {
            if (num % 3 == 1 || num % 7 == 1){
                System.out.print(num + " ");
            }
        }
    }
}
