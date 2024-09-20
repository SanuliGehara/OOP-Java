public class Main {
    public static void main(String[] args) {
        // Start pattern - Triangle
        for (int row=0; row<10; row++) {
            // Space
            for (int i=10; i>row; i--) {
                System.out.print(" ");
            }

            // Star
            for (int i=0; i<=row; i++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}