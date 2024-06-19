class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(i<nums.length && nums[i]!=0){
                count++;
                i++;
            }
            maxi=Math.max(count,maxi);
        }
        return maxi;
    }
}