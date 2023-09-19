class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            
        }        

        int res=0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
             int value=entry.getValue();
             if(value==1){
                 res=entry.getKey();
                 break;
              }
        }
        
        
        return res;
    }
}