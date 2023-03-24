class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int i=0;
        int temp=n;
        int k=0;
        
        while(i<n || temp<nums.length){
            arr[k++]=nums[i];
            arr[k++]=nums[temp];
            i++;
            temp++;  
        }
        return arr;
        
    }
}