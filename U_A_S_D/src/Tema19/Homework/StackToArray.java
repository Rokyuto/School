package Tema19.Homework;

import java.util.Arrays;
import java.util.Stack;

public class StackToArray {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>(); // My Stack

        for (int i = 0; i <= 10; i++) {
            myStack.push(i); //Create Stack Elements
        }

        Object[] myArr = myStack.toArray(); // Create Array by Converting myStack to Array

        // Prints
        System.out.println("My Array: " + Arrays.toString(myArr));
        System.out.println("My Stack: " + myStack);
        System.out.println();
    }
}
