class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int i=0;
        int sum=max;
        while(i<gain.length){
            sum+=gain[i];
            max=Math.max(max,sum);
            i++;   
        }
     return max;   
    }
}