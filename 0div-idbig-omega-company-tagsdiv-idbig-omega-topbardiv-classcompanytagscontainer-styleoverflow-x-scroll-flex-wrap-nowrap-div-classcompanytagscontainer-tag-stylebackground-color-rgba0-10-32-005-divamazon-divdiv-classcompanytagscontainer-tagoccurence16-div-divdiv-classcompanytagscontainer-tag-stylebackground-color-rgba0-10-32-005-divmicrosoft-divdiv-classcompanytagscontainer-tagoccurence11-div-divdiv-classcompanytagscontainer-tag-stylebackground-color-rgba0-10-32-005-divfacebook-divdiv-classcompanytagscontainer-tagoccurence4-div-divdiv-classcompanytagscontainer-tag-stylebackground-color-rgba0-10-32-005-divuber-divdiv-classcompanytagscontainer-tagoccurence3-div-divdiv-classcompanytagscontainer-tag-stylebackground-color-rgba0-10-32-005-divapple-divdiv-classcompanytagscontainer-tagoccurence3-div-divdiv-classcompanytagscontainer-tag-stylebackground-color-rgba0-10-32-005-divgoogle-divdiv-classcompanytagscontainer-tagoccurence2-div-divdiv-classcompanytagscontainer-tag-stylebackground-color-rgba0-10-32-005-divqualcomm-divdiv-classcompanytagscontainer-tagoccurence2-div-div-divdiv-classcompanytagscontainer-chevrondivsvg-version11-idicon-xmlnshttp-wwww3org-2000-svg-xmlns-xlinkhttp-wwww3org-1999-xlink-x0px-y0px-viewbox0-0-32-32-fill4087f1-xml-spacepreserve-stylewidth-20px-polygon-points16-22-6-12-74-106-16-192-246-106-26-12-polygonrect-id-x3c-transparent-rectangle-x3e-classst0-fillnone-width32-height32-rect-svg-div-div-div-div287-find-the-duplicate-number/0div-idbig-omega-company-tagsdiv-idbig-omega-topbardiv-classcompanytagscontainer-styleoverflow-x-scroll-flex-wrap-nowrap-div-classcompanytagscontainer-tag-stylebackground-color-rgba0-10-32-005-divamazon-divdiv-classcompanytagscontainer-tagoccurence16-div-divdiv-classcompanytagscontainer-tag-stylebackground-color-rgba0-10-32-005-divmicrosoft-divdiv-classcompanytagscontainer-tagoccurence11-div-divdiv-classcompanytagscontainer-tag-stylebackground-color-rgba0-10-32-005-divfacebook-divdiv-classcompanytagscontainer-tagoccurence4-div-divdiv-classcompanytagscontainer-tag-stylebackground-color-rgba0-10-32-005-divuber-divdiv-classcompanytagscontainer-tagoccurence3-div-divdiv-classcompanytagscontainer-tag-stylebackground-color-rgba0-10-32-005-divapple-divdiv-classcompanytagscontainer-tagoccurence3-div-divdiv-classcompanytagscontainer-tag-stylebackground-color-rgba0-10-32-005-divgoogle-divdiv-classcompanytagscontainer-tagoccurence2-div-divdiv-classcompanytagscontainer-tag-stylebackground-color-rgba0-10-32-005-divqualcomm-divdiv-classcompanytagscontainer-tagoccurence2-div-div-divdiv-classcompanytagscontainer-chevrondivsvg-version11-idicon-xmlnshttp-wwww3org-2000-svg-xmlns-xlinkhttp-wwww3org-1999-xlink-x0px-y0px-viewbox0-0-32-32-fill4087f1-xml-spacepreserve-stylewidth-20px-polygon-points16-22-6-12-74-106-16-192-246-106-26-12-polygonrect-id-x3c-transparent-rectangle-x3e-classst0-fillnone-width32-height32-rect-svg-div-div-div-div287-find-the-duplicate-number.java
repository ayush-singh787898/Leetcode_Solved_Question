class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int dup=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                dup=nums[i];
                break;
            }
            else{
                set.add(nums[i]);
            }
        }
        return dup;
    }
}