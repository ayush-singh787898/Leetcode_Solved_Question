class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        
        // Step-1  : Transpose Matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }
        
        // Step-2  : revese matrix row-wise
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;            
            }
        }
    }
}