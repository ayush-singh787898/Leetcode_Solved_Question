
class Solution {
   
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int cap = 2;
        int buy = 1;
        int[][][] dp = new int[n + 1][buy + 1][cap + 1];
        
        // Base Case 1: If cap = 0, it means that indx and buy can be anything
        for (int inx = 0; inx <= n; inx++) {
            for (int b = 0; b <= 1; b++) {
                dp[inx][b][0] = 0;
            }
        }
        
        // Base Case 2: If indx = n, then buy and cap can be anything
        for (int b = 0; b <= 1; b++) {
            for (int c = 0; c <= 2; c++) {
                dp[n][b][c] = 0;
            }
        }
        
        for (int inx = n - 1; inx >= 0; inx--) {
            for (int b = 0; b <= 1; b++) {
                for (int c = 1; c <= 2; c++) {  // Start c from 1 to avoid negative cap
                    // Buy
                    if (b == 1) {
                        dp[inx][b][c] = Math.max(-prices[inx] + dp[inx + 1][0][c], dp[inx + 1][1][c]);
                    } 
                    // Not Buy
                    else {
                        dp[inx][b][c] = Math.max(prices[inx] + dp[inx + 1][1][c - 1], dp[inx + 1][0][c]);
                    }
                }
            }
        }
        
        return dp[0][1][2]; // Return the maximum profit with 2 transactions and cap = 2
    }
}
