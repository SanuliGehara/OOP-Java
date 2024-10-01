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
                int holder = scanner.nextInt();
                if (holder < 0 ||holder > 100) {
                    throw new RuntimeException("Mark Must be between 0 to 100");
                } else {
                    marks[i] = holder;
                    System.out.println(marks[i]);
                }
            }

            // 3. Calculate the avg marks
            total = 0;
            for (int mark: marks) {
                total += mark;
            }
            double average = total/maxSubjects;
            System.out.println("Average of the marks out of " + maxSubjects+ " subjects: " + average);

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
            System.out.println("Invalid Input type. Please use correct input format!");
        }catch (ArithmeticException e) {
            System.out.println("Can not divided by zero!");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This code will be gurrentied to run");
        }
        System.out.println("The end");
    }
}
