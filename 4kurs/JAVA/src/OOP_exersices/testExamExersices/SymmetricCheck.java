package OOP_exersices.src.testExamExersices;

import java.util.Scanner;

public class SymmetricCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] a = new Integer[4];
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[(a.length - 1 ) - i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
