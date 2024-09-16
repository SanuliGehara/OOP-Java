public class Q5 {
    public static void main(String[] args) {
        // Even numbers from 1 to 100
        int counter = 1;
        while (counter<=100) {
            if (counter%2 == 0) {
                System.out.print(counter + " , ");
            }
            counter ++;
        }
    }
}
