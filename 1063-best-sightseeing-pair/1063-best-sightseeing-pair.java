class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        // Initialize maximum score and the value of values[i] + i for the current pair
        int maxScore = 0;
        int maxLeftValue = values[0]; // Represents values[i] + i for the current i

        // Iterate over the array starting from the second element
        for (int j = 1; j < values.length; j++) {
            // Calculate the score for the current pair (i, j)
            maxScore = Math.max(maxScore, maxLeftValue + values[j] - j);
            
            // Update maxLeftValue to reflect the best values[i] + i for future pairs
            maxLeftValue = Math.max(maxLeftValue, values[j] + j);
        }

        return maxScore; // Return the maximum score found
    }
}
