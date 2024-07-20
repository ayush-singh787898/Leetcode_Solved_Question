class Solution {
    public static boolean WildcardMatching(String s, String p, int i, int j, int[][] dp) {
        // Both string and pattern are exhausted
        if (i < 0 && j < 0) {
            return true;
        }

        // String exhausted but pattern is not
        if (i < 0 && j >= 0) {
            while (j >= 0 && p.charAt(j) == '*') {
                j--;
            }
            return j < 0;
        }

        // Pattern exhausted but string is not
        if (i >= 0 && j < 0) {
            return false;
        }

        // Check if result is already computed
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        boolean match = false;

        // Characters match or pattern has '?'
        if (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j)) {
            match = WildcardMatching(s, p, i - 1, j - 1, dp);
        }
        // Pattern has '*'
        else if (p.charAt(j) == '*') {
            match = WildcardMatching(s, p, i - 1, j, dp) || WildcardMatching(s, p, i, j - 1, dp);
        }

        // Store the result in the memoization table
        dp[i][j] = match ? 1 : 0;
        return match;
    }

    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        // Initialize the memoization table with -1
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        // Start the matching process
        return WildcardMatching(s, p, n - 1, m - 1, dp);
    }
}
