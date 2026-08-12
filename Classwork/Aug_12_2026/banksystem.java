package Aug_12_2026;
class BankAccount{
    double balance=0;

    void interest_calculation(int rate){
        System.out.println("YOu can implementttt your own");
    }

    void deposit(double depamount){
        balance+=depamount;
        System.out.println("Amount Deposited Successfully");
        System.out.println("Available Balance: " + balance);
    }

     void deposit(double depamount,String description){
        balance+=depamount;
        System.out.println("Amount Deposited Successfully with Description "+ description);
        System.out.println("Available Balance: " + balance);
    }
     void deposit(double depamount,String description, int id){
        balance+=depamount;
        System.out.println("Amount Deposited Successfully by the id number" + id + " withe description "+ description);
        System.out.println("Available Balance: " + balance);
    }
   
    
}
class SavingAccount extends BankAccount{
    
   void interest_calculation(){
        double interestamount= this.balance * 0.06;
        System.out.println("The interest amount in SavingAccount is "+ interestamount);
    }
}
class CurrentAccount extends BankAccount{
    void interest_calculation(){
        double interestamount= this.balance * 0.02;
        System.out.println("The interest amount in currentAccount is "+ interestamount);
    }

}

public class banksystem {
    public static void main(String[] args) {
        SavingAccount b=new SavingAccount();
        b.deposit(500);
        b.deposit(24000,"For Study Purpose");
        b.deposit(10000,"For My Future Business ",266);
        b.interest_calculation();

        CurrentAccount cs=new CurrentAccount();
       
        cs.deposit(500);
        cs.deposit(24000,"For Study Purpose");
        cs.deposit(10000,"For My Future Business ",266);
        cs.interest_calculation();
        

        

    }

    
}
