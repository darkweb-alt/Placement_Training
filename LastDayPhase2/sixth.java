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

    void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    String getMobileNumber() {
        return mobileNumber;
    }
}

public class sixth {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            1001, "Arun", "9876543210", "Savings", 25000
        );

        System.out.println(account.getMobileNumber());

        account.setMobileNumber("9999999999");

        System.out.println(account.getMobileNumber());
    }
}