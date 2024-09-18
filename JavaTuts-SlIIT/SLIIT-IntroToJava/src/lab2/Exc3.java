package lab2;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("length: ");
        double l = scanner.nextDouble();

        System.out.print("width: ");
        double w = scanner.nextDouble();

        System.out.print("height: ");
        double h = scanner.nextDouble();

        double v = l * w * h;
        System.out.println("Volume of cube : " + Double.toString(v));
    }
}
