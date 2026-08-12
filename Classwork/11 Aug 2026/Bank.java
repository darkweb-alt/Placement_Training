interface BankAccount {

    void deposit(double amount);

    void withdraw(double amount);

    void checkBalance();
}
class SavingsAccount implements BankAccount {

    private double balance = 0;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new SavingsAccount();

        account.deposit(5000);
        account.withdraw(1000);
        account.checkBalance();
    }
}