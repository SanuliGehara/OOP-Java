package tut4;

import java.util.Scanner;

public class Student implements IDisplay, IInput{
    int studentId;
    String name;

    public void print() {
        System.out.println("\nStudentID: "+ this.studentId + "\tName: " + this.name);
    }

    public void printDetails() {
        System.out.println("\nStudent ID: " + this.studentId);
        System.out.println("Name: " + this.name);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student ID: ");
        int stId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name  = scanner.nextLine();

        this.studentId = stId;
        this.name = name;
    }
}
