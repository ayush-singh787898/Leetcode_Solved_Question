class Solution {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans=fibonacci(n-1)+fibonacci(n-2);
        return ans;
    }
    public int fib(int n) {
        return fibonacci(n);
        
    }
}