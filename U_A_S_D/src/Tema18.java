import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tema18 {

    //Variables
    static Scanner myScanner = new Scanner(System.in);
    static HashMap<Integer, HashMap<String, ArrayList<Double>>> Grades_Dictionary = new HashMap<>();
    static int Student;
    static String Subject;
    static double Grade;
    static double avarage;
    static double sum;
    static double Quantity = 0;

    public static void main(String[] args) {

        System.out.println("Enter Students Quantity");
        int Students_Quantity = myScanner.nextInt();
        int CurrentStudent = 0;

        AddStudent(CurrentStudent, Students_Quantity);

        /*while (CurrentStudent < Students_Quantity)
        {
            System.out.println("Enter Student: ");
            Student = myScanner.nextInt();

            Grades_Dictionary.put(Student, new HashMap<>());

            System.out.println("Enter Subjects Quantity: ");
            int Subjects_Quantity = myScanner.nextInt();

            int CurrentSubject = 0;
            while (CurrentSubject < Subjects_Quantity)
            {
                System.out.println("Enter Subject: ");
                Subject = myScanner.next();

                Grades_Dictionary.get(Student).put(Subject, new ArrayList<>());

                System.out.println("Enter Grades Quantity: ");
                int GradesQuantity = myScanner.nextInt(); // Брой оценки
                int currentGrade = 0; // Temp променлива за следене броя оценки до сега

                while (currentGrade < GradesQuantity)
                {
                    System.out.println("Enter Grade: ");
                    Grade = myScanner.nextDouble();
                    currentGrade++;

                    Grades_Dictionary.get(Student).get(Subject).add(Grade);
                }
                CurrentSubject++;
            }
            CurrentStudent++;
        }*/

        System.out.println("Do you want to add Student? ");
        String answer = myScanner.next().toLowerCase();

        if(answer.equals("yes"))
        {
            System.out.println("We're adding student...");
            AddStudent(CurrentStudent, Students_Quantity);
        }
        else
        {
            System.out.println("The Full Dictionary: ");
            System.out.println(Grades_Dictionary);
        }
    }

    public static void AddStudent(int CurrentStudent, int Students_Quantity)
    {
        while (CurrentStudent < Students_Quantity)
        {
            System.out.println("Enter Student: ");
            Student = myScanner.nextInt();

            Grades_Dictionary.put(Student, new HashMap<>());

            System.out.println("Enter Subjects Quantity: ");
            int Subjects_Quantity = myScanner.nextInt();
            int CurrentSubject = 0;

            AddSubject(CurrentSubject, Subjects_Quantity);

            avarage = sum / Quantity;
            System.out.println("Average Success for Student " + Student + " is " + avarage);
            Quantity = 0;
            sum = 0;
            CurrentStudent++;

        }
        System.out.println("The Full Dictionary: ");
        System.out.println(Grades_Dictionary);

    }

    public static void AddSubject(int CurrentSubject, int Subjects_Quantity)
    {
        while (CurrentSubject < Subjects_Quantity)
        {
            System.out.println("Enter Subject: ");
            Subject = myScanner.next();

            Grades_Dictionary.get(Student).put(Subject, new ArrayList<>());

            System.out.println("Enter Grades Quantity: ");
            int GradesQuantity = myScanner.nextInt(); // Брой оценки
            int currentGrade = 0; // Temp променлива за следене броя оценки до сега

            AddGrade(currentGrade, GradesQuantity);

            CurrentSubject++;
        }
        System.out.println("Do you want to add Subject? ");
        String answer = myScanner.next().toLowerCase();
        if (answer.equals("yes"))
        {
            System.out.println("Adding Subject...");
            Subjects_Quantity++;
            AddSubject(CurrentSubject, Subjects_Quantity);
        }

    }

    public static void AddGrade(int currentGrade, int GradesQuantity)
    {
        while (currentGrade < GradesQuantity)
        {
            System.out.println("Enter Grade: ");
            Grade = myScanner.nextDouble();
            sum += Grade;

            Grades_Dictionary.get(Student).get(Subject).add(Grade);

            currentGrade++;
            Quantity++;
        }
        System.out.println("Do you want to add Grade? ");
        String answer = myScanner.next().toLowerCase();
        if (answer.equals("yes"))
        {
            System.out.println("Adding Grade...");
            currentGrade = GradesQuantity;
            GradesQuantity++;
            AddGrade(currentGrade, GradesQuantity);
        }
        else
        {
            System.out.println("Going forward...");
        }

    }
}