class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();
        
        // Add all boundary land cells to the queue and mark them as visited
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || i == n - 1 || j == 0 || j == m - 1) && grid[i][j] == 1) {
                    visited[i][j] = true;
                    q.add(new Pair(i, j));
                }
            }
        }

        // Directions for the 4 possible moves (up, right, down, left)
        int[] deltarow = {-1, 0, 1, 0};
        int[] deltacol = {0, 1, 0, -1};

        // BFS to mark all reachable land cells from the boundary
        while (!q.isEmpty()) {
            // Get the current cell's row and column from the queue
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            
            // Explore all 4 possible directions
            for (int i = 0; i < 4; i++) {
                int nrow = row + deltarow[i];
                int ncol = col + deltacol[i];
                
                // Check if the new position is within bounds, is land, and has not been visited
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1 && !visited[nrow][ncol]) {
                    // Add the new position to the queue and mark it as visited
                    q.add(new Pair(nrow, ncol));
                    visited[nrow][ncol] = true;
                }
            }
        }

        // Count land cells that are not reachable from the boundary
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
