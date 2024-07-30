class Solution {
    // Perform DFS to fill the connected component of the image with the new color
    public static void dfs(int[][] image, int[][] copy, int row, int col, int color, int iniColor, int[] delrow, int[] delcol) {
        int n = image.length; 
        int m = image[0].length; 
        
        // Set the color of the current cell in the copy
        copy[row][col] = color;
        
        // Explore all four adjacent cells (up, right, down, left) from the current position
        for (int i = 0; i < 4; i++) {
            // Calculate the new row and column indices
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            
            // Check if the new cell is within the bounds of the image and has the initial color
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && copy[nrow][ncol] == iniColor) {
                // Recursively apply DFS to the new cell
                dfs(image, copy, nrow, ncol, color, iniColor, delrow, delcol);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length; 
        int m = image[0].length;
        int iniColor = image[sr][sc]; // Initial color at the starting cell
        
        // If the new color is the same as the initial color, return the original image
        if (iniColor == color) {
            return image;
        }
        
        // Create a copy of the image to apply the flood fill
        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                copy[i][j] = image[i][j];
            }
        }
        
        // Define the directions for exploring adjacent cells (up, right, down, left)
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        
        // Start the DFS flood fill from the initial cell
        dfs(image, copy, sr, sc, color, iniColor, delrow, delcol);
        return copy; 
    }
}
