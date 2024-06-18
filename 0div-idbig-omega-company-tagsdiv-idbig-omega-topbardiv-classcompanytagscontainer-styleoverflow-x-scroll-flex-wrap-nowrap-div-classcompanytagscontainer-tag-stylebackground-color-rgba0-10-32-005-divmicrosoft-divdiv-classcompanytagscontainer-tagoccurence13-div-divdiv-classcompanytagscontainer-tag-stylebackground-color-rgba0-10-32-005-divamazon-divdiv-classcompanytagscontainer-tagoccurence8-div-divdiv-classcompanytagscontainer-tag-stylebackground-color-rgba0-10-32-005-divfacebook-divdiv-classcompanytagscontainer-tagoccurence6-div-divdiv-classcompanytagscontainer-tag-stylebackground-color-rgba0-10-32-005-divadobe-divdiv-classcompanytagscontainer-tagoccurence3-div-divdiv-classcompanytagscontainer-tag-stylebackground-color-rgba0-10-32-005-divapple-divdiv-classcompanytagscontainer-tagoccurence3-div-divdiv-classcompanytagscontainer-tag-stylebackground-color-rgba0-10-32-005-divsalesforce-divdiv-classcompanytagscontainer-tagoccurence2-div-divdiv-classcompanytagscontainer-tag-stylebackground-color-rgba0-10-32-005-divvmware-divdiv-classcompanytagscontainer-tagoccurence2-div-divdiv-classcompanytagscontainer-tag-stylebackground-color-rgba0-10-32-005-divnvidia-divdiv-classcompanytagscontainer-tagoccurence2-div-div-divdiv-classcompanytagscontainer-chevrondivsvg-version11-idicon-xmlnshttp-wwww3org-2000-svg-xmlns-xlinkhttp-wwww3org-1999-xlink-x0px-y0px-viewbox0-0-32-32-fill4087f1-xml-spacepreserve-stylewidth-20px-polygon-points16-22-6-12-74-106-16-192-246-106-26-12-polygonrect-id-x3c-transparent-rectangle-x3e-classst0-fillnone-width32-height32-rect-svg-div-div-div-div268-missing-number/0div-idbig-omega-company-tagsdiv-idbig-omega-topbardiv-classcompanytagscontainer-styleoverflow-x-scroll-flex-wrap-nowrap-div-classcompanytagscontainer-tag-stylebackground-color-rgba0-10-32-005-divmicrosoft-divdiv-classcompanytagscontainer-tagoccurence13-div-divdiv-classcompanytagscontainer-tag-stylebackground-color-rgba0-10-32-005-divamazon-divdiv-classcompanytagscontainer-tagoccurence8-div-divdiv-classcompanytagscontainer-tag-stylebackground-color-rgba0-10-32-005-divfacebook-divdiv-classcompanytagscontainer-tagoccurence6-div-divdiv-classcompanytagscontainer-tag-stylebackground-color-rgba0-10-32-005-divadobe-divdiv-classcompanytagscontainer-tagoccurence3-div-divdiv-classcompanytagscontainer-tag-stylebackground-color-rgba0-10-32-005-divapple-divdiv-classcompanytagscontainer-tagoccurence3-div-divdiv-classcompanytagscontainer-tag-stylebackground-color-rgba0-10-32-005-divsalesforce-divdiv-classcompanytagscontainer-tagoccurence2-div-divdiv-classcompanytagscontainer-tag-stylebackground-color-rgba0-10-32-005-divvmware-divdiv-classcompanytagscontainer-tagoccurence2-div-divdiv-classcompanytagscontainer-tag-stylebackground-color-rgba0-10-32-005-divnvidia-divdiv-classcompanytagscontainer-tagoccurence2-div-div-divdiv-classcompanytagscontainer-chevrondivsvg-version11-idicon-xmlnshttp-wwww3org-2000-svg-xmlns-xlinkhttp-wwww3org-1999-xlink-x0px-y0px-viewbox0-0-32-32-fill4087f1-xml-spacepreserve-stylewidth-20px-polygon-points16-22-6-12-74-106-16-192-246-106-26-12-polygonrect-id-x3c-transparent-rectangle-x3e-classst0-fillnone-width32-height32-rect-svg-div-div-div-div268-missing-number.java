class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        if(n!=nums[n-1]){
            return n;
        }
        return -1;
        
    }
}