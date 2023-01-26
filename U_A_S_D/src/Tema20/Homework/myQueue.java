package Tema20.Homework;

public class myQueue {
    private static int front, rear, capacity; 
    private static int queue[]; 
    
    // Create Queue Size
    myQueue(int size) { 
        front = rear = 0; 
        capacity = size; 
        queue = new int[capacity];
    } 

    // Add Item to the Queue
    void qAdd(int item)  { 
        // check if the queue is full
        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
   
        // Add element to the queue
        else { 
            queue[rear] = item; 
            rear++; 
        } 
        return; 
    } 

    // Print First Element
    void qPeek(){
        int i; 
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
   
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf(" %d = ", queue[i]); 
        } 
        return;
    }

    // Remove Element
    void qPool(){
        // check if queue is empty 
        if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return; 
        } 
   
        // shift elements to the right by one place uptil rear 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
   
       
            // set queue[rear] to 0
            if (rear < capacity) 
                queue[rear] = 0; 
   
            // decrement rear 
            rear--; 
        } 
        return; 
    }

    // Print Queue Size
    void qSize(){
        if (front == rear) { 
            System.out.printf("Queue is Empty\n"); 
            return; 
        } 
        System.out.printf("Queue Size: %d\n", capacity);  
        return;
    }

    // Print if the queue is empty
    void qIsEmpty(){
        // check if queue is empty 
        if (front == rear) { 
            System.out.printf("\nTrue\n"); 
            return; 
        } 
    }

    // Print queue
    void qPrint(){
        System.out.print(queue[front]);
    }

}
