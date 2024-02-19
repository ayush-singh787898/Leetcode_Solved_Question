class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if(Integer.bitCount(n)==1){
            return true;
        }
        return false;
    }
}