class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int temp=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                temp=nums[i]%10;
                sum2+=temp;
                
                nums[i]=nums[i]/10;
            }
        }   
        return sum-sum2;
    }
}