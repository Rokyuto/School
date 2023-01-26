package Tema19;

import static Tema19.Object.myStack;

public class tema19 {

    public static void main(String[] args) {

        StackPushMethod.pushMethod(myStack);
        System.out.println();

        StackPopMethod.popMethod(myStack);
        System.out.println();

        StackSearchMethod.searchMethod(myStack);
        System.out.println();

        StackPeekMethod.peekMethod(myStack);
        System.out.println();

        StackIterateMethod.iterateMethod(myStack);
        System.out.println();

        StackClearAndCheckMethods.clearAndCheckMethod(myStack);
        System.out.println();

    }
}