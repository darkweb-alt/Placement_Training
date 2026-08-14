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

    // Only setter
    void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Getters
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