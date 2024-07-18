class Solution {
    public int numDistinct(String s, String t) {
        int dp[][] = new int[s.length() + 1][t.length() + 1];
        
        // Initialize the first column: dp[i][0] = 1 for all i
        // An empty string is a subsequence of any string
        for (int i = 0; i <= s.length(); i++) {
            dp[i][0] = 1;
        }
        
        // Initialize the first row: dp[0][j] = 0 for all j > 0
        // An empty string cannot contain any non-empty string as a subsequence
        for (int j = 1; j <= t.length(); j++) {
            dp[0][j] = 0;
        }
        
        // Fill the dp array
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    // If characters match, we consider two cases:
                    int matchCount = dp[i - 1][j - 1]; // Case where both characters are included in the subsequence
                    int skipCount = dp[i - 1][j];      // Case where the character from s is skipped
                    dp[i][j] = matchCount + skipCount; // Sum of both cases
                } else {
                    // If characters don't match, we skip the current character of s
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[s.length()][t.length()];
    }
}
