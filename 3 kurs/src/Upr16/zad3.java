package Upr16;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String t = Input.nextLine();
        String[] tSplit1 = t.split("");
        for (int i = tSplit1.length-1; i>=0; i--)
        {
           System.out.print(tSplit1[i]);
        }
    }
}
