import java.util.Scanner;

public class Sum_Inputed_Numbers {

    public static void main(String[] args){

        int Sum = 0;

        Scanner InputScanner = new Scanner(System.in);

        System.out.println("Въведи брой числа за калкулиране:");

        int NumberQuantity = InputScanner.nextInt();

        System.out.println("Въведи числата за калкулиране:");

        for (int i = 1 ; i <= NumberQuantity ; i++) {

            int CurrentNumber = InputScanner.nextInt();
            Sum += CurrentNumber;
        }
        System.out.println("Краен резултат: " + Sum);
    }
}