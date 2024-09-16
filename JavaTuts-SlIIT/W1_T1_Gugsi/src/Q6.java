import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String choice;

        do {
            // Using a Set to ensure unique numbers
            Set<Integer> luckyNums = new HashSet<>();
            Random random = new Random();

            // generate random numbers between 1 and 49
            while (luckyNums.size() < 6) {
                int num  = random.nextInt(49) + 1;
                luckyNums.add(num);
            }

            // Display the lottery numbers
            System.out.println(luckyNums);

            System.out.println("Do you want to see next lucky numbers? (y/n) ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));
    }
}
