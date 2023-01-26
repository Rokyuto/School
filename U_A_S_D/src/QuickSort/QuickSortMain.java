package QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static QuickSort.QuickSortMethods.QuickSort;

public class QuickSortMain
{
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
}