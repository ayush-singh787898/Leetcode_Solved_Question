class Solution {
    public static int sol(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return sol(n-1)+sol(n-2);
        
    }
    public int fib(int n) {
        return sol(n);
    }
}