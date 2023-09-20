class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            int countOne=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    countOne++;
                }
            }
            arr[i][0]=i;
            arr[i][1]=countOne;
        }
        Arrays.sort(arr,Comparator.comparingInt(Arr->Arr[1]));
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr[i][0];
        }
        return ans;
    }
}