// Iterative method

// class Solution {
//     public int fib(int n) {
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }
//         int a=0;
//         int b=1;
//         int sum=0;
//         for(int i=1;i<n;i++){
//             sum=a+b;
//             a=b;
//             b=sum;
//         }
//         return sum;
//     }
// }

class Solution {
    public static int fibonacci(int n,int dp[]){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int sum=fibonacci(n-2,dp)+fibonacci(n-1,dp);
        return sum;
    }
    

    public int fib(int n) {

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fibonacci(n,dp);

    }
}