package zad1;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        float[] myArr = new float[10];
        float sum = 0;
        for (int i = 0; i < 10; i++) {
            myArr[i] = myScanner.nextFloat();
            sum += myArr[i];
        }
        System.out.println(sum);
    }
}
