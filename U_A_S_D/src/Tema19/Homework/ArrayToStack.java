package Tema19.Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class ArrayToStack {
    public static void main(String[] args) {
        // Create a Array with 5 random int Numbers
        int[] myArr = new Random().ints(5,0,10).toArray();
        
        //Define Stack
        Stack<Integer> myStack = new Stack<Integer>();
        
        // Fill myStack by stream, Lambda and for each
        Arrays.stream(myArr).forEach(currentElement -> {
            myStack.add(currentElement); // Add current Element from the Array
        });
        
        // Prints
        System.out.println("My Array: " + Arrays.toString(myArr));
        System.out.println("My Stack: " + myStack);
        System.out.println();
    }
}
