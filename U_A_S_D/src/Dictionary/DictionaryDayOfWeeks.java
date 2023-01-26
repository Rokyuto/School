package Dictionary;

import java.util.Hashtable;
import java.util.Scanner;

public class DictionaryDayOfWeeks {

    public static void main(String[] args)
    {
        Hashtable<Integer, String> DaysDictionary = new Hashtable<>(); //Create Hashtable with the Days of the Week || Key = Integer ; Value = String
        try (Scanner myScanner = new Scanner(System.in)) {
            DaysDictionary.put(1,"Monday");
            DaysDictionary.put(2,"Tuesday");
            DaysDictionary.put(3,"Wednesday");
            DaysDictionary.put(4,"Thursday");
            DaysDictionary.put(5,"Friday");
            DaysDictionary.put(6,"Saturday");
            DaysDictionary.put(7,"Sunday");

            System.out.println(DaysDictionary);
            System.out.println("Print DaysDictionary Size: " + DaysDictionary.size());

            boolean OK = false;
            int input = 0;

            while (!OK)
            {
                System.out.println("Enter number from 1 to 7");
                input = myScanner.nextInt();
                if (input < 1 || input >7)
                {
                    OK = false;
                }
                else
                {
                    OK = true;
                }
            }

            System.out.println(DaysDictionary.get(input));
        }

    }
}