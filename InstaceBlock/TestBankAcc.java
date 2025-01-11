package InstaceBlock;

public class TestBankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount(1000,"Acc2");
        BankAccount bankAccount3 = new BankAccount(2000,"Acc3");

        BankAccount[] array = {bankAccount1,bankAccount2,bankAccount3};

        for(BankAccount acc: array) {
            System.out.println("Account: "+ acc.getAccNum() +"| Balance: " + acc.getBalance());
        }
    }
}
