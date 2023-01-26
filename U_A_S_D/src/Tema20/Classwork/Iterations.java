package Tema20.Classwork;

import java.util.*;

public class Iterations {
    
    public static Queue<Integer> myQueue = new LinkedList<>(); // Define a queue
    public static void main(String[] args) {
        Main.f_fillQueue(myQueue); // Call Filling Funtion from Queue Methods class

        f_IteratorQueue();
        f_ForQueue(myQueue);
        f_StreamQueue(myQueue);
    }

    public static void f_IteratorQueue() {
        System.out.println("Iterate myQueue with Iterator: ");

        Iterator myIterator = myQueue.iterator(); // Create Iterator Object for my Queue
        while (myIterator.hasNext()) { // While the Queue has next Element
            System.out.println("Current Element: " + myIterator.next()); // Print the current Element
        }
        System.out.println();
    }

    public static void f_ForQueue(Queue<Integer> queue){
        System.out.println("Iterate myQueue with For Loop: ");

        for (Integer element : queue) { // ForEach element in the queue
            System.out.println("Element: " + element); // Print the queue element
        }
        System.out.println();
    }

    public static void f_StreamQueue(Queue<Integer> queue){
        System.out.println("Iterate myQueue with Stream: ");
        queue.stream().forEach(element -> { // Convert the queue to Stream Object and iterate each element
            System.out.println("Current Element: " + element); // Print the element
        });
    }

}
