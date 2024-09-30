package casestudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static double minorHighest, projectHighest, finalExcHighest;

    public static void addStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.print("Enter Student No: ");
        String studentId = sc.next();

        System.out.print("Enter Minor Assignment 1 Marks: ");
        double minorAssignment1 = sc.nextDouble();
        System.out.print("Enter Minor Assignment 2 Marks: ");
        double minorAssignment2 = sc.nextDouble();
        System.out.print("Enter Project Design Marks: ");
        double projectDesign = sc.nextDouble();
        System.out.print("Enter Project Implementation Marks: ");
        double projectImplementation = sc.nextDouble();
        System.out.print("Enter Final Exam Marks: ");
        double finalExam = sc.nextDouble();

        Student student = new Student(studentId, name, minorAssignment1, minorAssignment2, projectDesign, projectImplementation,
                finalExam);

        student.calculateOveralMark();
        student.calculateGrade();
        students.add(student);
    }

    public static void displayAllStudents() {
        for (Student std : students) {
            std.displayStudentDetails();
            System.out.println("---------------------------------------");
        }
    }

    public static double calculateMinorCompAverage() {
        double Minortotal = 0;
        for (Student std : students) {
            Minortotal += std.getMinorCompMark();
        }

        return Minortotal/students.size();
    }

    public static double calculateProjectCompAverage() {
        double projectTotal = 0;
        for (Student std : students) {
            projectTotal += std.getProjectMark();
        }

        return projectTotal/students.size();
    }

    public static double calculateFinalExamAverage() {
        double FinalExamTot = 0;
        for (Student std : students) {
            FinalExamTot += std.getFinalExamMark();
        }

        return FinalExamTot/students.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int number = input.nextInt();

        for (int i=0; i<number; i++) {
            System.out.println("Enter details for student " + (i+1));
            addStudent();
            System.out.println("_______________________________________");
        }

        displayAllStudents();
        System.out.println("Average of Minor Assignment: " + calculateMinorCompAverage());
        System.out.println("Average of Project component: " + calculateProjectCompAverage());
        System.out.println("Average of Final Exam: " + calculateFinalExamAverage());
    }
}
