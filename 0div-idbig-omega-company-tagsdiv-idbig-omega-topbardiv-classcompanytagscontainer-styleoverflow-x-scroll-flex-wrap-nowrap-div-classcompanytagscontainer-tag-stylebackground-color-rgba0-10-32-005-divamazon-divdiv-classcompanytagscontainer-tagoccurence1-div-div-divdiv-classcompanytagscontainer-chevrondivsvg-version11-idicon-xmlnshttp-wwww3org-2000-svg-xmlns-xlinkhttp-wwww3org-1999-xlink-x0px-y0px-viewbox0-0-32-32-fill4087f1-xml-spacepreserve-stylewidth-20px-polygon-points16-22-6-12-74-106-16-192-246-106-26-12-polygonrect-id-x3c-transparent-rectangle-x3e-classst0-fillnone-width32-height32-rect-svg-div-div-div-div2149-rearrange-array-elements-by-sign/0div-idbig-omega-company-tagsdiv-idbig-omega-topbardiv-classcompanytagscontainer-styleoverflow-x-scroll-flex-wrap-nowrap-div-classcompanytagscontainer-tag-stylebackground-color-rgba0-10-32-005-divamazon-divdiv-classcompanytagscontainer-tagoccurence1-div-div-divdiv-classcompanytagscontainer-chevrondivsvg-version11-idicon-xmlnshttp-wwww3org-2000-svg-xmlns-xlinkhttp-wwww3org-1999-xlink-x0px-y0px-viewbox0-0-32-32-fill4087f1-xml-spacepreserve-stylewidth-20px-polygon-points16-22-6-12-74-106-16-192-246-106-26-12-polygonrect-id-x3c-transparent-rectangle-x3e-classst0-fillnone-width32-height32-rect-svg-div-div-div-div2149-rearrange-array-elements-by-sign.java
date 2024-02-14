class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]=new int[nums.length/2];
        int neg[]=new int[nums.length/2];
        int pindx=0;
        int nindx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[pindx++]=nums[i];
            }
            else{
                neg[nindx++]=nums[i];
            }

        }
        pindx=0;
        nindx=0;
        int i=0;
        while(pindx<pos.length && nindx<neg.length){
            nums[i++]=pos[pindx];
            nums[i++]=neg[nindx];
            pindx++;
            nindx++;
        }
        return nums;
    }
}