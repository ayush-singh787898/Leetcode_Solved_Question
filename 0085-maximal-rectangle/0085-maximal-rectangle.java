import java.util.Stack;

class Solution {
    // Function to calculate the largest rectangle area in a histogram
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] leftSmall = new int[n];  // Stores the index of the nearest smaller element to the left
        int[] rightSmall = new int[n]; // Stores the index of the nearest smaller element to the right

        // Calculate the nearest smaller elements on the left
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            leftSmall[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        // Clear the stack for reuse
        stack.clear();

        // Calculate the nearest smaller elements on the right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            rightSmall[i] = stack.isEmpty() ? n - 1 : stack.peek() - 1;
            stack.push(i);
        }

        int maxArea = 0;
        // Calculate the maximum area for each bar
        for (int i = 0; i < n; i++) {
            int width = rightSmall[i] - leftSmall[i] + 1;
            maxArea = Math.max(maxArea, heights[i] * width);
        }
        return maxArea;
    }

    // Main function to find the maximal rectangle in a binary matrix
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) return 0;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxRectangle = 0;

        // Iterate through each row to build the histogram
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Update heights based on the current row
                heights[j] = (matrix[i][j] == '1') ? heights[j] + 1 : 0;
            }
            // Find the maximum rectangle for the current histogram
            maxRectangle = Math.max(maxRectangle, largestRectangleArea(heights));
        }
        return maxRectangle;
    }
}
