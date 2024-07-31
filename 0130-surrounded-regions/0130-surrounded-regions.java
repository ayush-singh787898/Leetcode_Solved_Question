class Solution {

    public static void dfs(int row, int col, char[][] board, boolean[][] visited, int[] deltarow, int[] deltacol) {
        visited[row][col] = true;
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < 4; i++) {
            int nrow = row + deltarow[i];
            int ncol = col + deltacol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && board[nrow][ncol] == 'O' && !visited[nrow][ncol]) {
                dfs(nrow, ncol, board, visited, deltarow, deltacol);
            }
        }
    }

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        int[] deltarow = { -1, 0, 1, 0 };
        int[] deltacol = { 0, 1, 0, -1 };

        // 1st row and last row
        for (int j = 0; j < m; j++) {
            // visit 1st row
            if (!visited[0][j] && board[0][j] == 'O') {
                dfs(0, j, board, visited, deltarow, deltacol);
            }

            // visit last row
            if (!visited[n - 1][j] && board[n - 1][j] == 'O') {
                dfs(n - 1, j, board, visited, deltarow, deltacol);
            }
        }

        // 1st col and last col
        for (int i = 0; i < n; i++) {
            // visit 1st col
            if (!visited[i][0] && board[i][0] == 'O') {
                dfs(i, 0, board, visited, deltarow, deltacol);
            }

            // visit last col
            if (!visited[i][m - 1] && board[i][m - 1] == 'O') {
                dfs(i, m - 1, board, visited, deltarow, deltacol);
            }
        }

        // traverse whole board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
