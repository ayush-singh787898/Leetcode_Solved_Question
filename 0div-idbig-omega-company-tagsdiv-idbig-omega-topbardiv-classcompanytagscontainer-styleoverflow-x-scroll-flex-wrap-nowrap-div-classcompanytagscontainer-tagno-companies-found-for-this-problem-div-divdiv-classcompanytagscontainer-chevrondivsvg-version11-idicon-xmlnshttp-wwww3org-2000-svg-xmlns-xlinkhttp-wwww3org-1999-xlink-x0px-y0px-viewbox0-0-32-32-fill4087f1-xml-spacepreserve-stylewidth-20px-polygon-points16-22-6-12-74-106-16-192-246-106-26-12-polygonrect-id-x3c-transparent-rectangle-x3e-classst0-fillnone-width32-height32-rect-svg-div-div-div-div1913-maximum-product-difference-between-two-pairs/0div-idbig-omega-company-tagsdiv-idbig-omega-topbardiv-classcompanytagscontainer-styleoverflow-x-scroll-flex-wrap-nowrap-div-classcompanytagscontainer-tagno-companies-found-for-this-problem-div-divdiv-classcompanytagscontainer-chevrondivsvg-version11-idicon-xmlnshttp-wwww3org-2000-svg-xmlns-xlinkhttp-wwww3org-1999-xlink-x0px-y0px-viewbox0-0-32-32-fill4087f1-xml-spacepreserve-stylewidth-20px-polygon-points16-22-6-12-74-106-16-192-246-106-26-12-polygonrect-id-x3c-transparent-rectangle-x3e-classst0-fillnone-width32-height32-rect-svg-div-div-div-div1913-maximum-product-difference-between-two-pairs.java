class Solution {
    public int maxProductDifference(int[] nums) {
        if(nums.length<4){
            return 0;
        }
        Arrays.sort(nums);
        return((nums[nums.length-1]*nums[nums.length-2])-nums[1]*nums[0]);
    }
}