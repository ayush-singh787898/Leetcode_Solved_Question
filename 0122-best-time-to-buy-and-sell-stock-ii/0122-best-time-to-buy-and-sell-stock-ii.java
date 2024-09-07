
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 

        // Create a dp array of size n+1 x 2 to store computed states
        int[][] dp = new int[n + 1][2];
        
        // Initialize dp array for base cases
        // If there are no days left, profit is 0 whether we can buy or not
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
            dp[i][1] = 0;
        }

        // Iterate over days from the last day to the first day
        for (int inx = n - 1; inx >= 0; inx--) {
            for (int buy = 0; buy <= 1; buy++) {
                int profit = 0;
                if (buy == 1) {
                    // Option to buy or skip buying
                    profit = Math.max(-prices[inx] + dp[inx + 1][0], 0 + dp[inx + 1][1]);
                } else {
                    // Option to sell or skip selling
                    profit = Math.max(prices[inx] + dp[inx + 1][1], 0 + dp[inx + 1][0]);
                }
                dp[inx][buy] = profit; // Store the computed profit in dp array
            }
        }

        // The result is the maximum profit we can achieve starting from day 0 with the option to buy
        return dp[0][1];
    }
}
