class Solution {
    public int findDuplicate(int[] nums) {
        int arr[]=new int[100000];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;
        }
        for(int i=0;i<100000;i++){
            if(arr[i]>1){
                return i+1;
            }
        }
        return 0;
    }
}