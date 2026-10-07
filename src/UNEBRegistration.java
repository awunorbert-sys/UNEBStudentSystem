public class UNEBRegistration {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   UNEB STUDENT REGISTRATION");
        System.out.println("=================================");
        System.out.println();

        // Initialize examination configuration
        ExaminationConfig config = new ExaminationConfig();

        // Create first student
        System.out.println("Creating first student...");

        Student student1 = new Student(
                "John Doe",
                "Kampala High School"
        );

        student1.displayStudentDetails();

        // Create second student
        System.out.println("Creating second student...");

        Student student2 = new Student(
                "Mary Namukasa",
                "Gayaza High School"
        );

        student2.displayStudentDetails();

        System.out.println("Registration process completed.");
    }
}