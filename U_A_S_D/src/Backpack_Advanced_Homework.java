import java.util.Arrays;
import java.util.Scanner;

public class Backpack_Advanced_Homework {

    public static void main(String[] args) {

        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Въведете вместимост на раницата (в килограми):");
            int Backpack_Weight = myScanner.nextInt();

            System.out.println("Въведете брой предмети (цяло число):");
            int Items_Total = myScanner.nextInt();

            while (Items_Total < 2 || Items_Total > 5) { //Проверка дали броя предмети отговаря на условията от заданието
                System.out.println("Въведете брой предмети (цяло число) в интервала от 2 до 5:");
                Items_Total = myScanner.nextInt();
            }

            int[] Weight_Arr = new int[Items_Total]; // Тегло за всеки предмет
            int[] Item_Usage = new int[Items_Total]; //Води статистика кой предмет колко пъти е използван
            int[] Item_Prize = new int[Items_Total]; //Цена на всеки предмет

            int Biggest_Prize = 0; // Най-висока стойност на предмет
            int k;
            int Total_Prize = 0; //Обща сума на предметите в раницата

            System.out.println("Въведи за всеки предмет тегло (в кг):");

            for (int i = 0; i < Items_Total; i++) {
                System.out.println("Предмет № " + (i + 1));

                int Weight = myScanner.nextInt(); //Въвеждаме тегло на съответния предмет
                while (Weight < 2) //Проверка дали теглото е по-малко от 2, условие от заданието
                {
                    System.out.println("Предметът трябва да е с тегло минумум 2кг: ");
                    System.out.println("Предмет № " + (i + 1));
                    Weight = myScanner.nextInt();
                }
                Weight_Arr[i] = Weight; //Пълним масива с теглото на съответния предмет
            }

            System.out.println("Въведи за всеки предмет стойност (в лв):");
            for (k = 0; k < Items_Total; k++) {
                System.out.println("Предмет № " + (k + 1));

                int Prize = myScanner.nextInt(); //Въвеждаме цена на съответния предмет
                Item_Prize[k] = Prize; //Пълним масива с цената на съответния предмет

                if (Item_Prize[k] >= Biggest_Prize) { //Проверка кой предмет е с най-висока стойност
                    Biggest_Prize = Item_Prize[k];
                }
            }

            for (int j = 0; j < Items_Total; j++) {
                Item_Usage[j] = 0; //Пълним арея с използвани предмети
            }

            int current_Item = 0;
            int Total_Weight = 0;

            while (Total_Weight < Backpack_Weight && current_Item < Items_Total) {
                if (Weight_Arr[current_Item] + Total_Weight <= Backpack_Weight) {
                    if (Item_Prize[current_Item] >= Biggest_Prize) {
                        Item_Usage[current_Item] = Item_Usage[current_Item] + 1; //Увеличава броя пъти на използване на съответния елемент
                        Total_Prize = Total_Prize + Item_Prize[current_Item];

                        System.out.println("Опит с " + (current_Item + 1) + " предмет: " + Arrays.toString(Item_Usage));
                        Total_Weight = Total_Weight + Weight_Arr[current_Item]; // Увеличава общата маса на предметите с масата на съответния елемент

                        System.out.println("Тегло на предметите до тук: " + Total_Weight + " кг от " + Backpack_Weight + " кг общо");
                        System.out.println("Обща цена на предметите до тук: " + Total_Prize);
                    } else {
                        current_Item += 1; //Преминава към следващия предмет
                    }
                } else {
                    current_Item += 1; //Преминава към следващия предмет
                    Biggest_Prize = Item_Prize[current_Item];
                }
            }

                if (Total_Weight == Backpack_Weight) {
                    System.out.println("Има предмети за точно представяне на теглото на раницата");
                } else {
                    System.out.println("Няма предмети за точно представяне на теглото на раницата");
                }
        }
    }
}