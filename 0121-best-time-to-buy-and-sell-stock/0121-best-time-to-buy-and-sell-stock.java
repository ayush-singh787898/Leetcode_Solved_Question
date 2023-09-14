class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int minsofor=prices[0];
        for(int i=0;i<n;i++){
            minsofor=Math.min(prices[i],minsofor);
            int profit=prices[i]-minsofor;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
        
    }
}












