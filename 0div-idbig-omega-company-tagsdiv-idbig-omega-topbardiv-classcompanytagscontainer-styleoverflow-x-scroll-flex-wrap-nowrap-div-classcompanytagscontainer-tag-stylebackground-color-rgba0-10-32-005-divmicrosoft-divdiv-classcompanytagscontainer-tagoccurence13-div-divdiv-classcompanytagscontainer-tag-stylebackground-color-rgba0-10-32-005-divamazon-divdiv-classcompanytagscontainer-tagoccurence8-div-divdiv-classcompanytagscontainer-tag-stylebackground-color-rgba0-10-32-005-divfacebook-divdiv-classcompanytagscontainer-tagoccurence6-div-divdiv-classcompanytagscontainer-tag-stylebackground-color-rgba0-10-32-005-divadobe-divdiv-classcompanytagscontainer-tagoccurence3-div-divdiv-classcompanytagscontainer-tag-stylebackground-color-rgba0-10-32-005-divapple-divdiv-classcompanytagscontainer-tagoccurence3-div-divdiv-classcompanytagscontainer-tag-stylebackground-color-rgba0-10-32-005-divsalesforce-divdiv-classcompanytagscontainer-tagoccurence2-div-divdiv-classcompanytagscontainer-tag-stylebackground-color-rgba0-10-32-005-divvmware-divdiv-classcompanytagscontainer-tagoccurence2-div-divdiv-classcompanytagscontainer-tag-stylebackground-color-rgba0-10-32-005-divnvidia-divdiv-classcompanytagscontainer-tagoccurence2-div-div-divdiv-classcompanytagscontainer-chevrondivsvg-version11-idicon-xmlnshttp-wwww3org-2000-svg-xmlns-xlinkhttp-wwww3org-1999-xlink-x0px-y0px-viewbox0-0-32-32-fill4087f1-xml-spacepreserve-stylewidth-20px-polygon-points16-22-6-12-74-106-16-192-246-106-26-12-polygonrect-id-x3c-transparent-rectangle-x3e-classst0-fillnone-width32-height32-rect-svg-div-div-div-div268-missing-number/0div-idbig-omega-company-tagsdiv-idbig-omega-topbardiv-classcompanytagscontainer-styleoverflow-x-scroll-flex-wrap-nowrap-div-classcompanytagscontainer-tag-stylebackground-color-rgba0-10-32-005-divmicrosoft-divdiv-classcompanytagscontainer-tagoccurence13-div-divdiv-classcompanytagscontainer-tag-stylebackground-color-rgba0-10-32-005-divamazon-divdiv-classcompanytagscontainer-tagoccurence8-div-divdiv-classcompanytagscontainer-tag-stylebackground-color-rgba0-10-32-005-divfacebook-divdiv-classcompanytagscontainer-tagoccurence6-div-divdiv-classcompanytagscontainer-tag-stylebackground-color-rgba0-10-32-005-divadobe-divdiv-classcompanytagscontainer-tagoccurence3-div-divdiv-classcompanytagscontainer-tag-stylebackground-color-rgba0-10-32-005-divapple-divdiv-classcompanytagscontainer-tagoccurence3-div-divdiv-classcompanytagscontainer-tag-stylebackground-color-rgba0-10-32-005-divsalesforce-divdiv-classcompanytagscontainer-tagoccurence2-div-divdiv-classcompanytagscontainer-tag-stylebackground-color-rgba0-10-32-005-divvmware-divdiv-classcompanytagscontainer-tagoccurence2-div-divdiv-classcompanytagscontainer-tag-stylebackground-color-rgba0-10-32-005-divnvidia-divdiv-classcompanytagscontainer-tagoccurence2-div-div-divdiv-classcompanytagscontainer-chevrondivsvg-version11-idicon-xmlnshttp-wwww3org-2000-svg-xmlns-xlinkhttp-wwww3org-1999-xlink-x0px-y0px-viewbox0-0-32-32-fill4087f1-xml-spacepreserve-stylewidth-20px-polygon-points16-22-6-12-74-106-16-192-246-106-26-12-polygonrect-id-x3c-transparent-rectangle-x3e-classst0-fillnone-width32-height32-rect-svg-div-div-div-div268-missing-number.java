class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        for(int i=0;i<=nums.length;i++){
            if(set.contains(count)){
                count++;
            }
            else{
                return count;
            }
        }
        return -1;
    }
}