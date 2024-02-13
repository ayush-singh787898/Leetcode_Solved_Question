class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>hmset:hm.entrySet()){
           if(hmset.getValue()>nums.length/2){
               return hmset.getKey();
           } 
        }
        return -1;
        
    }
}