import java.util.Scanner;

public class Biggest_Number {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int b = 0; //biggest number

        for (int i= 0; i< 5; i++){
            System.out.println("Въведете " + i + " число");
            int n = scanner.nextInt(); //числа
            if (n >= b){
                b = n; //проверка, кое число е най-голямо
            }
        }

        System.out.println("Най-голямото число е: " + b);
    }
}
