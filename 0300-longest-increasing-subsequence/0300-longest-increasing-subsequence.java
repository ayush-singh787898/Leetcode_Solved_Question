class Solution {
    public static int longestIncr(int i,int[]num,int n,int prev,int[][]dp){
        if(i==n){
            return 0;
        }
        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
 
        //not Taking
        int len=0+longestIncr(i+1,num,n,prev,dp);
        // Taking
        if(prev==-1 || num[i]>num[prev]){
            len=Math.max(len,1+longestIncr(i+1,num,n,i,dp));
        }
        return dp[i][prev+1]=len;
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        return longestIncr(0,nums,n,-1,dp);
    }
}