
class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            // If the price today is higher than the price yesterday, we consider it as a profit opportunity
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        
        return totalProfit;
    }
}
