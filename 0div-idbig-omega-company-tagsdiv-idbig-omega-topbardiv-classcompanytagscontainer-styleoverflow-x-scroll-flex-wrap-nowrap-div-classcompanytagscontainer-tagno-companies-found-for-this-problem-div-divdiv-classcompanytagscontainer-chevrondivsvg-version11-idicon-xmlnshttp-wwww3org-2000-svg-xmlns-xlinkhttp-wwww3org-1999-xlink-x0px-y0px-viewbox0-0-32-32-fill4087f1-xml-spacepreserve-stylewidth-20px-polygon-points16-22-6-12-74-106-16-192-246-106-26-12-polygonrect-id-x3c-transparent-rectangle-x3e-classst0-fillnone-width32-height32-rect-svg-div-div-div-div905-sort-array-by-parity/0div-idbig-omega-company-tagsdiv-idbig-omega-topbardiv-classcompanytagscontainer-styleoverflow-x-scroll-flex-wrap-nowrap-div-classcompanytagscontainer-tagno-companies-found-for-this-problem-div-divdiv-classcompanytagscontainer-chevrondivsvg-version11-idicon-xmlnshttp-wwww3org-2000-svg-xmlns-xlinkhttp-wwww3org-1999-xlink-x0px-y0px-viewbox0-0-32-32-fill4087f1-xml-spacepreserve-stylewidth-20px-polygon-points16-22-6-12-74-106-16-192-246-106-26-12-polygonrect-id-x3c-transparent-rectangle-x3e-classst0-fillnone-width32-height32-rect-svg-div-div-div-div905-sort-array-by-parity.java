class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();
        if(nums.length==1){
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<even.size();i++){
            res.add(even.get(i));
        }
        for(int i=0;i<odd.size();i++){
            res.add(odd.get(i));
        }
        for(int i=0;i<res.size();i++){
            nums[i]=res.get(i);
        }
        return nums;
        
    }
}