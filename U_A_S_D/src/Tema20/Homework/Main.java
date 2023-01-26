package Tema20.Homework;

public class Main {
    public static void main(String[] args) {
        myQueue queue = new myQueue(3);
                System.out.println("Initial Queue:");
               // print Queue elements 
               queue.qPrint(); 
           
                // inserting elements in the queue 
                queue.qAdd(10); 
                queue.qAdd(30); 
                queue.qAdd(50); 

                System.out.println();

                // print Queue elements 
                System.out.println("Queue after Enqueue Operation:");
                queue.qPrint(); 
                System.out.println();
           
                // print front of the queue 
                queue.qPeek(); 

                queue.qAdd(90); 
           
                // print Queue elements 
                queue.qPrint(); 
           
                queue.qPool(); 
                queue.qPool(); 
                System.out.printf("\nQueue after two remove operations:");
                System.out.println();
           
                // print Queue elements 
                queue.qPrint();
                System.out.println();
           
                // print front of the queue
                System.out.println("Front Queue Element:");
                queue.qPeek(); 
    } 
}