package lab4;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        for (int i=0; i<students.length; i++) {
            students[i] = new Student("Sanuli", "SOfwtare Engineering", "0718899732");
            System.out.println("Next  student no: "+Student.getNextStudentID());
        }

        for (Student student: students) {
            student.print();

        }
    }
}
