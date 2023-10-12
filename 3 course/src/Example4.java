import java.util.Scanner;

public class Example4 {

    public static void main(String[] args){

        Scanner MyScanner = new Scanner(System.in);

        int Columns_Rows_Quantity = MyScanner.nextInt();

        System.out.print("+");
        for (int i = 0 ; i <= Columns_Rows_Quantity - 1 ; i++) {
            System.out.print("-");
        }
        System.out.print("+");

        System.out.println();

        for (int v = 0; v <= Columns_Rows_Quantity - 1; v++ ) {

            System.out.print("|");

            for (int j = 0; j <= Columns_Rows_Quantity - 1; j++) {
                System.out.print("-");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("+");
        for (int i = 0 ; i <= Columns_Rows_Quantity - 1 ; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}