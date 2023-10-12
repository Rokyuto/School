import java.util.Random;

public class Lili {
    public static void main(String[] args){

        Random MyRandom = new Random();

        int min = 1000;
        int max = 9999;
        int range = max - min + 1;

        for (int i = 0; i < 4; i++){
            // int rand = (int)(Math.random() * range) + min;
            int rand = MyRandom.nextInt(range) + min;

            System.out.println(rand);
        }
    }
}