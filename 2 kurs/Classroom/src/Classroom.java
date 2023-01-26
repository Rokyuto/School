import java.util.Scanner;

public class Classroom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Колко е дължината на стаята: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Колко е ширината на стаята: ");
        double width = Double.parseDouble(scanner.nextLine());

        double area = (length * width);
        System.out.println("Kвадратурата на стята е: " + area);

        System.out.print("Колко е широк коридора: ");
        double coridor_width = Double.parseDouble(scanner.nextLine());
        System.out.print("Колко е дълъг коридора: ");
        double coridor_length = Double.parseDouble(scanner.nextLine());

        System.out.print("Колко са колоните: ");
        double columns = Double.parseDouble(scanner.nextLine());

        System.out.print("Колко са редиците: ");
        double rows = Double.parseDouble(scanner.nextLine());

        int seats = (int) (columns * ( rows * 2) -
                        (coridor_length * coridor_width));
        System.out.println("Има " + seats + " места");
    }
}