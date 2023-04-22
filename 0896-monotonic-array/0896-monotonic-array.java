class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length<2){
            return true;
        }
        int i;
        // when array is in descending order
        for(i=0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[j]<=nums[i]){
                continue;   
            }
            else{
                break;
            }
        }
        if(i==nums.length-1){
            return true;
        }
        // when array is in ascending order.
        for(i=0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[i]<=nums[j]){
                continue;
            }
            else{
                break;
            }
      
        }
        if(i==nums.length-1){
            return true;
        }
        // if array is in ascending and descending order
        return false;
        
        
        
    }
}