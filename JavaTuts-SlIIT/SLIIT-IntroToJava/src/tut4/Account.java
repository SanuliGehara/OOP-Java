package tut4;

public abstract class Account {
    String accountNo;
    String name;
    double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public abstract double calculateInterest() ;

    public void display() {
        System.out.println("Acc No: " + accountNo + ", Name: " + name + " , Balance: " + balance);
    }
}
