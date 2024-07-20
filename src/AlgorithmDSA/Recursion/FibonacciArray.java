package AlgorithmDSA.Recursion;

import java.util.Arrays;

public class FibonacciArray {
    public static int[] fibonacci(int n) {
        int[] fibSequence = new int[n];
        if (n >= 1) {
            fibSequence[0] = 0;
        }
        if (n >= 2) {
            fibSequence[1] = 1;
        }
        for (int i = 2; i <n; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
        }
        return fibSequence;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] fibonacciSequence = fibonacci(n+1);//+1 is to include the nth fibonacci
        System.out.println("Fibonacci sequence up to " + n + ": " + Arrays.toString(fibonacciSequence));
    }
}