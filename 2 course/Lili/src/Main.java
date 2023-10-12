import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;

        String sabirane = "1. Sabirane";
        String izvajdane = "2. Izvajdane";
        String end = "3. END";

        System.out.println(sabirane);
        System.out.println(izvajdane);
        System.out.println(end);

        int izbor = scanner.nextInt();

        if(izbor == 1) {
            result = a + b;
            System.out.println(result);
        }

        else if (izbor == 2) {
            result = a-b;
            System.out.println(result);
        }
        else if(izbor == 3) {
            result = a*b;
            System.out.println(result);
        }
        else{
            result = 0;
        }

    }
}