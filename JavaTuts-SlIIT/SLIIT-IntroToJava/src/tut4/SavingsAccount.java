package tut4;

public class SavingsAccount extends FixedDepositAccount{
    public SavingsAccount(String accountNo, String name, double balance) {
        super(accountNo, name, balance);
        super.interestRate = 4;
    }

    public void withdraw(double amount) {
        super.balance -= amount;
    }

    @Override
    public double calculateInterest() {
        super.interest =  balance * interestRate/100/12;
        return interest;
    }
}
