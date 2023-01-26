package ClassesObjects;

public class ClassesObjectsLesson {
    // Student Template
    class Student {
        // Student Parameters
        String name;
        String facNum;
        int group;
        double grades;
        // Student Class' Constructor || Constructor auto set the data which we enter when create Object
        Student(String name, String facNum, int group, double grades){
            this.name = name;
            this.facNum = facNum;
            this.group = group;
            this.grades = grades;
        }
    }

    // Create Objects based on Student Class || Object is class reference
    Student firstStudent = new Student("Viktor","11Б",1,6);
    Student secondStudent = new Student("Ivan","11A",2,5);

}
