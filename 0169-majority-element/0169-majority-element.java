       
    class Solution {
        public int majorityElement(int[] nums) {
            
            
//             Method-1
            for(int i=0;i<nums.length;i++){
                int count=1;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>nums.length/2){
                    return nums[i];
                }
            }
            return -1;
            
            
            //             Method-2
            

            // Map<Integer,Integer>hm=new HashMap<>();
            // for(int i=0;i<nums.length;i++){
            //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            // }
            // for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            //     if(entry.getValue()>nums.length/2){
            //         return entry.getKey();
            //     }
            // }
            // return -1;



    //      Method-3

            // Arrays.sort(nums);
            // return nums[nums.length/2];

    }
       }