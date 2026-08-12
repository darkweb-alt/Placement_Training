package Aug_12_2026;

class Bank {
    double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}

public class secondexception {
    public static void main(String[] args) {
        Bank b = new Bank(1500);

        try {
            b.withdraw(400);
            b.withdraw(700);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}