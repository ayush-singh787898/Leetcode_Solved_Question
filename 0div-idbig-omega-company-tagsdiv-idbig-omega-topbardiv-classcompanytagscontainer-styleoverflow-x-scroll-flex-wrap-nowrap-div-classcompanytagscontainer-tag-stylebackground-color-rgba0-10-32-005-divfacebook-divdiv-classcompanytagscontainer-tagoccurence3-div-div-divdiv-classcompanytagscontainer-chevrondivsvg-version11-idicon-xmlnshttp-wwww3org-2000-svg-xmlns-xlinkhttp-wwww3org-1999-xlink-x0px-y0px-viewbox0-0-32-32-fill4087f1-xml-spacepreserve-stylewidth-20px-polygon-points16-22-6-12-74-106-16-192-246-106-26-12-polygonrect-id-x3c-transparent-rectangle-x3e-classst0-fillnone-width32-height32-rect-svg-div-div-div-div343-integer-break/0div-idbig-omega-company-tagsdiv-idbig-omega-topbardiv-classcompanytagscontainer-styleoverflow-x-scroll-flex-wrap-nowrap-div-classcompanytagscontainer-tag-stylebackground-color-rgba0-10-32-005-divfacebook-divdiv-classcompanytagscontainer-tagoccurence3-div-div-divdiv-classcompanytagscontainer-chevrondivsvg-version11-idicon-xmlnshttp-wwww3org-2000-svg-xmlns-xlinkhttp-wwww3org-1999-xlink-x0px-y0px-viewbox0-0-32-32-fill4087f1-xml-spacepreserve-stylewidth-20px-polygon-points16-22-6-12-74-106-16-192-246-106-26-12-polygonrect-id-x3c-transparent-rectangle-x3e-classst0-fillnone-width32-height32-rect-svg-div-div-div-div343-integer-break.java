class Solution {
    public static int res(int n,int arr[]){
        if(arr[n]!=-1){
            return arr[n];
        }
        if(n==1){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int product=i*Math.max(n-i,res(n-i,arr));
             max=Math.max(max,product);
        }
        return arr[n]=max;
    }
    public int integerBreak(int n) {
        int arr[]=new int[59];
        Arrays.fill(arr,-1);
        return res(n,arr);
    }
}