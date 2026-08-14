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

    int getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    String getMobileNumber() {
        return mobileNumber;
    }

    String getAccountType() {
        return accountType;
    }

    double getBalance() {
        return balance;
    }
}

public class fifth {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            1001, "Arun", "9876543210", "Savings", 25000
        );

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolderName());
        System.out.println(account.getMobileNumber());
        System.out.println(account.getAccountType());
        System.out.println(account.getBalance());
    }
}