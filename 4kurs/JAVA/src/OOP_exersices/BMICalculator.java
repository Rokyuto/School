package OOP_exersices.src;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        printIntroduction();
        Scanner myScanner = new Scanner(System.in);
        getBMI(myScanner);
    }
    public static void printIntroduction(){
        System.out.println("The Program will calculate user BMI");
    }

    public static void getBMI(Scanner Scanner){
        double userWeight = ( Scanner.nextInt() ) * 2.2046;
        double userHeight = ( Scanner.nextInt() ) * 0.3937;
        System.out.println("weight: " + userWeight);
        System.out.println("height: " + userHeight);
        bmiFor(userWeight,userHeight);
    }

    public static void bmiFor(double weight,double height){
        double bodyMassIndex = weight * 703 / (height * height);
        System.out.println(bodyMassIndex);
        getStatus(bodyMassIndex);
    }

    public static void getStatus(double bodyMassIndex){
        String status = "";
        if (bodyMassIndex <= 18.5) {
            status = "underweight";
        } else if (bodyMassIndex > 18.5 && bodyMassIndex <= 25) {
            status = "normal";
        } else if (bodyMassIndex > 25 && bodyMassIndex <= 30) {
            status = "overweight";
        } else if (bodyMassIndex > 30) {
            status = "obese";
        }
        System.out.println(status);
        reportResults(1, bodyMassIndex,status);
    }

    public static void reportResults(int id, double bmiIndex, String status){
        System.out.println("User with " + id + " has BMI= " + Math.round(bmiIndex) + " Status: " + status);
    }
}