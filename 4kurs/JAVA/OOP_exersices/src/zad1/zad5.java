package zad1;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int biggestNum = 0;
        for (int i = 0; i < 3; i++) {
            int num = myScanner.nextInt();
            if (biggestNum < num )
            {
                biggestNum = num;
            }
        }
        System.out.println(biggestNum);
    }
}