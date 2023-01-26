package testExamExersices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatedNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        ArrayList<Integer> repeatedNums = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i-1]){
                repeatedNums.add(a[i-1]);
            }
        }
        System.out.println("Repeated Nums are: " + repeatedNums);

    }

}
