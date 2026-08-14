class Customer {

    int accountNumber;
    String accountHolderName;
    String mobileNumber;
    String accountType;
    double balance;

    Customer(int accountNumber, String accountHolderName,
             String mobileNumber, String accountType, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class second {
    public static void main(String[] args) {

        Customer c1 = new Customer(
            1001, "Arun", "9876543210", "Savings", 25000
        );

        Customer c2 = new Customer(
            1002, "Kumar", "9876501234", "Current", 50000
        );

        c1.display();
        System.out.println();

        c2.display();
    }
}