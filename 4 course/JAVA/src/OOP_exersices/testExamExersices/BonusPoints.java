package OOP_exersices.src.testExamExersices;

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int points = myScanner.nextInt();

        switch (points) {
            case 1, 2, 3 -> System.out.println("Result points: " + points * 10);
            case 4, 5, 6 -> System.out.println("Result points: " + points * 100);
            case 7, 8, 9 -> System.out.println("Result points: " + points * 1000);
            default -> System.out.println("Invalid result");
        }

    }
}
