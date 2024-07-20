package AlgorithmDSA.DynamicProgramming;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        // Initialize the DP array
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        // Compute the minimum cost for each step
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }

        // Return the minimum cost to reach the top
        return Math.min(dp[n-1], dp[n-2]);
    }

    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        System.out.println("Minimum cost: " + minCostClimbingStairs(cost1)); // Output: 15

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println("Minimum cost: " + minCostClimbingStairs(cost2)); // Output: 6
    }
}
