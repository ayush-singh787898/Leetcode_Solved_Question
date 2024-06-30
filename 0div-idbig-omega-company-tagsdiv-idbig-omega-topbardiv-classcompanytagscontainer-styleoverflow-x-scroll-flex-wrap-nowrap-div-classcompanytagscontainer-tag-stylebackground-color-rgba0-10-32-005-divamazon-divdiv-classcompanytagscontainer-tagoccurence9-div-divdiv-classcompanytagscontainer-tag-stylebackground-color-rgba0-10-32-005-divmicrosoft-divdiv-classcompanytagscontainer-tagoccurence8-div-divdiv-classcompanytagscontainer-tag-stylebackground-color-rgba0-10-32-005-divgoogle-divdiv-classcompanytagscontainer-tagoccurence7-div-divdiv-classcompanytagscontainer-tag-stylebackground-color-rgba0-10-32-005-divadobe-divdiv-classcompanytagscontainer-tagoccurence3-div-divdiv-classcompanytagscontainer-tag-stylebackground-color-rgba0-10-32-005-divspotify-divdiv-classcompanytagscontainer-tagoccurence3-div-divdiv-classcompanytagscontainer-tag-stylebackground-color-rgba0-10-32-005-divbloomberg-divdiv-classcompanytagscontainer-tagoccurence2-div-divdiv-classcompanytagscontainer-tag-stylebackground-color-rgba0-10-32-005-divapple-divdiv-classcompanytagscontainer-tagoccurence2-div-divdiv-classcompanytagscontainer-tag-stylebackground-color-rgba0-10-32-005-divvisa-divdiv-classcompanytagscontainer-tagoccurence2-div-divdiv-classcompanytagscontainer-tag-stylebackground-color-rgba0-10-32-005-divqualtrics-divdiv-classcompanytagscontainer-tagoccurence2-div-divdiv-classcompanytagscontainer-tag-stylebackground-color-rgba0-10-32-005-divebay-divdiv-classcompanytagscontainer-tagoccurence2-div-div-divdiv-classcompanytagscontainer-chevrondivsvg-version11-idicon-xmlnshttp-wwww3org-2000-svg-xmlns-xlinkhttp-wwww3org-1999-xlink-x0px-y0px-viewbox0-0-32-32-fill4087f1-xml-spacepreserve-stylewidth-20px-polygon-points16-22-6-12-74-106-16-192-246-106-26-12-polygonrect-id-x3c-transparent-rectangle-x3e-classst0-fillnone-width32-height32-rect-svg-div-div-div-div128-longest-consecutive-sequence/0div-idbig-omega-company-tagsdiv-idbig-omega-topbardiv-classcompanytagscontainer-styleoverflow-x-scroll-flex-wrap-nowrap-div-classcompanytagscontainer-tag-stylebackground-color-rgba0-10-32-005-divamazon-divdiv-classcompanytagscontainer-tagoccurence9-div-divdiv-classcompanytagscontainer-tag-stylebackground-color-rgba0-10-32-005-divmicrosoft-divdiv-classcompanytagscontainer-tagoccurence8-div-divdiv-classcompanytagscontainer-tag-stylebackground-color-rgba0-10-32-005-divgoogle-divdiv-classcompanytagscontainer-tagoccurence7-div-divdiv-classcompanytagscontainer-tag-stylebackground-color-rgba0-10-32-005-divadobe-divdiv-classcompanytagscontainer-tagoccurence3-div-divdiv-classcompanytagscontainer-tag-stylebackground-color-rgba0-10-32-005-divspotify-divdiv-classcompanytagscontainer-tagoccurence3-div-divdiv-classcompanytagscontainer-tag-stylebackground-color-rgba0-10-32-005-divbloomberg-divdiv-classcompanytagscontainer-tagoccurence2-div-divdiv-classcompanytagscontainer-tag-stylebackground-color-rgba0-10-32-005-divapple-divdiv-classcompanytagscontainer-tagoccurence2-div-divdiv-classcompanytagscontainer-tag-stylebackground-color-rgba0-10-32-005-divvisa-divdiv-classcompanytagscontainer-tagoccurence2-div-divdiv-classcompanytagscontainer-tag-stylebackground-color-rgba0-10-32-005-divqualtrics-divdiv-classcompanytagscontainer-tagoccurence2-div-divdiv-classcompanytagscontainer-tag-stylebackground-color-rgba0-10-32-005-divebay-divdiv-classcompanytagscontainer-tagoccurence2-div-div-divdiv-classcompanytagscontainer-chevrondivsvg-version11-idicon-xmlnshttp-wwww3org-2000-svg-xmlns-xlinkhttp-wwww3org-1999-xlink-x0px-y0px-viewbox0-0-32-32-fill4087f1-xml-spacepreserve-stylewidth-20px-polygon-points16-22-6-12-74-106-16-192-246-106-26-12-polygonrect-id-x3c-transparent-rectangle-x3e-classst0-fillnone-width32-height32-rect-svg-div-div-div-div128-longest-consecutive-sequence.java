class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer>set=new HashSet<>();
        int longest=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int x=it;
                int count=1;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}