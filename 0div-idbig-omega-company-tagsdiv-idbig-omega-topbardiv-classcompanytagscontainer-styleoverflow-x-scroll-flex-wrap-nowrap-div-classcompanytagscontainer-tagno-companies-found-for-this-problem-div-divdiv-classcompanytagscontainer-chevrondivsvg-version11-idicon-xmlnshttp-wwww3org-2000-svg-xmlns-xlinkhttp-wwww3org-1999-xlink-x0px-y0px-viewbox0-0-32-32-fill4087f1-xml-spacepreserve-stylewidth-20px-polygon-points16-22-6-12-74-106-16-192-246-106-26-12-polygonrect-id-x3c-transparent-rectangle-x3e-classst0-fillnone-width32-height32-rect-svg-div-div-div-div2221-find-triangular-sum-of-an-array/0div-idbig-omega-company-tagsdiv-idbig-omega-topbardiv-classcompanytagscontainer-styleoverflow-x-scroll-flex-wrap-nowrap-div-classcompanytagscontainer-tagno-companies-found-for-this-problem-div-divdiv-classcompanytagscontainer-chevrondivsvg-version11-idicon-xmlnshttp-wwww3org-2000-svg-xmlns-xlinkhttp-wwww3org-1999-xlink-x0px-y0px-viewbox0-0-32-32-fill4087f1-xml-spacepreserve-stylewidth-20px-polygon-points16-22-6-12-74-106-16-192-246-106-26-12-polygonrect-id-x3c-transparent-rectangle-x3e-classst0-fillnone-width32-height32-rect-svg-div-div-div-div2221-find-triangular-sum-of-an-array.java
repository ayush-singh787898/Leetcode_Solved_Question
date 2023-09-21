class Solution {
    public int triangularSum(int[] nums) {
        int sum=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                sum=(nums[j]+nums[j+1])%10;
                nums[j]=sum;
            }
            
        }
        return sum;
    }
}