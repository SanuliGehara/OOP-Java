package tut4;

public class FixedDepositAccount extends Account{
    int interestRate;
    double interest;

    public FixedDepositAccount(String accountNo, String name, double balance) {
        super(accountNo, name, balance);
        this.interestRate = 2;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        this.interest = balance * interestRate/100;
        return interest;
    }
}
