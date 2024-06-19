class Solution {
    public int climbSol(int n,int dp[]){
        if(n<=1){
            return dp[n]=1;
        }

        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=climbSol(n-1,dp)+climbSol(n-2,dp);
        return dp[n];
        
    }
    public int climbStairs(int n) {
      int dp[]=new int[n+1];
      Arrays.fill(dp,-1);
      return climbSol(n,dp);
    }
}