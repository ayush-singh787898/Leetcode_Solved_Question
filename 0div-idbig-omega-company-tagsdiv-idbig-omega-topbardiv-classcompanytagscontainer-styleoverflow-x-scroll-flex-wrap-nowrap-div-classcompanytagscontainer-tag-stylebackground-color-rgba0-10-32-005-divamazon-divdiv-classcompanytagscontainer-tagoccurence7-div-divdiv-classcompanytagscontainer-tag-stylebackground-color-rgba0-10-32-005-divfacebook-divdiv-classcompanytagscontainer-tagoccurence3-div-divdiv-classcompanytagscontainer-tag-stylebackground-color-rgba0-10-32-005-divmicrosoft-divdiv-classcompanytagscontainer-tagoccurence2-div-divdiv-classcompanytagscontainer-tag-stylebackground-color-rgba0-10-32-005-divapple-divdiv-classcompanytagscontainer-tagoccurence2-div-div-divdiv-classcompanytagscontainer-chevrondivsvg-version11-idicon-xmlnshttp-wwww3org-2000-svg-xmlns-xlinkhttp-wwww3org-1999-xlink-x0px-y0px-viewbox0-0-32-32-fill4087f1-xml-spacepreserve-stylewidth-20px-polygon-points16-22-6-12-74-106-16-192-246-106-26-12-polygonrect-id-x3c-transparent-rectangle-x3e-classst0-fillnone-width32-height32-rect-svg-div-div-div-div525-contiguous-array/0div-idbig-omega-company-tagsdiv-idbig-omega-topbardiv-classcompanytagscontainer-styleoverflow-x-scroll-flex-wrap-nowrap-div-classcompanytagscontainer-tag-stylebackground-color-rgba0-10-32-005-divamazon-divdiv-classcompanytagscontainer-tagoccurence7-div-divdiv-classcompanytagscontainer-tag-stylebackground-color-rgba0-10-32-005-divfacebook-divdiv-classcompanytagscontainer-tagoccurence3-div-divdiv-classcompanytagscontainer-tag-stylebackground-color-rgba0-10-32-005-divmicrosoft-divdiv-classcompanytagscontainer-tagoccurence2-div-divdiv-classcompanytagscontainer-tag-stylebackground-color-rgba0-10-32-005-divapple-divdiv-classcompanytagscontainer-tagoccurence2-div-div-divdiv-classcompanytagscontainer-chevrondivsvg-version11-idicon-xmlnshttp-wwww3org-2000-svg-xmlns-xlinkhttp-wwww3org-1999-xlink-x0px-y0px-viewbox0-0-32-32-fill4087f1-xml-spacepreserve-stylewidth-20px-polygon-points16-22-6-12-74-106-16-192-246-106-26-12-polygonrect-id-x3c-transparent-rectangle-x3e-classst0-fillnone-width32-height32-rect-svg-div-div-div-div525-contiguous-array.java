class Solution {
    public int findMaxLength(int[] nums) {
        int res=0;
        Map<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);       // 0 is sum while -1 is index 
        int sum=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                sum+=-1;
            }
            else if(nums[i]==1){
                sum+=1;
            }
            if(hm.containsKey(sum)){
                int indx=hm.get(sum);
                int len=i-indx;
                if(len>res){
                    res=len;
                }
            }
            else{
                hm.put(sum,i);
            }
        }
        return res;
    }
}
