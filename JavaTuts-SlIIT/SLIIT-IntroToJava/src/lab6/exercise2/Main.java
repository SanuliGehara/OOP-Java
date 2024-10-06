package lab6.exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxSubjects;
        int [] marks = new int[5];
        int total;
        double avg;

        try {
            // 1. Input a value for maxSubjects
            //    from keyboard
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value for max subjects: ");
            maxSubjects = scanner.nextInt();

            // 2. Using a for loop
            //    input marks
            for (int i=0; i<maxSubjects; i++) {
                System.out.print("Enter marks for subject "+ (i+1)+ ": ");
                marks[i] = scanner.nextInt();
            }

            // 3. Calculate the avg marks
            total = 0;
            for (int mark : marks) {
                total +=mark;
            }
            avg = total/maxSubjects;
            System.out.println("Average: " + avg);

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
            System.out.println("Input mismatch Exception occurred!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Not divisible by 0!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of Bound Exception occurred!");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This code will be gurrentied to run");
        }

        System.out.println("The end");

    }
}
