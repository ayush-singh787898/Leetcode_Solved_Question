class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        while(i<nums.length){
            sum+=nums[i];
            while(sum>=target){
                sum=sum-nums[j];
                min=Math.min(min,i-j+1);
                j++;
            }
            i++;
            
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}





