import java.util.Arrays;
import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        // 1. Define array with Random Elements
        int[] myArray = new Random().ints(10, 1, 50).toArray();

        System.out.println(Arrays.toString(myArray));

        // 2. Print elements with FOR
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " , ");
        }
        System.out.println();

        // 3. For Each Print for Even Numbers , WAY 1
        System.out.println("Print EVEN Numbers");
        for (int temp_element : myArray) {
            if (temp_element % 2 == 0) // Even Number
            {
                System.out.println(temp_element);
            }
        }

        // 4. For Each Print for ODD Numbers , WAY 2
        System.out.println("Print ODD Numbers");
        for (int temp_element : myArray) {
            if (temp_element % 2 == 1) // Odd Number
            {
                System.out.println(temp_element);
            }
        }

        // 5. Print Min an Max Element in the Array, using Sort Method
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("Min : " + myArray[0]);
        System.out.println("Max : " + myArray[myArray.length - 1]);

        // 6. ForEach + Lambda + Filter Elements
        // Lambda - Navigate Variable to Function / Logic
        // In the Function we work with the Variable
        System.out.println("Numbers in Range [20 - 40], using forEach and Lambda");
        Arrays.stream(myArray).forEach(each_element ->
        {
            if (each_element >= 20 && each_element <= 40) {
                System.out.println(each_element);
            }
        });

        System.out.println("Numbers in Range [20 - 40], using filter and Lambda");
        System.out.println(Arrays.toString(
                        Arrays.stream(myArray).filter(each_element -> (each_element >= 20 && each_element <= 40)).toArray()
                )
        );

    }
}