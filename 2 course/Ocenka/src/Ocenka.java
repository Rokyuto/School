import java.util.Scanner;

public class Ocenka {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float evaluation = scanner.nextFloat();

        if (evaluation >= 5.5 && evaluation <= 6.0) {
            System.out.println("Отлично!");
        }
        else if (evaluation >= 4.5 && evaluation <= 5.49) {
            System.out.println("Много добър!");
        }
        else if (evaluation >= 3.5 && evaluation <= 4.49) {
            System.out.println("Добър!");
        }
        else if (evaluation >= 3.0 && evaluation <= 3.49) {
            System.out.println("Среден!");
        }
        else if (evaluation >= 2.0 && evaluation <= 2.49){
            System.out.println("Слаб!");
        }
    }
}