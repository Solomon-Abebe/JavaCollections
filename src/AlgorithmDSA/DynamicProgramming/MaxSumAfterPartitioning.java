package AlgorithmDSA.DynamicProgramming;

public class MaxSumAfterPartitioning {
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int maxVal = 0;
            for (int j = 1; j <= k && (i-j)>=0; j++) {
                maxVal = max(maxVal, arr[i - j]);
                dp[i]  = max(dp[i], dp[i - j] + maxVal * j);
            }
        }

        return dp[n];
    }
    public static int max(int a, int b){
        return a>b? a:b;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,5,7,3,6,1,9,9,3};
        int k = 4;
        System.out.println(maxSumAfterPartitioning(arr, k)); // Output: 84
    }
}
