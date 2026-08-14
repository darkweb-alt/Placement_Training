package Aug_13_2026;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
public InvalidAgeException(String er){
  super(er);
}

}

public class CustomException {

    static void age_validate(int age){
        if(age>=18){
            System.out.println("Elligible");
        }
        else{
            throw new InvalidAgeException("Invalid Age");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        age_validate(age);
        
    }
}
