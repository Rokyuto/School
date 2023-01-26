package myScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// The Entire Idea is to use this class when Study\Work with different types of Data Structures and
// using their functions and methods at the same way to automatize the process and do NOT write the same code again and again and again
// in different Projects/Studies

public class myStructure {

    public Object[] myArr; // Temp Object Array
    public ArrayList<Object> myList = new ArrayList<>(); // Working Object ArrayList "myList"

    // Function to get the defined Structure, when the void is called, and Rebuild/Convert it to ArrayList
    public void v_StructureRebuild(Object[] myObject) {
        myArr = myObject; // Update myArr to be equal to defined myObject when the void is Called
        myList.addAll(Arrays.stream(myArr).toList()); // Fill myList with myArr elements

        //return myList; // Return and save myList Information
    }

    // Function to Add Number, defined when the void is called, to the List
    public void v_Add(Object obj) {
        myList.add(obj);
    }

    // Function to Add Number, defined when the void is called, at the First Position of the List
    public void v_AddFirst(Object firstObj) {
        myList.add(0, firstObj);
    }

    // Function to Add Number, defined when the void is called, at the Last Position of the List
    public void v_AddLast(Object lastObj) {
        myList.add(myList.size(), lastObj);
    }

    // Function to Add Number to the List at specific Position/Index , defined when the void is called
    public void v_AddOnIndex(Integer index, Object Obj) {
        myList.add(index, Obj);
    }

    // Function to Iterate the List with FOR LOOP
    public void v_ForIterations(Integer size) {
        for (int i = 0; i < size; i++) {
            myList.add(i);
        }
    }

    // Function to Iterate the List with FOREACH LOOP
    public void v_ForEachIterations() {
        for (Object Element : myList) {
            System.out.println("Current Element: " + Element);
        }
    }

    // Function to Iterate the List with FOREACH LOOP with Lambda
    public void v_ForEachMethod() {
        myList.forEach(System.out::println);
    }

    // Function to Remove the First Index from the List
    public void v_RemoveFirst() {
        System.out.println("Before Remove First Element: " + myList);
        myList.remove(0);
    }

    // Function to Remove the Last Index from the List
    public void v_RemoveLast() {
        System.out.println("Before Remove Last Element: " + myList);
        myList.remove(myList.size() - 1);
    }

    // Function to Remove Specific Index, defined when the void is called, from the List
    public void v_RemoveIndex(Integer index) {
        System.out.println("Before Remove Element on Specific Index: " + myList);
        myList.remove(index);
    }

    // Print the Size of the List
    public void v_Size() {
        System.out.println("Size: " + myList.size());
    }

    // Print is the List Empty
    public void v_isEmpty() {
        System.out.println("Is Empty: " + myList.isEmpty());
    }

}
