// class Solution {
//     public static int BuySell(int []price,int inx,int buy,int cap,int n,int [][][]dp){
        
// //         Time Complexity N*2*3 , and Space Complexity : O(N*2*3)+Auxillary Space O(n).
//         if(inx==n || cap==0){
//             return 0;
//         }
//         if(dp[inx][buy][cap]!=-1){
//             return dp[inx][buy][cap];
//         }
//         if(buy==1){         // buy
//             dp[inx][buy][cap]=Math.max((-price[inx]+BuySell(price,inx+1,0,cap,n,dp)),(0+BuySell(price,inx+1,buy,cap,n,dp)));
//         }
        
        
// //         allowed to buy : -prices[inx]+BuySell(price,inx,0,cap,n,dp    // 0 indicate not allowed to buy as  already buy has been done (i.e. -prices[inx]);
        
//         // where -prices[inx] is profit part
//        //   Not allowed to buy :- 0+BuySell(price,inx-1,buy,cap,n,dp
        
        
//         else{     // sell  
//             dp[inx][buy][cap]=Math.max((price[inx]+BuySell(price,inx+1,1,cap-1,n,dp)),0+BuySell(price,inx+1,buy,cap,n,dp));
            
//             // sell : (prices[inx]+BuySell(price,inx,1,cap-1,n,dp)
//             // prices[inx]  :- sell done so buy option enable so 1
            
//             // Not-sell  : 0+BuySell(price,inx+1,0,cap-1,n,dp   
//             // o shows not sell
//         }
//         return dp[inx][buy][cap];
//     }
//     public int maxProfit(int[] prices) {
//         int n=prices.length;
//         int cap=2;
//         int buy=1;
//         int inx=0;
//         int dp[][][]=new int[n][buy+1][cap+1];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<2;j++){
//                 for(int k=0;k<=cap;k++){
//                     dp[i][j][k]=-1;
//                 }
//             }
//         }
//        return BuySell(prices,inx,buy,cap,n,dp);
//     }
// }




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
