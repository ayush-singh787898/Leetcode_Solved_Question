class Solution {
    public boolean increasingTriplet(int[] nums){
    int n1=Integer.MAX_VALUE;
    int n2=Integer.MAX_VALUE;
    for(int i:nums){
        if(i<n1){
            n1=i;
        }
        else if(i>n1 && n2>i){
            n2=i;
        }
        else if(i>n2){
            return true;
        }
    }
        return false;
        
    }
}