package Tema17;

import java.util.*;

public class Tema17 {
    public static void main(String[] args) {
        // Create and Fill the array with Random Stream Numbers
        int[] myArr = new Random().ints(20, 1, 10).toArray();

        //Print the array
        System.out.println(Arrays.toString(myArr));

        //Create Dictionary with Counters || Size - 10 Elements
        HashMap<Integer, Integer> Counters = new HashMap<>(10);

        //Call Method to Apply for each Key in the Dictionary Value = 0
        ApplyInitialDictionaryValue(Counters);

        //Call Method to check the Repeating for each Element in the array
        Counting(myArr, Counters);

        //Call Method to Print the Counter
        Print(Counters);
    }

    public static void ApplyInitialDictionaryValue(HashMap<Integer, Integer> Counters)
    {
        // Create loop for each element in the Dictionary to set the value to 0
        for (int CurrentKey = 1; CurrentKey <= 10; CurrentKey++) {
            Counters.put(CurrentKey, 0); //Set the value on the Current Key to 0
        }
    }

    public static void Counting(int[] myArr, HashMap<Integer, Integer> Counters)
    {
        //Create loop to check how many times each elements is repeating
        for (int currentElement : myArr) {
            int counter = Counters.get(currentElement) + 1; //Increment the Counter for the Number which is Repeating

            Counters.put(currentElement, counter); // Update the Value on the Current Element / Key
        }
    }

    public static void Print(HashMap<Integer, Integer> Counters)
    {
        for (Map.Entry<Integer, Integer> items : Counters.entrySet()) {
            System.out.printf("Element : " + items.getKey() + " се повтаря " + items.getValue() + " пъти.");
            System.out.println();
        }
    }

}