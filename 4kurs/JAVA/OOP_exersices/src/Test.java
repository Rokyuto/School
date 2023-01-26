public class Test {
    public static void main(String[] args) {
        Course teacher1Course = new Course("English");  // Create Course English
        Teacher teacher1 = new Teacher("Stefanov","xxxx.....",teacher1Course);

        Course teacher2Course = new Course("OOP lectures");
        Teacher teacher2 = new Teacher("Tomov","xxxx.....",teacher2Course);

        Course teacher3Course = new Course("");
        Teacher teacher3 = new Teacher("","",teacher3Course);

        // Set Variables Data by setter methods
        teacher3Course.setCourseName("OOP exercises");
        teacher3.setName("Danov");
        teacher3.setEgn("xxxx.....");
        teacher3.setTeacherCourse(teacher3Course);

        // Print Teachers' Names
//        teacher1.sayName();
//        teacher2.sayName();
//        teacher3.sayName();

        System.out.println(teacher1.getTeacherName() + " " + teacher1.getTeacherEgn() + " " +  teacher1.getTeacherCourse());
        System.out.println(teacher2.getTeacherName() + " " + teacher2.getTeacherEgn() + " " +  teacher2.getTeacherCourse());
        System.out.println(teacher3.getTeacherName() + " " + teacher3.getTeacherEgn() + " " +  teacher3.getTeacherCourse());

    }
}

class Course {

    // Fields
    private String courseName;

    // Constructor
    Course(String courseName){ // Parameters
        this.courseName = courseName;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

}

class T_Person {

    // name and egn are FIELDS here
    private String name; // Private - visible only in this class
    private String egn;

    public T_Person() { // Constructor without parameters
        // Here we initialize these variables
        this.name = "";
        this.egn = "";
    }

    public T_Person(String n, String e) { // Constructor with parameters
        this.name = n;
        this.egn = e;
    }

    public static void sayHi() { // static - can be called without object, if it's called in other class, must be called by the parent class
        System.out.println("Hello");
    }

    public void sayName() { // Can be called by object who inheritance this class
        System.out.println("My name is " + getName());
    } // this.name

    public String getName() { // Class Getter -> when called will return object name (because it's not static)
        return this.name;
    }

    public void setName(String n) { // Class Setter -> when called will set object name (because it's not static)
        this.name = n;
    }

    public String getEgn() {
        return this.egn;
    }

    public void setEgn(String e) {
        this.egn = e;
    }
}

class Teacher extends T_Person{ // extends Person means that Teacher class inherit Person class

    // Fields
    private Course teacherCourse; // Object type Course

    // Constructor
    Teacher(String teacherName, String egn ,Course teacherCourse){ // Params
        super(teacherName, egn); // Get Access to Person class -> use when inherit class
        this.teacherCourse = teacherCourse;
    }

    public String getTeacherName() {
        return super.getName();
    }

    public void setTeacherName(String teacherName) {
        super.setName(teacherName);
    }

    public String getTeacherEgn() {
        return super.getEgn();
    }

    public void setTeacherEgn(String teacherEgn) {
        super.setEgn(teacherEgn);
    }

    public String getTeacherCourse() {
        return teacherCourse.getCourseName();
    }

    public void setTeacherCourse(Course teacherCourse) {
        this.teacherCourse = teacherCourse;
    }
}


