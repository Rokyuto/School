package Tema19;

import java.util.Stack;

public class StackSearchMethod {
    public static void searchMethod(Stack<Integer> myStack) {
        System.out.println("Called Search Method");

        System.out.println("Index of Element 5: " + myStack.search(5) );
        System.out.println("Index of Element 0" + myStack.search(5) );
        System.out.println("Index of Element 10: " + myStack.search(10) );

        System.out.println();
    }
}