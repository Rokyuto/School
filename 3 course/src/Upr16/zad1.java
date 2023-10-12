package Upr16;

import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int quantity = Input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>(quantity);
        for(int i=0; i<quantity; i++) {
            int nub = Input.nextInt();
            numbers.add(nub);        
        }
        numbers.forEach(element -> System.out.printf("%d,", element));
    }
}
