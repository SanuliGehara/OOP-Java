package lab1;

import java.util.Scanner;

public class exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of the day: ");
        int value = scanner.nextInt();

        switch (value) {
            case 1:
                System.out.println("Day of the week : Monday");
                break;
            case 2:
                System.out.println("Day of the week : Tuesday");
                break;
            case 3:
                System.out.println("Day of the week : Wednesday");
                break;
            case 4:
                System.out.println("Day of the week : Thursday");
                break;
            case 5:
                System.out.println("Day of the week : Friday");
                break;
            case 6:
                System.out.println("Day of the week : Saturday");
                break;
            case 7:
                System.out.println("Day of the week : Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        System.out.println("Good Bye!");
    }
}
