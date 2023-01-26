import java.util.Scanner; // импортваме скенер за използване на клавиатура

public class Main {  //публичен клас
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Да започваме пресмятане на фактуриел"); //
            System.out.print("Въведете число  :"); // казваме на потребителя да въведе числа
            int F = scan.nextInt(); // променлива Ф
            System.out.println("Пресмятане на факториел чрез фор " + F + " е равен на " + FactorialFor(F)); // фалтуриел чрез фор
            System.out.println("Пресмятане на фактуриел чрез рекурсия " + F + " е равен на " + FactorialRecursion(F)); // фактуриел чрез рекурсия
        }
        System.out.print("Край :)"); // съобщение за приключване
    }

    //чрез фор
    public static int FactorialFor(int F) { //публичен клас за фактуриел чрез фор
        int Fact = 1;
        for (int i = 1; i <= F; i++) {
            Fact = Fact * i;
        }
        return Fact;
    }
    //чрез рекурсия
    public static long FactorialRecursion(long F){ // публичен клас за фактуриел чрез рекурсия

        if (F == 0){
            return 1;
        }else{
            return F * FactorialRecursion(F-1);
        }
    }
}
