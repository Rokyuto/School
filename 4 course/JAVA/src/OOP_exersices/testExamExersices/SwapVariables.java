package OOP_exersices.src.testExamExersices;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double num1 = myScanner.nextDouble();
        double num2 = myScanner.nextDouble();

        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
