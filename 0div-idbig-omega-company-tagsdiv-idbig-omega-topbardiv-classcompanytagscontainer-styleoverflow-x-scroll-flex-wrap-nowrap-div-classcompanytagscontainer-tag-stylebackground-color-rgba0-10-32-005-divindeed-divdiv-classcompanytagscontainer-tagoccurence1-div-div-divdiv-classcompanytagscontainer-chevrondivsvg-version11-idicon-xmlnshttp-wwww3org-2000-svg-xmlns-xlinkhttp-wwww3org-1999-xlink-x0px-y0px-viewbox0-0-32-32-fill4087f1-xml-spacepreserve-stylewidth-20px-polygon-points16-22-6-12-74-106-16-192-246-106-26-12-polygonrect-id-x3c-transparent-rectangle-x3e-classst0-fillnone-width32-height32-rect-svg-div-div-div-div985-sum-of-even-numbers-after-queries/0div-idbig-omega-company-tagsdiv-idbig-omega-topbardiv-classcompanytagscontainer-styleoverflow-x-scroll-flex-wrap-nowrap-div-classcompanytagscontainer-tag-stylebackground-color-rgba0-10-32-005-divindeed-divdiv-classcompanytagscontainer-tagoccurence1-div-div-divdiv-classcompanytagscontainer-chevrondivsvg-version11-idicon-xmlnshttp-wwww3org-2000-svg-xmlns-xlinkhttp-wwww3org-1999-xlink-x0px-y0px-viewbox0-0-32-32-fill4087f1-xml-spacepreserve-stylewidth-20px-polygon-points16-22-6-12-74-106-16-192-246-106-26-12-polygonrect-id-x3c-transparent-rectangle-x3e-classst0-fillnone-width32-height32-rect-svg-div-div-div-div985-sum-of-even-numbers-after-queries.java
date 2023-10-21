class Solution {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[]=new int[nums.length];
        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int Oneth=queries[i][1];
            for(int j=0;j<nums.length;j++){
                if(Oneth==j){
                    nums[j]+=val;
                }
            }
            int even=0;
            for(int k=0;k<nums.length;k++){
                if(nums[k]%2==0){
                    even+=nums[k];
                }
            }
            arr[i]=even;
            
        }
        return arr;
    }
}