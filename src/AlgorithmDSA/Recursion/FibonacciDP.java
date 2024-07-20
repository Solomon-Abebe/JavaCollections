package AlgorithmDSA.Recursion;

public class FibonacciDP {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        // Array to store calculated Fibonacci numbers
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 0;
        dp[1] = 1;

        // Build up the DP table
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
       // int fibN = fib(n);
       // System.out.println("Fibonacci number at " + n + " is: " + fibN);
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
