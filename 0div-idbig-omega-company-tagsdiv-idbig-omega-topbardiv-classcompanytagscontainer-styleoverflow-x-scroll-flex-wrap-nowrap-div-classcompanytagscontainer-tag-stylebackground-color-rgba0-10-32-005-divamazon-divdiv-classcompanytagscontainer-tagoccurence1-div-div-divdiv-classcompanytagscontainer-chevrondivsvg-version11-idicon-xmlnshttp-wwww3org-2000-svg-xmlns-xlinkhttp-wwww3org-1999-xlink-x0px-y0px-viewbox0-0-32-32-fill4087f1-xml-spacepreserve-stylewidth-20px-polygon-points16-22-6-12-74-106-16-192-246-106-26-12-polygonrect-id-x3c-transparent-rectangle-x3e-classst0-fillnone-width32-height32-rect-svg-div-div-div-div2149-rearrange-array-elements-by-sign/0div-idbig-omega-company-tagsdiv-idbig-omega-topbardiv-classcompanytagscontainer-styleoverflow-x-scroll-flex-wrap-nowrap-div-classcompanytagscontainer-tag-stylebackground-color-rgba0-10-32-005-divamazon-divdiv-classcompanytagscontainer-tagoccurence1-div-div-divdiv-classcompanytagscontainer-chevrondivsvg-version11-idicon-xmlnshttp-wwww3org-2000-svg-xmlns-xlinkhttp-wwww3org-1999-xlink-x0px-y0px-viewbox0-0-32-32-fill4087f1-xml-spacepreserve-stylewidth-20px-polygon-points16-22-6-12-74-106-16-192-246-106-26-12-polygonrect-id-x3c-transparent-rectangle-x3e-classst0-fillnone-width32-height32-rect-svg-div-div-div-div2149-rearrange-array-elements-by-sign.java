class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []pos=new int[nums.length/2];
        int []neg=new int[nums.length/2];
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>00){
                pos[p++]=nums[i];
            }
            else{
                neg[n++]=nums[i];
            }
        }
        int flag=0;
         p=0;n=0;
        for(int i=0;i<nums.length;i++){
            if(flag==0){
                nums[i]=pos[p++];
                flag=1;
            }
            else if(flag==1){
                nums[i]=neg[n++];
                flag=0;
            }
            
        }
        return nums;
    }
}