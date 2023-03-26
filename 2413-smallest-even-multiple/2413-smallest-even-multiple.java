class Solution {
    public int smallestEvenMultiple(int n) {
        int min=0;
        if(n%2==0){
            return n;
        }
        return n*2;       
    }
}