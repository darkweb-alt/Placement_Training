package Aug_12_2026;

import java.util.Arrays;

public class Exceptions {

    public static void main(String[] args) {

        try {
            String name = null;
            name.length();
            int a = 12 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ohh got exception, Divisible by 0");
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println("This exception due to String value");
        }
         finally {
            System.out.println("ANyway It has to be executed");

        }

    }
}