class Solution {     
    public int largestRectangleArea(int[] heights) {         
        int h = heights.length;         
        Stack<Integer> stk = new Stack<>(); // Stack to find the nearest smaller elements
        int leftSmall[] = new int[h]; // Stores the index of the nearest smaller element to the left
        int rightSmall[] = new int[h]; // Stores the index of the nearest smaller element to the right

        // Calculate nearest smaller elements on the left for each bar
        for (int i = 0; i < h; i++) {             
            // Remove indices of bars taller than the current bar
            while (!stk.isEmpty() && heights[stk.peek()] > heights[i]) {                 
                stk.pop();             
            }             
            // If stack is empty, no smaller element exists on the left
            if (stk.isEmpty()) {                 
                leftSmall[i] = 0;             
            } else {                 
                // Nearest smaller element index + 1
                leftSmall[i] = stk.peek() + 1;             
            }             
            stk.push(i); // Push current bar index onto the stack         
        }         

        // Clear the stack for reuse in calculating right smaller elements
        while (!stk.isEmpty()) {             
            stk.pop();         
        }         

        // Calculate nearest smaller elements on the right for each bar
        for (int i = h - 1; i >= 0; i--) {             
            // Remove indices of bars taller or equal to the current bar
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) {                 
                stk.pop();             
            }             
            // If stack is empty, no smaller element exists on the right
            if (stk.isEmpty()) {                 
                rightSmall[i] = h - 1;             
            } else {                 
                // Nearest smaller element index - 1
                rightSmall[i] = stk.peek() - 1;             
            }             
            stk.push(i); // Push current bar index onto the stack         
        }         

        int maxArea = 0; // Initialize the maximum area

        // Calculate the area for each bar using its height and width
        for (int i = 0; i < h; i++) {             
            // Width is determined by the difference between right and left smaller indices
            maxArea = Math.max(maxArea, heights[i] * (rightSmall[i] - leftSmall[i] + 1));         
        }         

        return maxArea; // Return the maximum area found     
    } 
}
