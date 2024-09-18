package lab2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exc4_BufferedReader {
    public static void main(String[] args) throws IOException {
        // Create a bufferedReader input object
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        System.out.print("length: ");
        double l = Double.parseDouble(bf.readLine());

        System.out.print("width: ");
        double w = Double.parseDouble(bf.readLine());

        System.out.print("height: ");
        double h = Double.parseDouble(bf.readLine());

        double v = l * w * h;
        System.out.println("Volume of cube : " + Double.toString(v));
    }
}
