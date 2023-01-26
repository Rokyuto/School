package MergeSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static MergeSort.MergeSortMethod.divide;

public class Main {

    public static void main(String[] args) {

        System.out.println("Merge Sort");

        System.out.println("Колко елемента ще има масива");
        int N = new Scanner(System.in).nextInt();
        System.out.println();

        int[] ArrayToSort = new Random().ints(N,1,100).toArray();

        System.out.println("Масива преди сортиране");
        System.out.println(Arrays.toString(ArrayToSort));

        divide(ArrayToSort,0,ArrayToSort.length - 1);

        System.out.println("Масива след сортиране");
        Arrays.stream(ArrayToSort).forEach(element -> System.out.print(element + " , "));

    }
}