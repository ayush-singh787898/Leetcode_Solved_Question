class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int left=0;
        int right=n-1;
        int inx=n-1;
        while(left<=right){
            int leftelm=nums[left]*nums[left];
            int rightelm=nums[right]*nums[right];
            if(leftelm<rightelm){
                res[inx--]=rightelm;
                right--;
            }
            else{
                res[inx--]=leftelm;
                left++;
            }
        }
        return res;
    }
}



// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]

