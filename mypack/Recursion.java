package mypack;

public class Recursion {
    // Java Recursion
    // Recursion is the technique of making a function call itself.
    // This technique provides a way to break complicated problems down into simple problems which are easier to solve;
    public static int sumFormZeroToN(int n) {
        if (n <= 1) {
            int val = (n == 0) ? 0 : 1;
            return val ;
        }
        return n + sumFormZeroToN(n - 1);
    }
    // Halting Condition
    // Every recursive function should have a halting condition, which is the condition where the function stops calling itself.
    public static int sumBetween(int start, int end) {
        // int sum = 0;
        if (start < end) {
            // sum += start + sumBetween(start + 1, end);
            // return sum;
            return start + sumBetween(start + 1, end);

        }
        // return sum + start;
        // System.out.println(start);
        return start;
    }

}