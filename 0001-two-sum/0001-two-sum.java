class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>hm=new HashMap<>();     // element,index 
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hm.containsKey(temp)){
                arr[0]=hm.get(temp);        //  index of particular element.
                arr[1]=i;    // current index
                return arr;
            }
            else{
                hm.put(nums[i],i);      // element , index is inserted
            }
        }
        return arr;
    }
}