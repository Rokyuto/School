import java.util.Scanner;

public class figure {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int score = 0;
        if(n > 4){
            score = n;
        }

        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");
        }
        System.out.print("\\ ");

        for (int i = 0; i < n / 2; i++) {
            System.out.print("");
        }

        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");
        }
        System.out.print("\\ ");
        System.out.println();

        for (int i = 0; i < n - 3; i++) {
            System.out.print("|");
            for (int i2 = 0; i2 < n * 2 - 3; i2++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("|");
        for (int i = 0; i < n / 2 ; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n / 2 ; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        System.out.print("\\");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");
        }
        System.out.print("/");

        for (int i = 0; i < score / 2 - 2; i++) {
            System.out.print(" ");
        }

        System.out.print("\\");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");
        }
        System.out.print("/");
    }
}