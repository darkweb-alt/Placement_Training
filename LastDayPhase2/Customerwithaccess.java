class Customer {
    private long accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;

    Customer(long accountNumber, String accountHolderName, long mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name " + accountHolderName);
        System.out.println("Mobile number " + mobileNumber);
        System.out.println("Account Type " + accountType);
        System.out.println("Available Balance " + balance);
    }
}

public class Customerwithaccess {
    public static void main(String[] args) {
        Customer c1 = new Customer(71812401266l, "Pitambar Yadav", 8390335638l, "Fixed Deposit", 50000);
        Customer c2 = new Customer(71812401254l, "Venkatachalam K", 8390335638l, "Savings", 45000);

        Customer c3 = new Customer(71812401133l, "Mrittika S", 8390335638l, "Fixed Deposit", 50000);

        c1.display();


    }

    
}
