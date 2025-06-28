// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int arr[][]=new int[matrix.length][matrix[0].length];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 arr[i][j]=matrix[i][j];
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==0){

//                     // set col value to zero but in same row 
//                     for(int k=0;k<matrix[0].length;k++){
//                         arr[i][k]=0;
//                     }

//                     // set row value to zero but in same col
//                     for(int k=0;k<matrix.length;k++){
//                         arr[k][j]=0;
//                     }
//                 }   
//             }
//         }

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 matrix[i][j]=arr[i][j];
//             }
//         }
//     }
// }







class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row[]=new boolean[matrix.length];
        boolean col[]=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}


