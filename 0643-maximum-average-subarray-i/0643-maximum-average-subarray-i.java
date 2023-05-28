
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double ans=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        ans=sum/k;
        for(int j=k;j<nums.length;j++){
            sum+=nums[j]-nums[j-k];
            ans=Math.max(ans,sum/k);
        }
        return ans;
        

    }
}