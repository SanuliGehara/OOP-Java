public class MyCalculator implements AdvancedArithmetic{
// No need to have @Override signature
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                if (i != n) {
                    System.out.print(i+" + ");
                }else {
                    System.out.print(i + " = ");
                }
                sum += i;
            }
        }
        return sum;
    }
}
