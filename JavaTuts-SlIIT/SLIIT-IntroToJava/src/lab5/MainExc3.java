package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExc3 {
    public static void main(String[] args) {

        int maxSubjects;
        int [] marks = new int[5];
        int total;
        double avg;

        try {
            // 1. Input a value for maxSubjects
            //    from keyboard
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number for max subjects: ");
            maxSubjects = scanner.nextInt();

            // 2. Using a for loop
            //    input marks
            for (int i=0; i<marks.length; i++) {
                System.out.print("Enter mark "+(i+1)+": ");
                marks[i] = scanner.nextInt();
            }

            // 3. Calculate the avg marks

            // 4. Use a try catch block to
            //    prevent the following
            //    run time errors
            //   (a) Input valid integers to the
            //         inputs
            //   (b) ArithmeticException division
            //        by zero
            //   (c) ArrayIndexOutOfBounds
            //         Exception

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This code will be gurrentied to run");
        }
        System.out.println("The end");
    }
}
