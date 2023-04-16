class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int j=1+i;
            if(nums[i]==nums[j]){
                i++;
                j=j+2;
                count++;
            }
        }
        if(count==nums.length/2){
            return true;
        }
        return false;
        
    }
}