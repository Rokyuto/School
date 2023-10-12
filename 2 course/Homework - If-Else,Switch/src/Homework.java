import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        float number1 = Input.nextFloat();
        float number2 = Input.nextFloat();
        char operator = Input.next().charAt(0);
        float Result;
        
         switch (operator) {
            
            case '+': Result = number1 + number2;
            break;

            case '-': Result = number1 - number2;
                break;

            case '*': Result = number1 * number2;
                break;

            case '/': Result = number1 / number2;
                break;

            default: Result = 0;
        }

        System.out.print(number1 + " " + operator + " " + number2 + " = " + Result);

    }
}