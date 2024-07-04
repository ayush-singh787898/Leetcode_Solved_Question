class Solution {

    public void setZeroes(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix[0].length];
        
        // Initialize arr with the values from matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[i][j] = matrix[i][j];
            }
        }
        
        // Process the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    // Set the entire row and column in arr to 0
                    for (int k = 0; k < matrix[0].length; k++) {
                        arr[i][k] = 0;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        arr[k][j] = 0;
                    }
                }
            }
        }
        
        // Copy arr to matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
























