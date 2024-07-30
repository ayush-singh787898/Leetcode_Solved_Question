class Solution {

    // Perform DFS to mark all cells in the current island as visited
    static void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        // Check for valid and unvisited '1' cells
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true; // Mark as visited

        // Explore the four possible directions (up, down, left, right)
        dfs(grid, visited, i, j + 1); // right
        dfs(grid, visited, i, j - 1); // left
        dfs(grid, visited, i - 1, j); // up
        dfs(grid, visited, i + 1, j); // down
    }

    // Function to find the number of islands
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int numIslands = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {     // Check if cell is '1' and not visited
                    dfs(grid, visited, i, j);
                    numIslands++; 
                }
            }
        }
        return numIslands;
    }
}
