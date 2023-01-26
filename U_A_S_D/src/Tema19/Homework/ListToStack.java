package Tema19.Homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class ListToStack {
    public static void main(String[] args) {
        Random myRandom = new Random();

        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        Stack<Integer> myStack = new Stack<Integer>();  
        
        for (int i = 0; i < 5; i++) {
            myArrList.add(myRandom.nextInt(0,10));
        }

        myArrList.stream().forEach(element -> {
            myStack.push(element);
        });

        System.out.println("My ArrayList: " + myArrList);
        System.out.println("My Stack: " + myStack);
        System.out.println();
    }
}
