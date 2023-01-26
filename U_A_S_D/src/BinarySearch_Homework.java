import java.util.*;

public class BinarySearch_Homework {

    public static void main(String[] args){

        System.out.println("Намислете си число за отгатване");

        try (Scanner MyInput = new Scanner(System.in)) {
            Random MyRangom = new Random();

            int ProgramNumber = MyRangom.nextInt(1000); //Числото на програмата
            int PlayerNumber = 0; //Числото на играча
            int MaxNumber = 1000, MinNumber = 1; //Горана и долна граница за генериране на число

            int counter = 1; //Брой итерации

            while (PlayerNumber != ProgramNumber)
            {
                System.out.println("Предположение на играча №" + counter + ": [ " + MinNumber + " - " + MaxNumber + " ]" ); //Принтира брой итерация, и range-а

                PlayerNumber = MyInput.nextInt(); //Число предположение на Играча

                if (PlayerNumber > ProgramNumber ) //Ако числото на Играча е по-голямо от числото на Програмата
                {
                    System.out.println("НАДОЛУ");
                    MaxNumber = PlayerNumber; //Променя горната граница да е предположеното от Играча число
                }
                else if (PlayerNumber < ProgramNumber ) //Ако числото на Играча е по-малко от числото на Програмата
                {
                    System.out.println("НАГОРЕ");
                    MinNumber = PlayerNumber; //Променя долната граница да е предположеното от Играча число
                }
                counter++;
            }

            if (ProgramNumber == PlayerNumber) //Ако числата на програмата и Играча съвпадат
            {
                System.out.println("ПОЗНАХТЕ числото на програмата");
            }
        }
    }
}
