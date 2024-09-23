package tut4;

public class AccountDemo {
    public static void main(String[] args) {
        FixedDepositAccount fdAccount = new FixedDepositAccount("FD123", "John Doe", 10000);
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "Jane Doe", 5000);

        fdAccount.deposit(2000);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);

        fdAccount.display();
        System.out.println("Fixed Deposit Interest: " + fdAccount.calculateInterest());

        savingsAccount.display();
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
    }
}
