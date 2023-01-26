package Tema22;

import java.util.*;
import myScripts.myStructure;

public class Classwork {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList();
        Object[] myLinkedListToArr = myLinkedList.toArray(); // Temp Object Array to Convert myLinkedList to Object Array

        // Automatize process
        myStructure structure = new myStructure(); // Create myScripts.myStructure Object
        structure.v_StructureRebuild(myLinkedListToArr); // Call StructureRebuild void to Convert myLinkedListToArr to List

        structure.v_ForIterations(5);
        System.out.println("Fill Linked List: " + structure.myList);
        structure.v_Add(5);
        System.out.println("Add Element to Linked List: " + structure.myList);
        structure.v_AddFirst(6);
        System.out.println("Add Element at the First Position of the Linked List: " + structure.myList);
        structure.v_AddLast(7);
        System.out.println("Add Element at the Last Position of the Linked List: " + structure.myList);
        structure.v_AddOnIndex(2,8);
        System.out.println("Add Element (8) at Specific Position (index 2) of the Linked List: " + structure.myList);
        System.out.println("For-each Iterations: " + structure.myList);
        structure.v_ForEachIterations();
        System.out.println("For-each Method: " + structure.myList);
        structure.v_ForEachMethod();
        structure.v_RemoveFirst();
        System.out.println("Removed First Element: " + structure.myList);
        structure.v_RemoveLast();
        System.out.println("Removed Last Element: " + structure.myList);
        structure.v_RemoveIndex(4);
        System.out.println("Removed Element at Specific Index (4): " + structure.myList);
        structure.v_Size();
        structure.v_isEmpty();

    }
}
