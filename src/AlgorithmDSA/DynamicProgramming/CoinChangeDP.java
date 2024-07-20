package AlgorithmDSA.DynamicProgramming;



public class CoinChangeDP {

    public static int coinChange(int[] coins, int amount) {
        // Create a 2D array to store the minimum number of coins needed for each amount
        int[][] dp = new int[coins.length + 1][amount + 1];

        // Initialize the first row of the dp array
      //  Arrays.fill(dp[0], amount+1);// initialize the table with the possible unreachable vale
        for (int j = 0; j <=amount ; j++) {
            dp[0][j] =amount+1;

        }
        dp[0][0] = 0; // Base case: 0 coins needed to make amount 0

        // Iterate through each coin and amount to compute the minimum number of coins needed
        for (int i = 1; i <= coins.length; i++) {// i and j start from 1 as the base case dp[0][0] is set to 0.

            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i-1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[coins.length][amount] == amount+1 ? -1 : dp[coins.length][amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 5, 9, 6};
        int amount = 13;
        System.out.println("Minimum coins needed: "+ coinChange(coins, amount));
        int[][] dpTable = new int[coins.length + 1][amount + 1];

        // Fill the DP table
        for (int i = 0; i <= coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                dpTable[i][j] = coinChange(coins, j);
            }
        }

        // Print the DP table
        System.out.println("Dynamic Programming Table:");
        for (int i = 0; i <= coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                System.out.print(dpTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}