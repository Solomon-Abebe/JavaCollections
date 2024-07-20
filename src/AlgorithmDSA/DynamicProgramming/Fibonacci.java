package AlgorithmDSA.DynamicProgramming;

public class Fibonacci {
    // Function to calculate the nth Fibonacci number using dynamic programming(bottom-up tabulation)
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        // Create an array to store Fibonacci numbers
        int[] fib = new int[n + 1];

        // Initialize the first two Fibonacci numbers
        fib[0] = 0;
        fib[1] = 1;

        // Calculate and store Fibonacci numbers from the bottom up
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Return the nth Fibonacci number
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example: Calculate the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
    }
}
