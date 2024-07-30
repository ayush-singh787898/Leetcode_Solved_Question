import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int row;
    int col;
    int time;

    Pair(int _row, int _col, int _time) {
        this.row = _row;
        this.col = _col;
        this.time = _time;
    }
}

class Solution {

    // Function to find the minimum time required for all oranges to rot
    public int orangesRotting(int[][] grid) {
        int n = grid.length; // Number of rows
        int m = grid[0].length; // Number of columns
        
        Queue<Pair> q = new LinkedList<>(); // Queue for BFS
        int[][] visited = new int[n][m]; // Matrix to track visited cells

        // Initialize the queue with all rotten oranges and mark them as visited
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) { // Rotten orange
                    q.add(new Pair(i, j, 0)); // Add to queue with initial time 0
                    visited[i][j] = 2; // Mark as visited
                } else {
                    visited[i][j] = 0; // Not visited
                }
            }
        }

        int time = 0; // Track the maximum time required for all oranges to rot

        // Directions for moving up, right, down, and left
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        // Perform BFS
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            time = Math.max(time, t); // Update maximum time
            q.remove();

            // Explore all 4 possible directions
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                
                // Check if the new position is within bounds and contains a fresh orange
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol, t + 1)); // Add new rotten orange to queue
                    visited[nrow][ncol] = 2; // Mark as visited
                }
            }
        }

        // Check if there are any fresh oranges left
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] != 2 && grid[i][j] == 1) {
                    return -1; // Return -1 if there's any fresh orange that can't rot
                }
            }
        }

        return time; // Return the maximum time required for all oranges to rot
    }
}
