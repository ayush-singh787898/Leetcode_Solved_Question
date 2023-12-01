class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;      //  no. of rows
        int col=matrix[0].length;       // no. of columns
        int topRow=0;
        int bottomRow=row-1;
        int leftCol=0;
        int rightCol=col-1;
        int dir=0;      // here dir is direction that show all the four side of matrix;
        List<Integer>lst=new ArrayList<>();
        while(topRow<=bottomRow && leftCol<=rightCol){
            
//             traverse left to right
            if(dir==0){
                dir=1;
                for(int i=topRow;i<=rightCol;i++){
                    lst.add(matrix[topRow][i]);
                }
                topRow++;
            }
            
//             traverse top(from right side) to bottom (to right side)
            else if(dir==1){
                dir=2;
                for(int i=topRow;i<=bottomRow;i++){
                    lst.add(matrix[i][rightCol]);
                }
                rightCol--;
            }
            
//             traverse right side to left side
            else if(dir==2){
                dir=3;
                for(int i=rightCol;i>=leftCol;i--){
                    lst.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }
            
//             traverse bottom(from left side) to top (left side top)
            else if(dir==3){
                dir=0;
                for(int i=bottomRow;i>=topRow;i--){
                    lst.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
        }
        return lst;
    }
}