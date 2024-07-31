import java.util.*;

class Pair {
    int first;
    int second;
    int steps;

    Pair(int src, int dest, int steps) {
        this.first = src;
        this.second = dest;
        this.steps = steps;
    }
}

class Solution {
    // Function to update the matrix with the distance of each cell from the nearest 0.
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        Queue<Pair> q = new LinkedList<>();

        // Initialize the queue with all the positions of 0s in the matrix.
        // Set the distance for these positions to 0 and mark them as visited.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j, 0));  // Start steps from 0 for cells with 0
                    visited[i][j] = true;
                } else {
                    visited[i][j] = false;
                }
            }
        }

        // Define the directions for moving to the adjacent cells.
        int[] deltarow = {-1, 0, 1, 0};
        int[] deltacol = {0, 1, 0, -1};

        // Process the queue until it is empty using BFS.
        while (!q.isEmpty()) {
            Pair current = q.poll();
            int row = current.first;
            int col = current.second;
            int steps = current.steps;

            // Set the distance for the current cell.
            dist[row][col] = steps;

            // Explore the four possible directions from the current cell.
            for (int i = 0; i < 4; i++) {
                int nrow = row + deltarow[i];
                int ncol = col + deltacol[i];

                // Check if the new position is within bounds and not yet visited.
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !visited[nrow][ncol]) {
                    // Mark the new position as visited and add it to the queue with an incremented step count.
                    visited[nrow][ncol] = true;
                    q.add(new Pair(nrow, ncol, steps + 1));
                }
            }
        }

        // Return the matrix with updated distances.
        return dist;
    }
}
