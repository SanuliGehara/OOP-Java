package lab1;

public class exc5 {
    public static void main(String[] args) {

        // Triangle pattern
        for (int i=6; i>1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int j=6; j>=i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println(); // extra line before next pattern

        // Square star pattern - while loop
        int r = 6;
        while (r>1) {
            int col = 6;
            while (col>1) {
                System.out.print("* ");
                col--;
            }
            System.out.println();
            r--;
        }

        System.out.println(); // extra line before next pattern

        // Square star pattern - for loop
        for (int row=1; row<6; row++) {
            for (int column=1; column<6; column++)  {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
