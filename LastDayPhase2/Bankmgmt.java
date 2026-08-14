class Bank{
    static String bankName="Mariamman Indian Bank";
    int accnum;
    String username ;
    Bank(int accnum,String username){
        this.accnum=accnum;
        this.username=username;
    }

}
public class Bankmgmt{

    public static void main(String[] args) {
        Bank acc1=new Bank(2401266, "Pitambar");
        Bank acc2=new Bank(2401254, "Venkatachalam");
        Bank acc3=new Bank(2401133, "Mrittika");
        System.out.println(acc1.bankName);
        System.out.println(acc2.bankName);
        System.out.println(acc3.bankName);
        
    }
}