class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long tempsum=nums[0]+nums[1]+nums[2];
        long resSum=-1;
        if(nums[0]+nums[1]>nums[2]){
             resSum=tempsum;
        }
        int i=3;
        while(i<nums.length){
            if(tempsum>nums[i]){
                tempsum+=nums[i];
                resSum=tempsum;
            }
            else {
                tempsum+=nums[i];
            }
            i++;
        }
        return  resSum;
    }
}

