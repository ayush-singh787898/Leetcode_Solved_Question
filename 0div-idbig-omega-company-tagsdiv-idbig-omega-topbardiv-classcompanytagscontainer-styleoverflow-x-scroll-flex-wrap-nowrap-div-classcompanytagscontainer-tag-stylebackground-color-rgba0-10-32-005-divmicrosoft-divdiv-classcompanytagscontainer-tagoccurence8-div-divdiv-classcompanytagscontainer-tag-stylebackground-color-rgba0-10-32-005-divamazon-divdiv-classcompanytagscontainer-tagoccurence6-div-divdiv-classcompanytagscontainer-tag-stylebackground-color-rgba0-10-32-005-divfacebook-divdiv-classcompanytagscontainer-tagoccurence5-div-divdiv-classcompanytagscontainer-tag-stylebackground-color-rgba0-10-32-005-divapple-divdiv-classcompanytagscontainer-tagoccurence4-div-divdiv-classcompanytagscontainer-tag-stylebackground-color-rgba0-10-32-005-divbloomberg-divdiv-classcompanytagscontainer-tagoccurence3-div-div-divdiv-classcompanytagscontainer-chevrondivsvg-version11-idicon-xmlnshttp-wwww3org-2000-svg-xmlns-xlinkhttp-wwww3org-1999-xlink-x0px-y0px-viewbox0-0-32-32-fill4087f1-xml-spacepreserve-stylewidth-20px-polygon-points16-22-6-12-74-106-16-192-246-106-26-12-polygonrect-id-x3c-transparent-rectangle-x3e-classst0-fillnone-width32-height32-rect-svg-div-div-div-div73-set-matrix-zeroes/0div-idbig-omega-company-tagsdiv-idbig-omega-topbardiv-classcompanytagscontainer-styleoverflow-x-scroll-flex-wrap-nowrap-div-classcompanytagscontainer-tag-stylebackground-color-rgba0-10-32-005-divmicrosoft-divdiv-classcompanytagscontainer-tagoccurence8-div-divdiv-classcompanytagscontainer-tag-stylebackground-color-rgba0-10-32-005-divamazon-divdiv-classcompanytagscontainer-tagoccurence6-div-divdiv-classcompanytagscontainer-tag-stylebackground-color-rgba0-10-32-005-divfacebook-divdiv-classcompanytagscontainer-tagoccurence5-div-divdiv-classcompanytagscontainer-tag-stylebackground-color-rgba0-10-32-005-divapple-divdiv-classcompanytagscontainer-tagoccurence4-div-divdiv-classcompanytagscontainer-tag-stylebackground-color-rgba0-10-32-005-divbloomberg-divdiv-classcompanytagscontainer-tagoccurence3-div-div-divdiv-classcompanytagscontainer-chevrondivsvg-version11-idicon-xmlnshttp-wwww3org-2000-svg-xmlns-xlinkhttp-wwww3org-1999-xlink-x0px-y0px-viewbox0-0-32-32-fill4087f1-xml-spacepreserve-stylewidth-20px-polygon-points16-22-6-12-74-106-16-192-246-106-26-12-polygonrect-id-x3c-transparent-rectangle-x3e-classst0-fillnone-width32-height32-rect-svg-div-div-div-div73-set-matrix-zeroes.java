class Solution {


    public void setZeroes(int[][] matrix) {
        boolean rowZero=false;
        boolean colZero=false;
        
//          Set markers in first row and first column
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0){
                        rowZero=true;
                    }
                    if(j==0){
                        colZero=true;
                    }
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

//         Replace inner matrix
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
//         Last remaining checks
        if(rowZero){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
            
        }
        if(colZero){
            for(int j=0;j<matrix.length;j++){
                matrix[j][0]=0;
            }
        }
    }
}