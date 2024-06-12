class Solution {
    public boolean isPowerOfThree(int n) {
       
        if(n<0) return false;
        double m=(double)n;
        while(m>1){
            m/=3;
        }
        return m==1;
    
    }
}