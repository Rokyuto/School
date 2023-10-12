import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tema20 {
    public static void main(String[] args) {
        // Define Lists
        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        int finalListSize;

        Scanner myScanner = new Scanner(System.in);

        String myArr1Input = myScanner.nextLine(); // Input Numbers on 1 row
        String myArr2Input = myScanner.nextLine();

        // Iterate first Numbers Row Input
        for (String arr1Number : myArr1Input.split("\\s")) // Split the Numbers by space
        {
            myList1.add(Integer.parseInt(arr1Number)); // Add each number to list1 in integer
        }

        // Iterate second Numbers Row Input
        for (String arr2Number : myArr2Input.split("\\s")) // Split the Numbers by space
        {
            myList2.add(Integer.parseInt(arr2Number)); // Add each number to list2 in integer
        }

        // Debug Prints
        System.out.println("myList1: " + myList1);
        System.out.println("myList2: " + myList2);

        finalListSize = Math.min(myList1.size(), myList2.size() ); // Get the smaller list size

        for (int i = 0; i < finalListSize; i++) { // Fill finalList
            try { // Try method - try to divide Current myList1 element to Current myList2 element
                finalList.add(myList1.get(i) / myList2.get(i)); // Add to finalList dividend of the current elements from the two initial lists
            }
            catch(Exception MyList2_isZero) { // Catch error when current myList2 element is equal to 0
                finalList.add(0); // Automatically add 0
            }
            System.out.println("Added Element: " + finalList);
        }

        System.out.println("Final Print: " + finalList);

    }
}
