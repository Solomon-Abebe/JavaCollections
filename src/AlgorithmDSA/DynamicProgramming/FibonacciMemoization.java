package AlgorithmDSA.DynamicProgramming;

import java.util.HashMap;

public class FibonacciMemoization {
    static HashMap<Integer, Long> memo = new HashMap<>();
    public static long fibonacci(int n){
        if (memo.containsKey(n))
            return memo.get(n);

        if (n<=1) return n;

        long fibN = fibonacci(n-1) + fibonacci(n-2);
      memo.put(n,fibN);

      return fibN;

    }
    public static void main(String[] args) {
        int n=50;
        long result = fibonacci(n);
        System.out.println(result);
    }
}
