package Tema19;

import java.util.Stack;

public class StackPopMethod {
    public static void popMethod(Stack<Integer> myStack) {

        System.out.println("Called Stack Pop Method:");

        for (int i = 0; i <3; i++)
        {
            System.out.println("Removing Last Element: " + myStack.get(myStack.lastElement())); // Print The Last Stack Element which will be Removed
            myStack.pop(); // Remove the Last Element from the Stack
            System.out.println(myStack);
        }

    }
}