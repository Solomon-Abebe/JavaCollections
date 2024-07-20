package AlgorithmDSA.DynamicProgramming;

//import java.util.Arrays;

public class CoinChange {
    public static int minCoins(int[] coins, int amount) {
        // Initialize an array to store the minimum number of coins needed for each amount from 0 to amount
        int[] dp = new int[amount + 1];

        // Initialize the array with a value larger than any possible solution
       // Arrays.fill(dp, amount + 1);
        for (int j = 0; j <=amount ; j++) {
            dp[j] =amount+1;
        }

        // Base case: 0 coins are needed to make change for amount 0
        dp[0] = 0;

        // Iterate through each amount from 1 to amount
        for (int i = 1; i <= amount; i++) {
            // Iterate through each coin denomination
            for (int coin : coins) {
                // Check if the current coin denomination can be used to make change for the current amount
                if (coin <= i) {
                    // Update the minimum number of coins needed for the current amount
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        // If dp[amount] is still greater than amount, it means it's impossible to make change for the given amount
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 5,9,6};
        int amount = 13;

        int minCoins = minCoins(coins, amount);
        System.out.println("\n Minimum number of coins required to make change for " + amount + ": " + minCoins);
    }
}
