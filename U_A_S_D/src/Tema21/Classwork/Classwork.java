package Tema21.Classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classwork {

    public static void main(String[] args) {

        // Define ArrayList
        //List<Integer> myList = new ArrayList<>();
        // Fill/Add Element to the List
        /*for (int i = 0; i < 5; i++) {
            myList.add(i);
        }*/
        //System.out.println("myList on Fill: " + myList);

        // Enum tests -----------------------------------------------------------------------------------------------

        // Create Array List connected with CarsEnum
        /*
        List<CarsEnum> myList = new ArrayList<CarsEnum>();

        myList.add(CarsEnum.Dodge); // Fill myList manually
        System.out.println(myList);
        */

        /* Define Array List connected with CarsEnum
        // myList will be filled with CarsEnum Values at the moment of creation
        List<CarsEnum> myList = Arrays.asList(CarsEnum.values()); // Convert CarsEnum values to List and fill myList
        System.out.println(myList); */

        // -------------------------------------------------------------------------------------------------------------

        List<CarsEnum> CarsEnumList = Arrays.asList(CarsEnum.values()); // Define Help List with CarsEnum Values
        List<String> myList = new ArrayList<>();// Define ArrayList
        System.out.println("myList on Creation: " + myList);

        // FIll myList
        for (CarsEnum car : CarsEnumList) {
            myList.add(car.toString()); // Fill ArrayList with String of cars from CarsEnum
            //System.out.println(car);
        }
        System.out.println("myList after Fill" + myList);
        //Add Element to myList
        myList.add("OPEL");
        System.out.println("myList after adding Element OPEL" + myList);

        // Change the Value on the First Index of the List to 10
        myList.set(0,"KIA");
        System.out.println("myList after change: " + myList);

        // Remove Element by Index
        myList.remove(myList.size() - 1); // Get the Last myList Index by List size
        System.out.println("myList after removing Last Index Element: " + myList);

        // Remove Element by Value
        myList.remove(myList.indexOf("Mazda"));
        System.out.println("myList after removing Last Element: " + myList);

        // Iterations
        System.out.println("myList Iteration with FOR: ");
        for (int currentIndex = 0; currentIndex < myList.size(); currentIndex++) {
            System.out.println("Current Element: " + myList.get(currentIndex)); // Get myList Value by Index
        }

        System.out.println("myList Iteration with FOR-EACH: ");
        for (String currentElement: myList) { // For-each element in the List
            System.out.println("Current Element: " + currentElement);
        }

        System.out.println("myList Iteration with Stream: ");
        myList.stream().forEach(currentElement -> System.out.println("Current Element: " + currentElement));

        // Print the Size of the ArrayList
        System.out.println("myList Size: " + myList.size());

        //Check if the ArrayList is Empty
        System.out.println("Is myList Empty: " + myList.isEmpty());

        // Clear the ArrayList
        System.out.println("Clearing myList");
        myList.clear();
        System.out.println("myList after Clear: " + myList);

        System.out.println("Is myList Empty: " + myList.isEmpty());
    }
}
