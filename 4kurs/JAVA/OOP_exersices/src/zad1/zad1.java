package zad1;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int num = myScanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}