package InstaceBlock;

public class BankAccount {
    private double balance;
    private String accNum;

    // INSTANCE BLOCK - Calls at the time of object creation
    {
        balance = 500.00;
        accNum = "Account-1";
    }

    // SINCE NO ARGS Constructor initalize it then, above Instance block values won't use when initialize objectsused
    // BUT IF NO ARGS CONSTRUCTUR DOES not initialize anything - instance block will used
    public BankAccount() {
        super();
        System.out.println("NO ARGS CONSTRUCTOR - WITH NO VALUE INITIALIZED");
    }

    public BankAccount(double balance, String accNum) {
        this.balance = balance;
        this.accNum = accNum;
    }

    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccNum() {
        return this.accNum;
    }

    public void close() {
        System.out.println("Account Closed");
    }
}
