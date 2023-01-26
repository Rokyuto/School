package Tema20.Classwork;

import java.util.*;

public class Main {

    public static Queue<Integer> myQueue = new LinkedList<>(); // Define a queue

    public static void main(String[] args) 
    {
        // Call Queue Methods
        f_fillQueue(myQueue);
        f_peekQueue(myQueue);
        f_elementQueue(myQueue);
        f_poolQueue(myQueue);
        f_removeQueue(myQueue);
        f_sizeQueue(myQueue);
        f_clearQueue(myQueue);
        f_isEmptyQueue(myQueue);
    }

    // Fill the queue Function
    public static void f_fillQueue(Queue<Integer> myQueue){
        System.out.println("Filling the Queue");
        for (int i = 0; i < 5; i++) {
            myQueue.add(i); // Add the current iteration number to the queue
        }
        System.out.println("myQueue: " + myQueue);
    }

    // Peek the queue Function
    public static void f_peekQueue(Queue<Integer> myQueue){
        System.out.println("Print First Element of the queue with PEEK: "+ myQueue.peek());
    }

    // Element the queue Function
    public static void f_elementQueue(Queue<Integer> myQueue){
        System.out.println("Print First Element of the queue with ELEMENT: "+ myQueue.element()); // Element will trow exception only when Queue is Empty
    }

    // Poll the queue Function
    public static void f_poolQueue(Queue<Integer> myQueue) {
        System.out.println("Poll Element: " + myQueue.poll()); // Print and Remove the First Element of the queue with Poll
        System.out.println("myQueue: " + myQueue);
    }

    // Remove the queue Function
    public static void f_removeQueue(Queue<Integer> myQueue) {
        System.out.println("Remove Element: "+ myQueue.remove()); // Print and Remove the First Element of the queue with Remove
        System.out.println("myQueue: " + myQueue);
    }

    // Size the queue Function
    public static void f_sizeQueue(Queue<Integer> myQueue){
        System.out.println("myQueue Size: " + myQueue.size()); // Print myQueue size
    }

    // Clear the queue Function
    public static void f_clearQueue(Queue<Integer> myQueue){
        myQueue.clear();
        System.out.println("Clearing Queue: " + myQueue);
    }

    // isEmpty the queue Function
    public static void f_isEmptyQueue(Queue<Integer> myQueue){
        System.out.println("Is Queue Empty: " + myQueue.isEmpty());
    }

}
