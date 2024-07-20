package AlgorithmDSA.DynamicProgramming;

public class LCS {
    public static String findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Initialize DP table
        int[][] dp = new int[m + 1][n + 1];

        // Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtrack to find LCS characters
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                // Match found, add character to LCS and move diagonally
                lcs.insert(0, s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                // Move upwards
                i--;
            } else {
                // Move leftwards
                j--;
            }
        }

        return lcs.toString();
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";
        System.out.println("Longest Common Subsequence: " + findLCS(s1, s2));
    }
}
