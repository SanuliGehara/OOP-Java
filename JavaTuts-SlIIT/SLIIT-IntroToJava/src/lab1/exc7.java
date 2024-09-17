package lab1;

import java.util.Scanner;

public class exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum of 2 numbers : " + (num1 + num2));
        System.out.println("Average : " + (num1 + num2)/2);
    }
}
