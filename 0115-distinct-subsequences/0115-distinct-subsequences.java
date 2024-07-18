class Solution {
    public static int countDistinct(String s, String t, int i, int j, int dp[][]) {
        // If all characters of t are found, return 1
        if (j < 0) {
            return 1;
        }
        // If all characters of s are exhausted and t is not fully matched, return 0
        if (i < 0) {
            return 0;
        }
        // If the value is already computed, return it
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        // If characters match, move both pointers and also only move the s pointer
        if (s.charAt(i) == t.charAt(j)) {
            int countWithCurrentChar = countDistinct(s, t, i - 1, j - 1, dp); // Case where characters match
            int countWithoutCurrentChar = countDistinct(s, t, i - 1, j, dp); // Case where character from s is skipped
            dp[i][j] = countWithCurrentChar + countWithoutCurrentChar;
        } else {
            // If characters don't match, only move the s pointer
            dp[i][j] = countDistinct(s, t, i - 1, j, dp);
        }
        return dp[i][j];
    }

    public int numDistinct(String s, String t) {
        int dp[][] = new int[s.length()][t.length()];
        // Initialize dp array with -1
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return countDistinct(s, t, s.length() - 1, t.length() - 1, dp);
    }
}
