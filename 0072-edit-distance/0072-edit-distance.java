class Solution {
    public static int crudCount(String word1, String word2, int n, int m, int dp[][]) {
        // Base Case: If all characters of word1 are processed
        if (n < 0) {
            return m + 1; // All remaining characters of word2 need to be inserted
        }
        // Base Case: If all characters of word2 are processed
        if (m < 0) {
            return n + 1; // All remaining characters of word1 need to be removed
        }
        // Memoization check
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        // If characters are the same, no operation is needed
        if (word1.charAt(n) == word2.charAt(m)) {
            dp[n][m] = 0 + crudCount(word1, word2, n - 1, m - 1, dp);
        } else {
            // Calculate the cost of removing a character from word1
            int removeCost = 1 + crudCount(word1, word2, n - 1, m, dp);
            // Calculate the cost of inserting a character into word1
            int insertCost = 1 + crudCount(word1, word2, n, m - 1, dp);
            // Calculate the cost of replacing a character in word1
            int replaceCost = 1 + crudCount(word1, word2, n - 1, m - 1, dp);
            // Take the minimum of the three operations
            dp[n][m] = Math.min(Math.min(removeCost, insertCost), replaceCost);
        }
        return dp[n][m];
    }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];
        // Initialize the dp array with -1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        return crudCount(word1, word2, n - 1, m - 1, dp);
    }
}
