package OOP_exersices.src.zad1;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double x = myScanner.nextDouble();
        double y = myScanner.nextDouble();
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        if (x > y){
            double tempVar = x;
            x = y;
            y = tempVar;
            System.out.println("After Slap:");
            System.out.println("X: " + x);
            System.out.println("Y: " + y);
        }
    }
}