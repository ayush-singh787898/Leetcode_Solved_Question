class Solution {
    public static int arrays(int arr[],int i,int val){
        for(int j=0;j<arr.length;j++){
            if(i==j){
                arr[i]=arr[i]+val;
            }
        }
        int sum=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                sum+=arr[j];
            }
        }
        return sum;
    }
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[]=new int[nums.length];
        int val=0;
        for(int i=0;i<queries.length;i++){
            // for(int j=i;j<queries[i].length-1;j++){
                for(int j=0;j<1;j++){

                val=arrays(nums,queries[i][1],queries[i][0]);
            }
            arr[i]=val;
        }
        return arr;
    }
}