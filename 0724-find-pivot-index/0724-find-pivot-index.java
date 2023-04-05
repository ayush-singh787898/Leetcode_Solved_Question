class Solution {
    public int pivotIndex(int[] nums) {        
        int LeftSum=0;
        int RightSum=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            RightSum+=nums[i];    
        }
        int i=0;
        while(i<nums.length){
            RightSum-=nums[i];
            if(RightSum==LeftSum){
                return i;
            }
            LeftSum+=nums[i];
            i++;
        }
        return -1;
    }
}