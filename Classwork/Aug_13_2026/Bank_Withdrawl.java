package Aug_13_2026;

import java.util.Scanner;

class InsufficientException extends RuntimeException {
    InsufficientException(String msg) {
        super(msg);
    }
}

public class Bank_Withdrawl {
    double balance;

    Bank_Withdrawl(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Successful, Remaining Balance: " + balance);
        } else {
            throw new InsufficientException("Insufficient Balance Exception");
            // System.out.println("Insufficient Balance without Exception message");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial Balance: ");
        double amount = sc.nextDouble();

        Bank_Withdrawl b = new Bank_Withdrawl(amount);

        System.out.println("Enter the withdrawl amount");
        double withdrawamount = sc.nextDouble();
        b.withdraw(withdrawamount);
        sc.close();

    }

}
