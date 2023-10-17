class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int inx=2;
        for(int i=2;i<nums.length;i++){
            if(nums[inx-2]!=nums[i]){
                nums[inx]=nums[i];
                inx++;
            }
        }
        return inx;
    }
    
}

