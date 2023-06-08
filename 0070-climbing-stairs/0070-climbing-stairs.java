class Solution {
    public int climbStairs(int n) {
        int a=1;
        int b=1;
        int c=1;
        int i=1;
        while(i<n){
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
        
    }
}