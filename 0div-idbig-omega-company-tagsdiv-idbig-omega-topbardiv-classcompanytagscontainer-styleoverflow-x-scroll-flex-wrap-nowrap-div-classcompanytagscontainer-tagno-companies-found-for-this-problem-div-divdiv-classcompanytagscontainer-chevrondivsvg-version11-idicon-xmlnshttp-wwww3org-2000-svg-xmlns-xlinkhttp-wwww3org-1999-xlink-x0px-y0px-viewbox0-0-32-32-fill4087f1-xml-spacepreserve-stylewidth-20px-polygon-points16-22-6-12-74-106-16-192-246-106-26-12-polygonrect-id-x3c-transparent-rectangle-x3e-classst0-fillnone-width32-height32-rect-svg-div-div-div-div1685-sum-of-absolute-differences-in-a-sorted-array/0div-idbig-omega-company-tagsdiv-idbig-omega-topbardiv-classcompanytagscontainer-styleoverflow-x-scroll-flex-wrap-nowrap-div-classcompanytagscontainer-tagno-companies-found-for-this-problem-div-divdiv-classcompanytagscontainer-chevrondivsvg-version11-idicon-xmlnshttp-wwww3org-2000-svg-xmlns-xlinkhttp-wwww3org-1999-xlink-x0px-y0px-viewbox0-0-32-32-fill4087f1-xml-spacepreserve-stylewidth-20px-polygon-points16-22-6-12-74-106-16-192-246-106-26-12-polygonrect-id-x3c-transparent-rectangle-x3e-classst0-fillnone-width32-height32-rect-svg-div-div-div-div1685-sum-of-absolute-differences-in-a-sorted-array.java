class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int arr[]=new int[nums.length];
        int curr=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            int leftSum=Math.abs(curr-i*nums[i]);
            int rightSum=Math.abs(sum-curr-(n-i)*nums[i]);
            int totalSum=leftSum+rightSum;
            arr[i]=totalSum;
            curr+=nums[i];
        }
        return arr;
    }
}