public class Student {

    String studentName;
    String schoolName;

    // STATIC INITIALIZATION BLOCK
    static {
        System.out.println("=== STUDENT STATIC BLOCK ===");
        System.out.println("Student class is being initialized.");
        System.out.println();
    }

    // INSTANCE INITIALIZATION BLOCK
    {
        System.out.println("=== INSTANCE INITIALIZATION BLOCK ===");

        System.out.println("Preparing student object...");
        System.out.println();
    }

    // CONSTRUCTOR
    public Student(String studentName, String schoolName) {
        System.out.println("=== CONSTRUCTOR ===");

        this.studentName = studentName;
        this.schoolName = schoolName;

        System.out.println("Student object has been created.");
        System.out.println();
    }

    // METHOD TO DISPLAY DETAILS
    public void displayStudentDetails() {
        System.out.println("----- STUDENT DETAILS -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("School: " + schoolName);
        System.out.println();
    }
}