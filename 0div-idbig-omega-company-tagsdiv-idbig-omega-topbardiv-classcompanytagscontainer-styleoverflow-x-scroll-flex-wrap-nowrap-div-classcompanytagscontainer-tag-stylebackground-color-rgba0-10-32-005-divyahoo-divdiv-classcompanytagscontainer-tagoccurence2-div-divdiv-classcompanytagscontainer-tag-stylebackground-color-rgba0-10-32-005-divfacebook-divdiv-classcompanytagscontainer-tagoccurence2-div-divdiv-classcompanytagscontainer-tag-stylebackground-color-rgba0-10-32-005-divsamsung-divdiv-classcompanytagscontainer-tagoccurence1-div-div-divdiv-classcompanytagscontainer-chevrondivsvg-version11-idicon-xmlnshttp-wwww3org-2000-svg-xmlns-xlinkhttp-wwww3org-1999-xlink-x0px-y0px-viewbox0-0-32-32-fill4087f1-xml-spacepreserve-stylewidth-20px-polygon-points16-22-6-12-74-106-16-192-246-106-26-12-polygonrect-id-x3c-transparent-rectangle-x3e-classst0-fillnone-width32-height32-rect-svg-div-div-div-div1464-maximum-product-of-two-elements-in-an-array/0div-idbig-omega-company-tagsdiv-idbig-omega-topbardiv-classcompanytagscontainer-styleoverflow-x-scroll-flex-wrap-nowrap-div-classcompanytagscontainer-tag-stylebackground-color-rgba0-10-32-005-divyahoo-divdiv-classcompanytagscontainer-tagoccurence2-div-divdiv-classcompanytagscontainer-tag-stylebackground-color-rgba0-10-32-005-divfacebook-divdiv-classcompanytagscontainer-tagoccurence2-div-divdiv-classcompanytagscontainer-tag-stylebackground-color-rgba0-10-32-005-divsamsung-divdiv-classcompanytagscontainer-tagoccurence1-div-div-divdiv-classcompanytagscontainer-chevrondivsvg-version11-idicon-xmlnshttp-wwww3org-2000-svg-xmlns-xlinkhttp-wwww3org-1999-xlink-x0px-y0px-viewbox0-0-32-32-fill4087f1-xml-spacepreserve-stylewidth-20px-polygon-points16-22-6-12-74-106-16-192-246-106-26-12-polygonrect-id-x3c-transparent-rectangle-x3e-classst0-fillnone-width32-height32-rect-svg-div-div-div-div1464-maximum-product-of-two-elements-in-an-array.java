class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        if(len<2){
            return 0;
        }
        Arrays.sort(nums);
        return (nums[len-1]-1)*(nums[len-2]-1);
        
        
    }
}