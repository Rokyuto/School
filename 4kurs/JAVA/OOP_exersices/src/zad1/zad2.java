package zad1;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();
        int result = Math.max(num1,num2);
        System.out.println(result);
    }
}