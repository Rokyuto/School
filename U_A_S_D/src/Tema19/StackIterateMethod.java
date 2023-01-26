package Tema19;

import java.util.Stack;

public class StackIterateMethod {
    public static void iterateMethod(Stack<Integer> myStack)
    {
        System.out.println("Called Stack Iterate Method with Lambda:");
        myStack.stream().forEach(element -> {
            System.out.println("Current Element: " + element);
        });
    }
}