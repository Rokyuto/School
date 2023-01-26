import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(3);
        arr.add(4);
        arr.add(8);
        arr.add(5);
        arr.add(7);
        arr.add(5);
        arr.add(2);
        arr.add(1);

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}