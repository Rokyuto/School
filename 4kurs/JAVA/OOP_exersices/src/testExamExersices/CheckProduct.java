package testExamExersices;

import java.util.Scanner;

public class CheckProduct {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double num1 = myScanner.nextDouble();
        double num2 = myScanner.nextDouble();
        double num3 = myScanner.nextDouble();
        String product = "";

        if (num1 > 0 && num3 > 0) {
            if (num2 < 0 ){
                product = "-";
            }
            else if (num2 > 0){
                product = "+";
            }
        }
        else if (num1 < 0 && num3 > 0 || num1 > 0 && num3 < 0 ){
            if (num2 < 0 ){
                product = "+";
            }
            else if (num2 > 0){
                product = "-";
            }
        }
        else if(num1 == 0 || num2 == 0 || num3 == 0){ // num1 = 0
            product = "0";
        }
        System.out.println(product);

    }
}
