package OOP_exersices.CustomExceptions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Kniga kniga = new Kniga(10, 2503, "Vazov", "Pod Igoto", 0.15);
        Televizori televizor = new Televizori(250, 1507, "LG", "mv32", 150, 0.09);

        Scanner scanner = new Scanner(System.in);
        float cena = scanner.nextFloat();
        if (cena < 0) {
            throw new PriceException();
        }
        kniga.setCena(cena);
        System.out.println(kniga.getCena());
        System.out.println(kniga.checkPromo());
    }
}
