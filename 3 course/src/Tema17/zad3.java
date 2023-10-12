import java.util.ArrayList;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> arr = new ArrayList<>();


        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(2);
        arr.add(2);


        int number = 0;
        int repetitions = 0;
        int currentrep = 0;


        for (int i = 0; i < arr.size(); i++) {
            currentrep = 0;
            int current = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if(current == arr.get(j)){
                    currentrep++;
                }
            }
            
            if(currentrep > repetitions){
                repetitions = currentrep;
                number = current;
            }
        }


        for (int i = 0; i < repetitions; i++) {
            System.out.print(number + " ");
        }
    }
}
