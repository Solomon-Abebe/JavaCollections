package AlgorithmDSA.DynamicProgramming;

//import java.util.Arrays;

public class KnapsackMemoization {

    static int[][] memo;

    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        memo = new int[n + 1][capacity + 1];
       /* for (int[] row : memo) {
            Arrays.fill(row, -1);
        }*/
        // manual fill of the memo array
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                memo[i][j] = -1;
            }
        }

        return knapsackHelper(weights, values, capacity, n);
    }

    private static int knapsackHelper(int[] weights, int[] values, int capacity, int n) {
        if (n == 0 || capacity == 0) {
            return 0;
        }
        if (memo[n][capacity] != -1) {
            return memo[n][capacity];
        }
        if (weights[n - 1] > capacity) {
            memo[n][capacity] = knapsackHelper(weights, values, capacity, n - 1);
        } else {
            int include = values[n - 1] + knapsackHelper(weights, values, capacity - weights[n - 1], n - 1);
            int exclude = knapsackHelper(weights, values, capacity, n - 1);
            memo[n][capacity] = max(include, exclude);
        }
        return memo[n][capacity];
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {30, 100, 120};
        int capacity = 40;

        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value that can be obtained (Memoization): " + maxValue);
    }
}
