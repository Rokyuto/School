package testExamExersices;

import java.util.Arrays;
import java.util.Scanner;

public class compareArrays {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];

        System.out.println("Array 1:");
        for (int i = 0; i < N; i++) {
            System.out.println("Array element " + i);
            fillArray(i,a,myScanner);
        }
        System.out.println("Array 2:");
        for (int i = 0; i < N; i++) {
            System.out.println("Array element " + i);
            fillArray(i,b,myScanner);
        }
        System.out.println("Array 1: " + Arrays.toString(a));
        System.out.println("Array 2: " + Arrays.toString(b));

        if (Arrays.equals(a,b)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }

    }
    static int[] fillArray(int index, int[] arr, Scanner s) {
        arr[index] = s.nextInt();
        return arr;
    }
}
