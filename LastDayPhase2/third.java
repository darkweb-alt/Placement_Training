class BankAccount {

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
}

public class third {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            1001,
            "Arun",
            "9876543210",
            "Savings",
            25000
        );
    }
}