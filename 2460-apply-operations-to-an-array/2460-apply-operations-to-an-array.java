class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        // shift 0 to right side;
        
        
        int[] arr=new int[nums.length];
        int j=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=0){
                arr[j]=nums[i];
                j++;
            }
            i++;
        }
        return arr;
    }
}