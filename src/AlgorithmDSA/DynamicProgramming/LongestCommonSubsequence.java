package AlgorithmDSA.DynamicProgramming;

public class LongestCommonSubsequence {

    // Function to find the length of the longest common subsequence
    public static int findLCSLength(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Create a 2D array to store the lengths of LCS for all subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp array using dynamic programming
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {// if i and j starts from 1 the base case can be dp[0][0] = 0;
                    dp[i][j] = 0; // Base case: empty string has LCS of length 0
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // Characters match, extend LCS by 1
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Characters don't match,
                    // take maximum of the two possibilities
                }
            }
        }

        // Return the length of the LCS
        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCAB";

        int lcsLength = findLCSLength(str1, str2);
        System.out.println("Length of Longest Common Subsequence: " + lcsLength);
    }
}
