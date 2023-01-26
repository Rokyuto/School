import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Random_Search {
    public static void main(String[] args) {
        try (Scanner MyScanner = new Scanner(System.in)) {
            Random MyRandom = new Random();

            int[] myArray = new int[25]; //Създаваме масив, в който ще търсим
            byte[] Taken = new byte[25]; //Масив, който следи кое число от myArray е проверено ; 0 - непроверен , 1 - проверен
            int number = 0; // Бройка на проверките, направени до момента
            int count = 0; //Показва колко елемента от масива Taken e проверен
            int Seek_Number ; //Числото, което търсим
            boolean end = false; //Променлива, за край на проверката

            System.out.println("Моля, въведете търсеното число:");
            Seek_Number = MyScanner.nextInt();

            for (int i = 0; i <= myArray.length - 1; i++) { //Пълним масива myArray
                myArray[i] = MyRandom.nextInt(100); //Генерираме рандом число между 0 и 99
            }

            while (!end) {
                number++;
                int i = MyRandom.nextInt(25); //Рандом индекс от myArray за проверка

                if (myArray[i] == Seek_Number) {
                    System.out.println("Има намерено съвпадение на индекс [ " + i + " ]");
                    Taken[i] = 1;
                    break; //Прекратява търсенето, ако е намерено съвпадение
                } else {
                    Taken[i] = 1;
                    count = 0;

                    for (byte b : Taken) {
                        if (b == 1) {
                            count++;
                        }
                    }

                    if (count == 25) {
                        end = true;
                        System.out.println("Няма открити съвпания");
                    }
                }
            }

            System.out.println("Направени итерации: " + number);

            for (byte b : Taken) {
                if (b == 1) {
                    count++;
                }
            }

            System.out.println("Брой проверени индекси: " + count);

            System.out.println("Моят масив: " + Arrays.toString(myArray));
            System.out.println("Битовия масив: " + Arrays.toString(Taken));
        }

    }
}
