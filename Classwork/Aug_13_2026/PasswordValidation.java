package Aug_13_2026;

import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
    InvalidPasswordException(String pass){
        super(pass);
    }

}

class IncorrectPasswordException extends RuntimeException{
    IncorrectPasswordException(String pass){
        super("Incorrect password Exception");
    }
}
public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password ");
        String pass=sc.nextLine();

        // at least 8 char , at least one uppercase at least one  number  and at least one specical character
        // 
        

        if(pass.length()>=8){
            System.out.println("Password Accepted");
        }
        else{
            throw new InvalidAgeException(pass);
        }
    }
}
