class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    
        }
        int maxLen=0;
        for(int num:hm.keySet()){
            if(hm.containsKey(num+1)){
                int currLen=hm.get(num)+hm.get(num+1);
                maxLen=Math.max(maxLen,currLen);

            }
        }
        return maxLen;
    }
}