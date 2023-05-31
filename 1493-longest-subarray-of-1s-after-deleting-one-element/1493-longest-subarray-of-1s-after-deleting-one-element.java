class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int countZero=0;
        int max=0;
        while(j<nums.length){
            if(nums[j]==0){
                countZero++;
            }
            // when count of zero is greater than 1;
            if(countZero>1){
                while(countZero>1){
                    if(nums[i]==0){
                        countZero--;

                    }
                    i++;

                }
            }
               // when count of zero is less than or equals to 1;

            else{
                max=Math.max(max,j-i);
            }
            j++;
        }
        return max;
        
    }
}