class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int minRight=Integer.MAX_VALUE;
        int maxLeft=0;
        
        for(int l:left){
           maxLeft=Math.max(maxLeft,l);
        }
        for(int r:right){
            minRight=Math.min(minRight,r);
        }
        return Math.max(maxLeft,n-minRight);
        
    }
}