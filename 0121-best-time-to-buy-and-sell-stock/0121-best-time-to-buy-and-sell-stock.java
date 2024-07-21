class Solution {
    public int maxProfit(int[] prices) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            mini=Math.min(mini,prices[i]);      // buy 
            maxi=Math.max(maxi,prices[i]-mini);  // sold at profit 
        }
        return maxi>=1?maxi:0;
    }
}