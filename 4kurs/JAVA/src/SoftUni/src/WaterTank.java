import java.util.Scanner;

public class WaterTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        int tankCapacity=255;
        int sumLiters=0,currentIterationLiters=0;

        for (int i = 0; i < n; i++) {
            currentIterationLiters= Integer.parseInt(scanner.nextLine());
            sumLiters += currentIterationLiters;
            if (sumLiters >tankCapacity) {
                sumLiters -= currentIterationLiters;
            }
        }
        System.out.println("Insufficient capacity");
        System.out.println(sumLiters);
    }
}

