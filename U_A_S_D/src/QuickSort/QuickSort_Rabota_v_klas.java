package QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort_Rabota_v_klas {

    public static void main(String[] args)
    {
        //Create array
        System.out.print("Array Quantity: ");
        int arr_size = new Scanner(System.in).nextInt();

        //Fill the array with stream
        int[] myArr = new Random().ints(arr_size,1,100).toArray();

        //Print the array BEFORE SORT
        System.out.print("Array BEFORE SORT: ");
        Arrays.stream(myArr).forEach(x -> System.out.print(x + " , ")); //Print every element
        System.out.println();

        //Call the Sort method
        QuickSort(myArr,0,myArr.length-1);

        //Print the array AFTER SORT
        System.out.print("Array AFTER SORT: ");
        Arrays.stream(myArr).forEach(x -> System.out.print(x + " , ")); //Print every element
        System.out.println();
    }

    static void QuickSort(int[] myArr, int first, int last)
    {
        if(first < last)
        {
            //Create two sub-arrays using Partition Method
            int childs = Partition(myArr,first,last);

            //Quick Sort for the start array
            QuickSort(myArr, first, childs-1);

            //Quick Sort for the end array
            QuickSort(myArr, childs+1,last);
        }
    }

    private static int Partition(int[] myArr,int low, int high)
    {
        int Pivot = myArr[high]; //Set the last element for Pivot

        int element = low - 1; // Set place for Partiotion index

        for (int i = low; i <= high - 1; i++)
        {
            if (myArr[i] < Pivot) //Check if current element is smaller than the last(Pivot)
            {
                element++;
                //Switch positions
                int temp = myArr[i];
                myArr[i] = myArr[element];
                myArr[element] = temp;
            }
        }

        //Update element value
        element++;

        //Update Pivot - move to the next element after the last element is on the right place
        int temp = myArr[element];
        myArr[element] = Pivot;
        myArr[high] = temp;

        return element;
    }
}