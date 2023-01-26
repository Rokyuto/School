package OOP_exersices.src.zad1;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = myScanner.nextInt();
            sum += num;
            System.out.println(sum);
        }
    }
}