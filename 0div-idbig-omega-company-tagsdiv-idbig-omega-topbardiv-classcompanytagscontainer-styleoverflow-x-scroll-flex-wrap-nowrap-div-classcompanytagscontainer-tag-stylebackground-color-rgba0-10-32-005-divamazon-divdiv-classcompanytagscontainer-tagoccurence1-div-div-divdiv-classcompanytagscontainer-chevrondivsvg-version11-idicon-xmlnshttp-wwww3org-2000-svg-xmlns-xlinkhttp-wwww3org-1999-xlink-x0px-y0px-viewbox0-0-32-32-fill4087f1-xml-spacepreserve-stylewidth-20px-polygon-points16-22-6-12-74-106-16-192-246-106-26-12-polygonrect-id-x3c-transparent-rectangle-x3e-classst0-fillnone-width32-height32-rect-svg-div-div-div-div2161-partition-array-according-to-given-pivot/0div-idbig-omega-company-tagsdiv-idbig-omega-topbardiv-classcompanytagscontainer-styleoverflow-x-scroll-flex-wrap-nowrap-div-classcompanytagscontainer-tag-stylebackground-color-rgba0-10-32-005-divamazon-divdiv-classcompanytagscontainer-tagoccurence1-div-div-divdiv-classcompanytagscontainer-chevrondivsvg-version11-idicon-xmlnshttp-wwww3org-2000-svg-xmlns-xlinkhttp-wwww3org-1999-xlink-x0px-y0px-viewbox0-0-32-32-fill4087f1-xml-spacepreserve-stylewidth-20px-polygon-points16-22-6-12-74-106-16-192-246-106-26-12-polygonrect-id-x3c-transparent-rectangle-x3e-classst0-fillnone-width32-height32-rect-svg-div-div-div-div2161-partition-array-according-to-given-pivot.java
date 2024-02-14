class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count=0;
        int cPivot=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                count++;
            }
            if(nums[i]==pivot){
                cPivot++;
            }
        }
        int[]res=new int[nums.length];
        res[count]=pivot;
        int indx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                res[indx++]=nums[i];
            }
        }
        int x=0;
        indx=indx+1;        
        while(x<cPivot-1){
            res[indx++]=pivot;
            x++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                res[indx++]=nums[i];
            }
        }
        return res;     
    }
}