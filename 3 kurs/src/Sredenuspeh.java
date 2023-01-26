import java.util.Arrays;
import java.util.Scanner;

public class Sredenuspeh {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // приготвяме се за въвеждане на данни

        double n; // променлива за проверките
        double uspeh = 0; // общ успех
        double[] ocenki = new double[5]; // деклариране на масив с 5 елемента
        double VisokaOcenka = 0;
        double NiskaOcenka = 0;

        System.out.println("Въведете оценките:");
        for (int i = 0; i < ocenki.length; i++) {
            do {
                n = scan.nextDouble(); // Въвеждаме оценки
            } while (n < 2 || n > 6);
            ocenki[i] = n; // пълним масива
            uspeh += ocenki[i]; // оновяваме стойността на общия успех
            System.out.println("Оценката е: " + ocenki[i]);// принритаме оценките

        }
        for (int v = 0; v < ocenki.length; v++)
        {
            for (int j = v + 1; j < ocenki.length; j++)
            {
                double tmp = 0;
                if (ocenki[v] > ocenki[j])
                {
                    tmp = ocenki[v];
                    ocenki[v] = ocenki[j];
                    ocenki[j] = tmp;
                }
            }
        }

        double sredenuspeh = uspeh / 5;

        System.out.println("Средният успех на ученика е: " + sredenuspeh); // Принтираме среден успех
        System.out.println("Най - висока оценка на ученика е : " + ocenki[4]); // Принтираме най - висока оценка
        System.out.println("Най - ниска оценка на ученика е: " + ocenki[0]);// Принираме най-ниска оценка
        System.out.println(Arrays.toString(ocenki));

    }
}