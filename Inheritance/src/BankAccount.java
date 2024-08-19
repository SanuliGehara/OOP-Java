public class BankAccount {
    /*Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
    Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below 100*/

    private int balance;

    public BankAccount(int balance) {
        this.balance = Math.max(balance , 500);
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
