public class StarPattern1 {
    public static void main(String[] args) {
        for (int i=5; i>0; i--) {
            System.out.print("-".repeat(i));
            for (int j=5; j>=i; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
