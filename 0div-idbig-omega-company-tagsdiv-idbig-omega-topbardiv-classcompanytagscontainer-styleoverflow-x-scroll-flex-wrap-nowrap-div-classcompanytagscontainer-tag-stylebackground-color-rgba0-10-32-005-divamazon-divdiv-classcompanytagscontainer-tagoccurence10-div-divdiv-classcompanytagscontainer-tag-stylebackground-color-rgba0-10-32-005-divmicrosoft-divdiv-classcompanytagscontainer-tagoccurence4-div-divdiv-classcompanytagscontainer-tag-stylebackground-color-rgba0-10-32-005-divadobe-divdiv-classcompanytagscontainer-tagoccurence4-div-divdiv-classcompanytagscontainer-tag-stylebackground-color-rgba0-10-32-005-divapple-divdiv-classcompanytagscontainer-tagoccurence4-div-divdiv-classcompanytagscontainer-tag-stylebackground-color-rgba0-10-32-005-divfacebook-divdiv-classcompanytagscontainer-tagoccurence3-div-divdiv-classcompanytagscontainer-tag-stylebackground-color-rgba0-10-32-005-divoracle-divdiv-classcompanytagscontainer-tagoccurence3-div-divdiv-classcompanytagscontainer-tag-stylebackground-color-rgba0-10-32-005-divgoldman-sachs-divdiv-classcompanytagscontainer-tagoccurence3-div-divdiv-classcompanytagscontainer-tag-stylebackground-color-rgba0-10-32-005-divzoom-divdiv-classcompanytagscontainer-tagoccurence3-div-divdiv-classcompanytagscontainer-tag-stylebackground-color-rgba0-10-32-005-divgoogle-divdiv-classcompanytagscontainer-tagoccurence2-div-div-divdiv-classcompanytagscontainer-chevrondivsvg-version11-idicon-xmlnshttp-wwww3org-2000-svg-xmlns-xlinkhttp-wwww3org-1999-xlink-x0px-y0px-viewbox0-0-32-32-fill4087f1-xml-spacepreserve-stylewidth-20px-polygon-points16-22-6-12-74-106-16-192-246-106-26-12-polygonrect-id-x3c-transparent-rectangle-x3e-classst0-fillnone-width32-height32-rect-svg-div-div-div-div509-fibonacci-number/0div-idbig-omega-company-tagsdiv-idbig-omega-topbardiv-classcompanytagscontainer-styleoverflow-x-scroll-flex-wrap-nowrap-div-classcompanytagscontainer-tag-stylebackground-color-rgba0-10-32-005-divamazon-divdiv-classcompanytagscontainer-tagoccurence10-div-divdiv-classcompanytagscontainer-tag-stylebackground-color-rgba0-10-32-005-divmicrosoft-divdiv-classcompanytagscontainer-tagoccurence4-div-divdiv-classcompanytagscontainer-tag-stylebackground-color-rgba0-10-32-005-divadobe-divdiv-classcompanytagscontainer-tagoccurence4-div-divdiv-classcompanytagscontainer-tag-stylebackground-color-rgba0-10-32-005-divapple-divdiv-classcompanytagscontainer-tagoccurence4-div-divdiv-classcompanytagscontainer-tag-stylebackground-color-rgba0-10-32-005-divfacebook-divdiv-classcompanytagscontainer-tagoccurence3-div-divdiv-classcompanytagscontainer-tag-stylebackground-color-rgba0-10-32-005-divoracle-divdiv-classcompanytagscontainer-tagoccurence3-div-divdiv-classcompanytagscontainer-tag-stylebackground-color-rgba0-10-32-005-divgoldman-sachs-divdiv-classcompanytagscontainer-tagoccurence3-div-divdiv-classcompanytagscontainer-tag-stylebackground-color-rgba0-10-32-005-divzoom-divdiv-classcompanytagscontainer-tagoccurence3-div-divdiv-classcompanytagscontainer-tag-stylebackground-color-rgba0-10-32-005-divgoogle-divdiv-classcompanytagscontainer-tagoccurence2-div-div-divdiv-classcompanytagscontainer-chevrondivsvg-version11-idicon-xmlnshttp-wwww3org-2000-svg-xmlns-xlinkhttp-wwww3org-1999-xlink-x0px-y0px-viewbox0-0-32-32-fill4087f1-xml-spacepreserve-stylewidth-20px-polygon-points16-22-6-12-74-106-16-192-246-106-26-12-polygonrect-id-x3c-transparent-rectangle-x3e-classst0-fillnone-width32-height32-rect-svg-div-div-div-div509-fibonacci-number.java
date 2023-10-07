class Solution {
    public static int fibonacci(int n,int []dparr){
        if(dparr[n]!=-1){
            return dparr[n];
        }
        if(n==0 || n==1){
            return n;
        }
        dparr[n]=fibonacci(n-1,dparr)+fibonacci(n-2,dparr);
        return dparr[n];
    }
    public int fib(int n) {
        int dparr[]=new int[n+1];
        Arrays.fill(dparr,-1);
        return fibonacci(n,dparr);
        
    }
}






