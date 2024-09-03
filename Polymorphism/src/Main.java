import overriding.Person;
import overriding.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Overriding part - 1 \tOverloading part - 2 \nEnter 1 or 2: ");
        int choice = new Scanner(System.in).nextInt();

        if (choice == 1) {overriding();} else {overloading();}
    }

    //Call Overriding part
    public static void overriding () {
        Person p1 = new Person("Sanuli");
        p1.getInfo();
        System.out.println();

        Student s1 = new Student("Helani", "01");
        s1.getInfo();
        System.out.println();

        // RUNTIME POLYMORPHISM (DYNAMIC BINDING)
        Person p2 = new Student("Melani", "02");
        p2.getInfo();  // From Student or Person?

        // DOWN CASTING
        Student s2 = (Student) p2;
    }

    public static  void overloading () {}
}