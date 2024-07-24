class Solution {
    // Helper method to compute the maximum profit using recursion and memoization
    public static int buySell(int inx, int buy, int[] value, int n, int[][] dp) {
        // Base case: If we have processed all days, no profit can be made
        if (inx == n) {
            return 0;
        }

        // If the state has been computed before, return the stored result
        if (dp[inx][buy] != -1) {
            return dp[inx][buy];
        }

        // Variable to store the maximum profit
        int profit;

        // If the current action is to buy
        if (buy == 1) {
            // Either buy the stock and decrease the price from profit, or skip buying
            profit = Math.max(-value[inx] + buySell(inx + 1, 0, value, n, dp), 
                              0 + buySell(inx + 1, 1, value, n, dp));
        } else {
            // If the current action is to sell
            // Either sell the stock and add the price to profit, or skip selling
            profit = Math.max(value[inx] + buySell(inx + 1, 1, value, n, dp), 
                              0 + buySell(inx + 1, 0, value, n, dp));
        }

        // Store the computed result in dp array and return it
        return dp[inx][buy] = profit;
    }

    // Main method to calculate the maximum profit
    public int maxProfit(int[] prices) {
        int n = prices.length; // Get the number of days

        // Create a dp array of size n x 2 to store computed states
        int[][] dp = new int[n][2];
        
        // Initialize dp array with -1 to indicate uncomputed states
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        // Start the recursive computation from day 0 with the option to buy
        return buySell(0, 1, prices, n, dp);
    }
}
