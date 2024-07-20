class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        
        // Base case initialization
        dp[0][0] = true; // Empty string matches empty pattern
        
        // Handle patterns with leading '*'
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1]; // '*' matches empty string
            }
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == '*') {
                    // '*' can match zero or more characters
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    // '?' matches any single character or exact match
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = false; // Characters do not match
                }
            }
        }
        
        return dp[n][m];
    }
}
