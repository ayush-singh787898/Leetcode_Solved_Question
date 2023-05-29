class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int zc=0;
        int ans=0;
        while(j<nums.length){
            if(nums[j]==0){
                zc++;
            }
            while(zc>k){
                if(nums[i]==0){
                    zc--;
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
        
    }
}