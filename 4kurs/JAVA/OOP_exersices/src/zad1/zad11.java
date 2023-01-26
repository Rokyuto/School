package zad1;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int biggestNum = 0;
        int smallestNum = 0;
        int average;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = myScanner.nextInt();
            if (num > biggestNum){
                biggestNum = num;
            }
            if (num < smallestNum)
            {
                smallestNum = num;
            }
            sum += num;
        }
        average = sum / n;
        System.out.println(biggestNum);
        System.out.println(smallestNum);
        System.out.println(average);
        System.out.println(sum);
    }
}