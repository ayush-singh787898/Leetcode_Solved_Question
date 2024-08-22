class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int count=0;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }
            if(nums[i]==0){
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count==0){
                arr[i]=prod/nums[i];
            }
            if((count==1) && nums[i]==0){
                arr[i]=prod;
            }
            else if(count>=1 && nums[i]!=0){
                arr[i]=0;
            }
        }
        return arr;
    }
}