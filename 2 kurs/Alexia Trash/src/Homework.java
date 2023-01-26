import java.util.Scanner;

public class Homework {

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int ocenka = Integer.parseInt(scanner.nextLine());
                int i = 5;
                String result = scanner.nextLine();

                switch (result) {
                        case "6":
                                System.out.println("Otlichen 6");
                                break;
                        case "5":
                                System.out.println("Mnogo dobar 5");
                                break;
                        case "4":
                                System.out.println("Dobar 4");
                                break;
                        case "3":
                                System.out.println("Sreden 3");
                                break;
                        case "2":
                                System.out.println("Slab 2");
                                break;
                        default:
                                System.out.println("Error");
                                break;
                }

                System.out.println(result);

        }
}
