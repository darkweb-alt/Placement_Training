package Aug_13_2026;

import java.util.Scanner;
class InvalidMarkException extends RuntimeException{
    InvalidMarkException(String msg){
super(msg);
    }
}
class InsufficientMarkException extends RuntimeException{
    InsufficientMarkException(String msg){
        super("Negative markingssss Invalid");
    }
}

public class MarksException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
         int sum=0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
           
            if(marks[i] >100){
                throw new InvalidMarkException("You entered more than 100");

            }
            else if(marks[i]< 0){
                throw new InsufficientMarkException("You entered marks under 0");
            }
            else{
                sum+=marks[i];
            }

        }

        double average= (double) sum/5;
     System.out.println("The average mark is " + average);




    }
}
