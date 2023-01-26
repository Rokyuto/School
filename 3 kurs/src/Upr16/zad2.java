package Upr16;

import java.util.Arrays;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String text = Input.nextLine();
        String[] textSplit = text.split("");
        System.out.println(Arrays.toString(textSplit));
    }
}
