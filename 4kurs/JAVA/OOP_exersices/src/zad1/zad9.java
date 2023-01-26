package zad1;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose input Type (INT, DOUBLE, STRING)");
        String answer = myScanner.nextLine();
        switch (answer.toLowerCase()){
            case "int":
                int resultI = myScanner.nextInt();
                resultI++;
                System.out.println(resultI);
                break;
            case "double":
                float resultF = myScanner.nextFloat();
                resultF++;
                System.out.println(resultF);
                break;
            case "string":
                String resultS = myScanner.nextLine();
                resultS+="*";
                System.out.println(resultS);
                break;
        }
    }
}