package Tema19;

import java.util.Stack;

public class StackClearAndCheckMethods {
    public static void clearAndCheckMethod(Stack<Integer> myStack) {
        System.out.println("Called Stack Clear and Check Method:");

        System.out.println("Stack: " + myStack);
        System.out.println("Is Empty: " + myStack.isEmpty());

        myStack.clear();

        System.out.println("Stack after Clear" + myStack);
        System.out.println("Is Empty: " + myStack.isEmpty());
    }
}