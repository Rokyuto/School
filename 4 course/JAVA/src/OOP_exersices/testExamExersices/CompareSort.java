package OOP_exersices.src.testExamExersices;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CompareSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] a = new Integer[4];
        Integer[] b = new Integer[4];
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }
        int i = 0;
        for(int current : a){
            b[i] = current;
            i++;
        }

        Arrays.sort(b, Collections.reverseOrder());

        switch(Arrays.compare(a,b)){
            case -1, 1:
                System.out.println("No");
                break;
            case 0:
                System.out.println("Yes");
                break;
        }
    }
}
