class BankAccount {

    static String bankName = "Mariamman Indian Bank";

    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    BankAccount(int accountNumber,
                String accountHolderName,
                String mobileNumber,
                String accountType,
                double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    String getMobileNumber() {
        return mobileNumber;
    }

    double getBalance() {
        return balance;
    }

    void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    void displayAccountDetails() {

        System.out.println("\n====================================");
        System.out.println("       " + bankName);
        System.out.println("====================================");

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
    }
}

public class twelvth {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(
            1001,
            "Arun",
            "9876543210",
            "Savings",
            25000
        );

        BankAccount acc2 = new BankAccount(
            1002,
            "Kumar",
            "9876501234",
            "Current",
            50000
        );


        // ACCOUNT 1

        acc1.displayAccountDetails();

        acc1.deposit(5000);
        System.out.println("Updated Balance: " + acc1.getBalance());

        acc1.withdraw(3000);
        System.out.println("Updated Balance: " + acc1.getBalance());

        acc1.setMobileNumber("9999999999");
        System.out.println("Updated Mobile: " + acc1.getMobileNumber());

        acc1.deposit(-500);

        acc1.withdraw(-1000);

        acc1.withdraw(100000);


        // ACCOUNT 2

        acc2.displayAccountDetails();

        acc2.deposit(10000);

        acc2.withdraw(5000);

        acc2.displayAccountDetails();
    }
}