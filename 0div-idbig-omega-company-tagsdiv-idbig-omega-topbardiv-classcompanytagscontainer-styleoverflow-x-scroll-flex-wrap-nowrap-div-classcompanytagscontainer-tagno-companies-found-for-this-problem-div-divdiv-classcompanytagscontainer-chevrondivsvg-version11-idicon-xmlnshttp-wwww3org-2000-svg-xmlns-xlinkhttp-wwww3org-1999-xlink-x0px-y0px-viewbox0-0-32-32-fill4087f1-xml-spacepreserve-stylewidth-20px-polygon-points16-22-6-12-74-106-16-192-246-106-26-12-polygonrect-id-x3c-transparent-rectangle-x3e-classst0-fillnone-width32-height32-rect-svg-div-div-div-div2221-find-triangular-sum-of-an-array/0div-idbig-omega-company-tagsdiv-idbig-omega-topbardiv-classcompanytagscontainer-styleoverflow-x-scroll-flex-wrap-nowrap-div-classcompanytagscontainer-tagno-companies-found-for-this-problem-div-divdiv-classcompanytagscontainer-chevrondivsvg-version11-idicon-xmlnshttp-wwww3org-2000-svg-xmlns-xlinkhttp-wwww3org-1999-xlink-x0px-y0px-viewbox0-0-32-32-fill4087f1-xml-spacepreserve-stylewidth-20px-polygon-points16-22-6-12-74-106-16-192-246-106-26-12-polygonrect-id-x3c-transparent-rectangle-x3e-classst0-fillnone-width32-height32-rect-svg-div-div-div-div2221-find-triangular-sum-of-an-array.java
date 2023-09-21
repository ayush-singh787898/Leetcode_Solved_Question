class Solution {
    public int triangularSum(int[] nums) {
   int sum=0;
        if(nums.length==1){
            return nums[0];
        }
        // List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            // List<Integer>lst=new ArrayList<>();
            for(int j=0;j<nums.length-i-1;j++){
                sum=(nums[j]+nums[j+1])%10;
                nums[j]=sum;
                // System.out.print(sum+" ");
            }
            
        }
        return sum;
    }
}