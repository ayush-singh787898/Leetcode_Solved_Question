class Solution {
    public int trailingZeroes(int n) {
        int countZeroes=0;
        while(n>0){
            n=n/5;
            countZeroes+=n;
        }
        return countZeroes;
    }
}