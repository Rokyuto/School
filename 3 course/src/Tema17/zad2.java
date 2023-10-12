import java.util.ArrayList;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(5);
        arr.add(7);
        arr.add(8);
        arr.add(2);
        arr.add(1);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > max){
                max = arr.get(i);
            }
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        System.out.println(min + " " + max);
    }
}
