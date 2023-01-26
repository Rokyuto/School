package Dictionary;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class DictionaryMonths {

    public static void main(String[] args)
    {
        Hashtable<Integer, String> MonthsDictionary = new Hashtable<>(); //Create Hashtable with the Days of the Week || Key = Integer ; Value = String
        try (Scanner myScanner = new Scanner(System.in)) {
            MonthsDictionary.put(1,"January");
            MonthsDictionary.put(2,"February");
            MonthsDictionary.put(3,"March");
            MonthsDictionary.put(4,"April");
            MonthsDictionary.put(5,"May");
            MonthsDictionary.put(6,"June");
            MonthsDictionary.put(7,"July");
            MonthsDictionary.put(8,"August");
            MonthsDictionary.put(9,"September");
            MonthsDictionary.put(10,"October");
            MonthsDictionary.put(11,"November");
            MonthsDictionary.put(12,"December");

            System.out.println(MonthsDictionary);
            System.out.println("Print MonthsDictionary Size: " + MonthsDictionary.size());

            System.out.println("Enter search by 1. Key | 2. Value");

            int input = myScanner.nextInt();

            //Search bt Key
            if (input == 1)
            {
                Enumeration<Integer> itemsKeys = MonthsDictionary.keys();
                Enumeration<String> itemsValues = MonthsDictionary.elements();

                System.out.println("Enter Month Number: ");
                String month_number = myScanner.next();

                while (itemsKeys.hasMoreElements())
                {
                    String currentKey = itemsKeys.nextElement().toString(); //Get current Key in String type
                    String currentValue = itemsValues.nextElement(); //Get value on the current Key

                    if (currentKey.equals(month_number)) //If key = entered number
                    {
                        System.out.println(currentValue);
                    }
                }
            }

            //Search by Value
            if (input == 2)
            {
                Enumeration<Integer> itemsKeys = MonthsDictionary.keys();
                Enumeration<String> itemsValues = MonthsDictionary.elements();

                System.out.println("Enter Month Name: ");
                String month_value = myScanner.next();

                while (itemsValues.hasMoreElements())
                {
                    String currentKey = itemsKeys.nextElement().toString(); //Get current Key in String type
                    String currentValue = itemsValues.nextElement(); //Get value on the current Key

                    if (currentValue.equals(month_value)) // If value = entered Month
                    {
                        System.out.println(currentKey); //Print Value Key
                    }
                }
            }
        }

    }
}
