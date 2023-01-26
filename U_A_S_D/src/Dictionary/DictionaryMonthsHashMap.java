package Dictionary;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMonthsHashMap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Hashtable<Integer, String> months = new Hashtable<>();
            months.put(1, "Януари");
            months.put(2, "Февруари");
            months.put(3, "Март");
            months.put(4, "Април");
            months.put(5, "Май");
            months.put(6, "Юни");
            months.put(7, "Юли");
            months.put(8, "Август");
            months.put(9, "Септември");
            months.put(10, "Октомври");
            months.put(11, "Ноември");
            months.put(12, "Декември");
            System.out.print("Въведете месец или номер на месец: ");
            String input = sc.nextLine();
            for (Map.Entry<Integer, String> a : months.entrySet()) {
                if (input.equals(a.getValue())) {
                    System.out.println(a.getKey());
                    break;
                }
                if (inputKey(input) == a.getKey()) {
                    System.out.println(a.getValue());
                    break;
                }
            }
        }
    }

    public static int inputKey(String stringToCheck) {
        Scanner sc = new Scanner(stringToCheck.trim());
        if (!sc.hasNextInt(10)) return -1;
        return sc.nextInt(10);
    }
}