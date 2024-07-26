class Solution {
    public static int longestIncr(int i,int[]num,int n,int prev,int[][]dp){
        if(i==n){   
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
        int dp[][]=new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int prev=i;prev>=-1;prev--){
                int len=dp[i+1][prev+1];
                if(prev==-1 || nums[i]>nums[prev]){
                    len=Math.max(len,1+dp[i+1][i+1]);
                }
                dp[i][prev+1]=len;
            }

        }   
                return dp[0][0];

    }
}