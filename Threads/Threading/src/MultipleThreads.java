import java.util.Random;
import java.util.Scanner;

class Student implements Runnable{
    @Override
    public void run() {
        String name = "Sanu";
        int age = 19;

        System.out.println("Name: " + name+" Age: " + age);

    }
}

class Teacher implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello I am a teacher");
    }
}
public class MultipleThreads {
    public static void main(String[] args) {
        for (int i =0; i< 5; i++){

            Teacher t = new Teacher();
            Thread tThread = new Thread(t);
            System.out.println("Created T");

            Student s = new Student();
            Thread sThread = new Thread(s);
            System.out.println("Created S");

            tThread.start();
            sThread.start();
        }
    }
}
