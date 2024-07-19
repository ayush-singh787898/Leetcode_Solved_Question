class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];

        // Initialize base case: if word2 is empty, we need to remove all characters of word1
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        
        // Initialize base case: if word1 is empty, we need to insert all characters of word2
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If characters are the same, no operation is needed
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Calculate the cost of removing a character from word1
                    int removeCost = 1 + dp[i - 1][j];
                    // Calculate the cost of inserting a character into word1
                    int insertCost = 1 + dp[i][j - 1];
                    // Calculate the cost of replacing a character in word1
                    int replaceCost = 1 + dp[i - 1][j - 1];
                    // Take the minimum of the three operations
                    dp[i][j] = Math.min(Math.min(removeCost, insertCost), replaceCost);
                }
            }
        }

        // The last cell of the dp array contains the minimum edit distance
        return dp[n][m];
    }
}
