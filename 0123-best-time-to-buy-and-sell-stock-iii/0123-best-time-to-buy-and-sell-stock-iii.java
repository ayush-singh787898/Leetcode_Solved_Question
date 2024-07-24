class Solution {
    public static int BuySell(int []price,int inx,int buy,int cap,int n,int [][][]dp){
        
//         Time Complexity N*2*3 , and Space Complexity : O(N*2*3)+Auxillary Space O(n).
        if(inx==n || cap==0){
            return 0;
        }
        if(dp[inx][buy][cap]!=-1){
            return dp[inx][buy][cap];
        }
        if(buy==1){         // buy
            dp[inx][buy][cap]=Math.max((-price[inx]+BuySell(price,inx+1,0,cap,n,dp)),(0+BuySell(price,inx+1,buy,cap,n,dp)));
        }
        
        
//         allowed to buy : -prices[inx]+BuySell(price,inx,0,cap,n,dp    // 0 indicate not allowed to buy as  already buy has been done (i.e. -prices[inx]);
        
        // where -prices[inx] is profit part
//         Not allowed to buy :- 0+BuySell(price,inx-1,buy,cap,n,dp
        
        
        else{     // sell  
            dp[inx][buy][cap]=Math.max((price[inx]+BuySell(price,inx+1,1,cap-1,n,dp)),0+BuySell(price,inx+1,buy,cap,n,dp));
            
            // sell : (prices[inx]+BuySell(price,inx,1,cap-1,n,dp)
            // prices[inx]  :- sell done so buy option enable so 1
            
            // Not-sell  : 0+BuySell(price,inx+1,0,cap-1,n,dp   
            // o shows not sell
        }
        return dp[inx][buy][cap];
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int cap=2;
        int buy=1;
        int inx=0;
        int dp[][][]=new int[n][buy+1][cap+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<=cap;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
       return BuySell(prices,inx,buy,cap,n,dp);
    }
}