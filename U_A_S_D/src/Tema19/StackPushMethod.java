package Tema19;

import java.util.Stack;

public class StackPushMethod {
    public static void pushMethod(Stack<Integer> myStack) {
        System.out.println("Called Stack Push Method: ");
        //Fill the Stack with Numbers [ 0 - 10 ]
        System.out.println("Fill Stack with Numbers [0 - 10]: ");
        for (int i = 0; i <= 10; i++) {
            myStack.push(i); //Create Stack Elements
        }
        System.out.println(myStack);
    }
}