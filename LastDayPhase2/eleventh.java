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

    void display() {

        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class eleventh {
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

        acc1.display();
        acc2.display();
    }
}