


class Solution {
    /**
     * Recursively checks if the substring of s ending at index i matches the pattern p ending at index j.
     *
     * @param s the input string
     * @param p the pattern string containing wildcard characters
     * @param i the current index in the input string
     * @param j the current index in the pattern string
     * @param dp the memoization table to store results of subproblems
     * @return true if s[0..i] matches p[0..j], false otherwise
     */
    public static boolean WildcardMatching(String s, String p, int i, int j, int[][] dp) {
        // Base case: both the string and pattern are exhausted
        if (i < 0 && j < 0) {
            return true;
        }

        // Case 1: String is exhausted but pattern is not
        if (i < 0 && j >= 0) {
            // Pattern must only contain '*' characters
            while (j >= 0 && p.charAt(j) == '*') {
                j--;
            }
            return j < 0;
        }

        // Case 2: Pattern is exhausted but string is not
        if (i >= 0 && j < 0) {
            return false;
        }

        // Check if result is already computed
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        boolean match = false;

        // Case when characters match or pattern has '?'
        if (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j)) {
            match = WildcardMatching(s, p, i - 1, j - 1, dp);
        }
        // Case when pattern has '*'
        else if (p.charAt(j) == '*') {
            // '*' can match zero or more characters
            match = WildcardMatching(s, p, i - 1, j, dp) || WildcardMatching(s, p, i, j - 1, dp);
        }

        // Store the result in the memoization table
        dp[i][j] = match ? 1 : 0;
        return match;
    }

    /**
     * Initializes the memoization table and starts the wildcard matching process.
     *
     * @param s the input string
     * @param p the pattern string containing wildcard characters
     * @return true if the entire string matches the entire pattern, false otherwise
     */
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        // Initialize the memoization table with -1 (indicating uncomputed states)
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        // Start the matching process from the end of both the string and the pattern
        return WildcardMatching(s, p, n - 1, m - 1, dp);
    }
}

