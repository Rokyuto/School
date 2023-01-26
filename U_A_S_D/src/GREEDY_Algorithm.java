import java.util.Scanner;

public class GREEDY_Algorithm {
    public static void main(String[] args){

        try (Scanner MyScanner = new Scanner(System.in)) {
            int[] nominal = {50,20,10,5,2,1};

            System.out.print("Въведете сума (в лева): ");
            double sum = MyScanner.nextDouble();
            sum = sum * 100; // Конвертираме сумата в стотинки
            System.out.println("Сума в стотинки: " + sum);

            int count_coins = 0, index_nominal = 0;

            while (sum > 0){
                if (sum - nominal[index_nominal] >= 0){ // Проверка дали номинала се побира в сумата
                    count_coins++;
                    System.out.println(sum + " - " + nominal[index_nominal] + " - номинал № " + count_coins);
                    sum = sum - nominal[index_nominal]; // Изваждаме номинала от сумата

                    System.out.println("Остатък: " + sum);
                }
                else
                {
                    index_nominal++;
                    if (index_nominal > nominal.length - 1){
                        System.out.println();
                        System.out.println("Нямате достатъчно номинали. Не е представен остатък (в стотинки)" + sum);
                        break;
                    }
                }
            }
            System.out.println();
            System.out.println("Общия брой на номиналите е: " + count_coins);
        }
    }
}
