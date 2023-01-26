package testExamExersices;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
         int n = myScanner.nextInt();
         if (n < 0 || n > 20){
             n = myScanner.nextInt();
         }
         int columnInit = 1;
         int columnEnd = 0;
         for (int row = 1; row <= n; row++) {
             for (int column = columnInit; column <= (columnInit + n) - 1; column++) {
                 System.out.print((column + " "));
                 if (n == 2){
                     columnEnd = column;
                 }
                 else {
                     columnEnd = column - (n / 2);
                 }
             }
             System.out.println();
             columnInit = columnEnd;
         }
    }
}
