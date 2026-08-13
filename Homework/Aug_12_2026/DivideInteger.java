package Homework.Aug_12_2026;
class Solution {
    public int divide(int dividend, int divisor) {

        
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long result = 0;

        while (a >= b) {

            long temp = b;
            long multiple = 1;

            while (a >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            a -= temp;
            result += multiple;
        }

        return negative ? (int)-result : (int)result;
    }
}
public class DivideInteger {
   public static void main(String[] args) {
    Solution s=new Solution();
    System.out.println(s.divide(15, 3));
   }
}
