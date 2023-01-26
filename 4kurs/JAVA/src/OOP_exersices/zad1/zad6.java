package OOP_exersices.src.zad1;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double num1 = myScanner.nextDouble();
        double num2 = myScanner.nextDouble();
        double num3 = myScanner.nextDouble();

        if (num1 > num2 && num1 > num3 && num2 > num3)
        {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
        else if (num1 > num3 && num2 > num1 ) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
        else if (num3 > num1 && num1 > num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }
        else
        {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}