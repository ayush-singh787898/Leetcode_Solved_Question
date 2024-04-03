class Solution {
    
    public static boolean travelAndFindPath(char[][] board, String word, int i, int j, String result, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(result.length())) {
            return false;
        }
        
        visited[i][j] = true;
        result += board[i][j];
        
        if (result.equals(word)) {
            visited[i][j] = false; // Reset visited for backtracking
            return true;
        }
        
        // North-traversal
        if (travelAndFindPath(board, word, i - 1, j, result, visited)){
            return true;    
        } 
        // East-traversal
        if (travelAndFindPath(board, word, i, j + 1, result, visited)){
            return true;
        } 
        // West-traversal
        if (travelAndFindPath(board, word, i, j - 1, result, visited)){
            return true;
        }
        // South-traversal
        if (travelAndFindPath(board, word, i + 1, j, result, visited)){
            return true;
        } 
        
        visited[i][j] = false; // Reset visited for backtracking
        return false;
    }
    
    public static boolean isPath(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && !visited[i][j]) {
                    String result = "";
                    if (travelAndFindPath(board, word, i, j, result, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        return isPath(board, word);
    }
}
