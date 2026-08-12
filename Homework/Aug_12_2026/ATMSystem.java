package Homework.Aug_12_2026;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String pin;

    public BankAccount(String accountNumber, String holderName, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }
    public boolean verifyPin(String enteredPin) { return this.pin.equals(enteredPin); }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully. New Balance: ₹" + balance);
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String accountNumber, String holderName, double balance, String pin, double interestRate) {
        super(accountNumber, holderName, balance, pin);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance of ₹" + MIN_BALANCE + " required.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Remaining Balance: ₹" + getBalance());
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Savings Account ----");
        super.displayDetails();
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, String pin, double overdraftLimit) {
        super(accountNumber, holderName, balance, pin);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (getBalance() - amount < -overdraftLimit) {
            System.out.println("Withdrawal denied. Overdraft limit of ₹" + overdraftLimit + " exceeded.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Remaining Balance: ₹" + getBalance());
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Current Account ----");
        super.displayDetails();
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}

class ATM {
    private String atmId;
    private String location;
    private double cashAvailable;
    private Map<String, BankAccount> accounts;
    private BankAccount currentAccount; // account of the logged-in card holder

    public ATM(String atmId, String location, double cashAvailable) {
        this.atmId = atmId;
        this.location = location;
        this.cashAvailable = cashAvailable;
        this.accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public boolean insertCard(String accountNumber) {
        BankAccount acc = accounts.get(accountNumber);
        if (acc == null) {
            System.out.println("Account not found.");
            return false;
        }
        currentAccount = acc;
        return true;
    }

    public boolean enterPin(String pin) {
        if (currentAccount != null && currentAccount.verifyPin(pin)) {
            System.out.println("\nLogin Successful!");
            return true;
        }
        System.out.println("Incorrect PIN.");
        return false;
    }

    public void checkBalance() {
        currentAccount.checkBalance();
    }

    public void withdrawCash(double amount) {
        if (amount > cashAvailable) {
            System.out.println("ATM has insufficient cash. Please try a lower amount.");
            return;
        }
        double before = currentAccount.getBalance();
        currentAccount.withdraw(amount);
        if (currentAccount.getBalance() < before) {
            cashAvailable -= amount;
        }
    }

    public void depositCash(double amount) {
        currentAccount.deposit(amount);
    }

    public void displayAccountDetails() {
        currentAccount.displayDetails();
    }

    public void exit() {
        currentAccount = null;
        System.out.println("Thank you for using " + atmId + " at " + location + ". Card ejected.");
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        ATM atm = new ATM("ATM001", "SREC Campus", 200000);

        atm.addAccount(new SavingsAccount("1001", "Pitambar", 30000, "1234", 4.0));
        atm.addAccount(new CurrentAccount("2001", "Ravi", 10000, "5678", 5000));

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Insert Card");
            System.out.println("2. Exit ATM");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine().trim());

            if (choice == 2) {
                System.out.println("ATM shutting down. Goodbye!");
                break;
            }

            System.out.print("Enter Account Number: ");
            String accNum = sc.nextLine().trim();

            if (!atm.insertCard(accNum)) continue;

            System.out.print("Enter PIN: ");
            String pin = sc.nextLine().trim();

            if (!atm.enterPin(pin)) continue;

            boolean loggedIn = true;
            while (loggedIn) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Account Details");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int op = Integer.parseInt(sc.nextLine().trim());

                switch (op) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount: ₹");
                        double wAmt = Double.parseDouble(sc.nextLine().trim());
                        System.out.println("Processing...");
                        atm.withdrawCash(wAmt);
                        break;
                    case 3:
                        System.out.print("Enter amount: ₹");
                        double dAmt = Double.parseDouble(sc.nextLine().trim());
                        System.out.println("Processing...");
                        atm.depositCash(dAmt);
                        break;
                    case 4:
                        atm.displayAccountDetails();
                        break;
                    case 5:
                        atm.exit();
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
        sc.close();
    }
}