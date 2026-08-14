class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
        else {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class eighth {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(25000);

        account.deposit(5000);

        System.out.println("Balance: " + account.getBalance());
    }
}