class Solution {
    
    public static int arraySum(int nums[],int x){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int minOperations(int[] nums, int x) {
        int start=0;
        int end=0;
        int sum=0;
        int res=0;
        
        int totSum=arraySum(nums,x);
        System.out.println(totSum);
        if(totSum==x){
            return nums.length;
        }
        int sumToMake=totSum-x;
        while(end<nums.length){
            sum+=nums[end];
            while(start<end && sum>sumToMake){
                sum-=nums[start++];
            }
            if(sum==sumToMake){
                res=Math.max(res,end-start+1);
            }
            end++;
        }
        return res==0?-1:nums.length-res;
    }
}


































