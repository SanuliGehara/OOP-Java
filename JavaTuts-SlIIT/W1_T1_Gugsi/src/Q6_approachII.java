import java.util.Random;

public class Q6_approachII {

    static int[] luckyNums = new int[6];
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a unique random number
        for (int i=0; i< luckyNums.length; i++) {
            int number = random.nextInt(49) + 1;
            if (!isExists(number)) {
                luckyNums[i] = number;
            }
        }

        //Display 6 numbers in lottery
        for (int num : luckyNums) {
            System.out.print(num + " ");
        }

    }

    // Method to ensure random numbers are unique
    public static boolean isExists(int newNum) {
        for (int num : luckyNums) {
            if (newNum == num) {
                return true;
            }
        }
        return false;
    }
}
