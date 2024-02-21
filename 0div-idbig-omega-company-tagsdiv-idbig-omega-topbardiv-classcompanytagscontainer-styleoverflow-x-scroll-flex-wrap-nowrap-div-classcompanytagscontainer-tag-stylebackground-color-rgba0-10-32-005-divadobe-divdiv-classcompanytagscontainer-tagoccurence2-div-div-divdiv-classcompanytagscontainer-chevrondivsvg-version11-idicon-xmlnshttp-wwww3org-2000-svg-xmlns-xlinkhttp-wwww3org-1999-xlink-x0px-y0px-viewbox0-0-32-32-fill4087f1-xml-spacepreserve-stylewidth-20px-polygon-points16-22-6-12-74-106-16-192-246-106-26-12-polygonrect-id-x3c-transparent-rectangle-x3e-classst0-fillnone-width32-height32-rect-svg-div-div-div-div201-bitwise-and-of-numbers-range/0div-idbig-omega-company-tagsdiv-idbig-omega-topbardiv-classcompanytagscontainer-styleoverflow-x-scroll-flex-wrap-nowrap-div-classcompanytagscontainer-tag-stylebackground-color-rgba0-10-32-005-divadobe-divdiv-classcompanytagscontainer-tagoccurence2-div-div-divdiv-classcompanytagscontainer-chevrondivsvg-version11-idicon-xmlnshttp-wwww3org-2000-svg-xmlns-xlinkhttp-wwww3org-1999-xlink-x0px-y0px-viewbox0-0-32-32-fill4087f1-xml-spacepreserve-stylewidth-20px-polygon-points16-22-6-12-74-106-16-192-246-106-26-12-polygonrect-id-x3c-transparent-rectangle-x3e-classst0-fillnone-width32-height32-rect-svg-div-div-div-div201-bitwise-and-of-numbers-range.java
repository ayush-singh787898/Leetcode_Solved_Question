class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count=0;
        while(left!=right){
            left>>=1;       // bitwise right shifting by 1.
            right>>=1;
            count++;
        }
        return right<<count;        // bitwise left shifting by count 

    }
}