package Homework.Aug_12_2026;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // constructor overloading
    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited ₹" + amount + " | New Balance: ₹" + balance);
    }

    public abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance of ₹" + MIN_BALANCE + " must be maintained.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn. Remaining Balance: ₹" + getBalance());
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Savings Account ----");
        super.displayDetails();
        System.out.println("Minimum Balance: ₹" + MIN_BALANCE);
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(String accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBalance() - amount < -OVERDRAFT_LIMIT) {
            System.out.println("Withdrawal denied. Overdraft limit of ₹" + OVERDRAFT_LIMIT + " exceeded.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn. Remaining Balance: ₹" + getBalance());
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Current Account ----");
        super.displayDetails();
        System.out.println("Overdraft Limit: ₹" + OVERDRAFT_LIMIT);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SB1001", "Pitambar", 5000);
        BankAccount acc2 = new CurrentAccount("CA2001", "Ravi", 2000);

        System.out.println("== Savings Account ==");
        acc1.displayDetails();
        acc1.deposit(1000);
        acc1.withdraw(4500);   // should be denied (breaks min balance)
        acc1.withdraw(3000);   // allowed

        System.out.println("\n== Current Account ==");
        acc2.displayDetails();
        acc2.withdraw(6000);   // allowed via overdraft
        acc2.withdraw(2000);   // denied, exceeds overdraft limit

        System.out.println("\n== Polymorphism Demo ==");
        BankAccount[] accounts = { acc1, acc2 };
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println();
        }
    }
}