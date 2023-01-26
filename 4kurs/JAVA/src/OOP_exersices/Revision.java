package OOP_exersices.src;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wanna use the program?");
        String answerUseProgram = scanner.nextLine();
        if (answerUseProgram.toLowerCase(Locale.ROOT).equals("yes")) {
            ArrayList<String> questions = new ArrayList<>();
            ArrayList<String> answers = new ArrayList<>();

            questions.add("Who are you?");
            questions.add("How old are you?");
            questions.add("Where are you living?");

            for (String question : questions) {
                System.out.println(question);
                String answer = scanner.nextLine();
                answers.add(answer);
            }

            for (String ans : answers) {
                System.out.println(ans);
            }
        }
    }
}
