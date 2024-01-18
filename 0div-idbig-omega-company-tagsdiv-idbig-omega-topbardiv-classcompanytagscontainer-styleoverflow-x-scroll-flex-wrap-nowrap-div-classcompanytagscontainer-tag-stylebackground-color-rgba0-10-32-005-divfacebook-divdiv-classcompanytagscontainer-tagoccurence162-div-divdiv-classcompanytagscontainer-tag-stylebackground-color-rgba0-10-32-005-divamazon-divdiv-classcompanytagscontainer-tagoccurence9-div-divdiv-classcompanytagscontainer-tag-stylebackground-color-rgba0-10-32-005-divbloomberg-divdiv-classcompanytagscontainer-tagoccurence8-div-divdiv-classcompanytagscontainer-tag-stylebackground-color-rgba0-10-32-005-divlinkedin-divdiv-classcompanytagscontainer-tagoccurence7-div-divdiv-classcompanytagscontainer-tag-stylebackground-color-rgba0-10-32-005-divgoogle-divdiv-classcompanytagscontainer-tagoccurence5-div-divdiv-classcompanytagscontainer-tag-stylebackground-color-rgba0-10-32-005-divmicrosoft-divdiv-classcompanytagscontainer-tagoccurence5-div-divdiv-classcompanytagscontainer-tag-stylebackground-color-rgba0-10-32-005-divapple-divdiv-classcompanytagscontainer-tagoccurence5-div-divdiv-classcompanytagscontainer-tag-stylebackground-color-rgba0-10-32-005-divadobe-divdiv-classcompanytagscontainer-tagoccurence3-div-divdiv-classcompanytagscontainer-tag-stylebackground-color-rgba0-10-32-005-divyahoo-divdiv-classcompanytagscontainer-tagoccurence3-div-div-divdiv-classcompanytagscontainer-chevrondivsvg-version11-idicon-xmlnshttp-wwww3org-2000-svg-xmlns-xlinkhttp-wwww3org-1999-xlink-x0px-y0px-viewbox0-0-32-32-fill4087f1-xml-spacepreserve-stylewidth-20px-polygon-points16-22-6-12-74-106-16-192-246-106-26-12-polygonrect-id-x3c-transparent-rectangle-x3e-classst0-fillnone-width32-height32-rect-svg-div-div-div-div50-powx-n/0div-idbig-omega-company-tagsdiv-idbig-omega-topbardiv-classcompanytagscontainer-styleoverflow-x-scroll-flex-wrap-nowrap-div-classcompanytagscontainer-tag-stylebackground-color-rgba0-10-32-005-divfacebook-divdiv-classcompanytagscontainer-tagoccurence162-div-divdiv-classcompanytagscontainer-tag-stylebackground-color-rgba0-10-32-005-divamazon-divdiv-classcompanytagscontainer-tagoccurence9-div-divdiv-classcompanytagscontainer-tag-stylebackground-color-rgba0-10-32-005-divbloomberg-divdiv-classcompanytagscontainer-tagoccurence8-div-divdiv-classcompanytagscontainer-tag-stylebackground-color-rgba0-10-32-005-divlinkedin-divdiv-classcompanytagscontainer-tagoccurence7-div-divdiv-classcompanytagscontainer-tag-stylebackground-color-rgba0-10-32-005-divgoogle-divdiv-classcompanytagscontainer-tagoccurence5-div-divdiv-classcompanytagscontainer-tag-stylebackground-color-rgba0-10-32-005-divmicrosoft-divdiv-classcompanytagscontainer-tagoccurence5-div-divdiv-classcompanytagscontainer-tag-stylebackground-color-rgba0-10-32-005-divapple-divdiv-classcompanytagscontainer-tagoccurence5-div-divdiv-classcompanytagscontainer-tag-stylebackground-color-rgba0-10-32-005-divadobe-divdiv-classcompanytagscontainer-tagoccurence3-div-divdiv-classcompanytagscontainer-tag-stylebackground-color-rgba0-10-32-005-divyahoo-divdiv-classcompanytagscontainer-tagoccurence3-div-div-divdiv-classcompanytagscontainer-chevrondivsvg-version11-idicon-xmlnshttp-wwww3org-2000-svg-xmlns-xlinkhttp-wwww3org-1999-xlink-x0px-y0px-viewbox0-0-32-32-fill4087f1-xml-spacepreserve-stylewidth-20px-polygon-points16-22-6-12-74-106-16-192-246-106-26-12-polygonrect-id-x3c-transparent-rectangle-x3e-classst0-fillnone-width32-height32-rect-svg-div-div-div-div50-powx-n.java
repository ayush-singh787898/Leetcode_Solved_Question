class Solution {
    public double myPow(double x, int n) {
//      convert n to long variable.
        long lng=Math.abs((long)n);
        double res=1;
        while(lng>0){
//             check l is even or odd
            // if l is odd use bitwise and operator
            if((lng&1)==1){
                res=res*x;

            }
            x=x*x;
            lng>>=1;       // l is divided by 2.
        }
        return n<0?1/res:res;
    }
}
