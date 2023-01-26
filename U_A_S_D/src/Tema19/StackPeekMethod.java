package Tema19;

import java.util.Stack;

public class StackPeekMethod {
    public static void peekMethod(Stack<Integer> myStack) {

        System.out.println("Called Stack Peek Method:");

        System.out.println("Stack: " + myStack);
        System.out.println("Last Element: " + myStack.peek());
    }
}