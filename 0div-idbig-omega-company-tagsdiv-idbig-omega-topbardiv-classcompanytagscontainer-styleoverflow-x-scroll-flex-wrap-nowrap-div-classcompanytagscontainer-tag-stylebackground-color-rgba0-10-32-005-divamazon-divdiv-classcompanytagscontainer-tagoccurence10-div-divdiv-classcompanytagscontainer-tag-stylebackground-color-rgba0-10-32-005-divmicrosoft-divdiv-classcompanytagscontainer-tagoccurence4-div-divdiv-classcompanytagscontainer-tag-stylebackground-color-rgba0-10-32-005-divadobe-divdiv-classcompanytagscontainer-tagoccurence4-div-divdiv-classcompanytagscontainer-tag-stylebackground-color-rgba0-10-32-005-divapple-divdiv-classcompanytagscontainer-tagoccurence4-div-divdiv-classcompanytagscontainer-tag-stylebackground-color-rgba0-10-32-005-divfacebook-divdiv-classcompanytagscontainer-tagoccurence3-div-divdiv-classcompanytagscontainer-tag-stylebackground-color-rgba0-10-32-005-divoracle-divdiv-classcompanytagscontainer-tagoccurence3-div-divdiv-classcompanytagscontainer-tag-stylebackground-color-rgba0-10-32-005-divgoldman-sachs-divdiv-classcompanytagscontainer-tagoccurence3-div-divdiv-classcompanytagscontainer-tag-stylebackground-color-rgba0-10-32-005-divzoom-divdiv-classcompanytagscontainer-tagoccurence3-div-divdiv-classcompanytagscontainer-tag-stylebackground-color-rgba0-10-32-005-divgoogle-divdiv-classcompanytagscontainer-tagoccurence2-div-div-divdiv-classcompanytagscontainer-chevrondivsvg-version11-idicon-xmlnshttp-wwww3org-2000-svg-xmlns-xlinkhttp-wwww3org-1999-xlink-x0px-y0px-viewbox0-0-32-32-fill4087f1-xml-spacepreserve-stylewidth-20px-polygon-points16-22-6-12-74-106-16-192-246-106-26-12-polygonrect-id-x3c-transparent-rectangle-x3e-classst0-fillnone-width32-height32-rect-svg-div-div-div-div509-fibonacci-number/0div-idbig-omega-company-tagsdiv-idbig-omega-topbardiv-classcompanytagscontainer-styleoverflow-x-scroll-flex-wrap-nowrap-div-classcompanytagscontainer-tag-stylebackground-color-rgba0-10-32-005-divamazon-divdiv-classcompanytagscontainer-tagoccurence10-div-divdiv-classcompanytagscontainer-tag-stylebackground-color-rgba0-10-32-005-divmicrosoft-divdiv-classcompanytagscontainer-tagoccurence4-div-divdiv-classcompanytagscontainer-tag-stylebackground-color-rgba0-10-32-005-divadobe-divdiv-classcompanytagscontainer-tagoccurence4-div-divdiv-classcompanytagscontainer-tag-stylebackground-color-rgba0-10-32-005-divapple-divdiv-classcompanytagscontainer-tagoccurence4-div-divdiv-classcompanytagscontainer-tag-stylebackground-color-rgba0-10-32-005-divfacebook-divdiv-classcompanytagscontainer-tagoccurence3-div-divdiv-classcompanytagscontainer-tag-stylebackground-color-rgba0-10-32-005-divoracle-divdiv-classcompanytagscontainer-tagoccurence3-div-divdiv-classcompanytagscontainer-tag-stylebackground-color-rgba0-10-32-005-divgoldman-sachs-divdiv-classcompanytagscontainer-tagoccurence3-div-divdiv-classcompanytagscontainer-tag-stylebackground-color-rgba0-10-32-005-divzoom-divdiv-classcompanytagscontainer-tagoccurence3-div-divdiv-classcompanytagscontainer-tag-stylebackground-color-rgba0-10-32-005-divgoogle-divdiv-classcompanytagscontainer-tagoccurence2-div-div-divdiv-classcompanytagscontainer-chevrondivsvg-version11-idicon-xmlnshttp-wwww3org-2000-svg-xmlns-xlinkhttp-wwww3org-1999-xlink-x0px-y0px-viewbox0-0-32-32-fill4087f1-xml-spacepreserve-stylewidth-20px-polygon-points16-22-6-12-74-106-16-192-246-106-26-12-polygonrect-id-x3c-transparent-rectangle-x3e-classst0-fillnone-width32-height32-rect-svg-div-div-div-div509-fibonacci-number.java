class Solution {
    public static int sol(int n,int []dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return sol(n-1,dp)+sol(n-2,dp);
        
    }
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return sol(n,dp);
    }
}