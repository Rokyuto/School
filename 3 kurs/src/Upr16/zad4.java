package Upr16;

import java.util.ArrayList;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String text1 = Input.nextLine();
        String[] tSplit4 = text1.split("");
        
        ArrayList<String>name = new ArrayList<>();
        ArrayList<String>SurName = new ArrayList<>();
        
        for (int i = 0; i<tSplit4.length; i++) {
            if(i%2 == 0) {
                name.add(tSplit4[i]);
            }else if(i%2 == 1) {
                SurName.add(tSplit4[i]);
            }
        }
        for (int i = name.size() - 1; i>=0; i--) {
            System.out.println(SurName.get(i) + " " + name.get(i));
        }
        Input.close();
    }
}
