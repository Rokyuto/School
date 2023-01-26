public class Lodkar {

    public static void main(String[] args) {

        int lodkar = 7, vulk = 1, koza = 2, zelka = 3;
        int counter = 0;

        while (vulk == 1 && koza == 2 && zelka == 3) {

            for (int i = 1; i <= 3; i++) {

                lodkar = lodkar * 10;

                if (i == 1) {
                    vulk = vulk * 10;
                    System.out.println("Лодкарят пренася вълка ");
                }
                if (i == 2) {
                    koza = koza * 10;
                    System.out.println("Лодкарят пренася козата ");
                }
                if (i == 3) {
                    zelka = zelka * 10;
                    System.out.println("Лодкарят пренася зелката ");
                }

                if (vulk == 1 && koza == 2 && lodkar == 70 || koza == 2 && zelka == 3 && lodkar == 70) {
                    lodkar = lodkar / 10;

                    if (i == 1) {
                        vulk = vulk / 10;
                    }
                    if (i == 2) {
                        koza = koza / 10;
                    }
                    if (i == 3) {
                        zelka = zelka / 10;
                    }

                    System.out.println("Грешен ход ");
                }

                else {
                    counter++;
                    System.out.printf("%d - верен ход :: ", counter);

                    System.out.printf("Вълкът е : %d ", vulk);
                    System.out.printf("Козата е : %d ", koza);
                    System.out.printf("Зелката е : %d ", zelka);
                    System.out.printf("Лодката е : %d ", lodkar);

                    System.out.println();

                    if (counter == 3)
                    {
                        lodkar = lodkar / 10;
                        koza = koza / 10;
                        counter++;

                        System.out.println("Лодкарят връща козата ");

                        System.out.printf("%d - верен ход :: ", counter);
                        System.out.printf("Вълкът е : %d ", vulk);
                        System.out.printf("Козата е : %d ", koza);
                        System.out.printf("Зелката е : %d ", zelka);
                        System.out.printf("Лодката е : %d ", lodkar);

                        System.out.println();

                        for (int j = 1 ; j <= 3; j++)
                        {

                            if (j == 1)
                            {
                                lodkar = lodkar * 10;
                                vulk = vulk * 10;
                                System.out.println("Лодкарят пренася вълка ");
                            }
                            if (j == 2)
                            {
                                lodkar = lodkar / 10;
                                System.out.printf("Лодкарят се връща на левия бряг");

                                System.out.println();
                            }
                            if (j == 3)
                            {
                                lodkar = lodkar * 10;
                                koza = koza * 10;
                                System.out.println("Лодкарят пренася козата ");
                            }

                            counter++;
                            System.out.printf("%d - верен ход :: ", counter);

                            System.out.printf("Вълкът е : %d ", vulk);
                            System.out.printf("Козата е : %d ", koza);
                            System.out.printf("Зелката е : %d ", zelka);
                            System.out.printf("Лодката е : %d ", lodkar);

                            System.out.println();
                        }
                    }
                    else
                    {
                        lodkar = lodkar / 10;
                        System.out.printf("Лодкарят се връща на левия бряг");
                        System.out.println();

                        counter++;
                        System.out.printf("%d - верен ход :: ", counter);

                        System.out.printf("Вълкът е : %d ", vulk);
                        System.out.printf("Козата е : %d ", koza);
                        System.out.printf("Зелката е : %d ", zelka);
                        System.out.printf("Лодката е : %d ", lodkar);

                        System.out.println();
                    }
                }
            }
        }
    }
}