public class SavingsAccount extends BankAccount{
    private String savingAccNo;

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int amount) {
        if (!(getBalance() < 100)){
            super.withdraw(amount);
        } else {
            System.out.println("Saving account requires minimum Rs.100 of Balance!");
        }
    }
}
