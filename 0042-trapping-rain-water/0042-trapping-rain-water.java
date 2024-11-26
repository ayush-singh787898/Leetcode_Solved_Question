class Solution {     
    public int trap(int[] height) {         
        int h = height.length;         
        int[] suffixMax = new int[h];         
        int[] prefixMax = new int[h];          

        // Calculate prefixMax: maximum height from the start to each position
        prefixMax[0] = height[0];         
        for (int i = 1; i < h; i++) {             
            prefixMax[i] = Math.max(height[i], prefixMax[i - 1]);         
        }  

        // Calculate suffixMax: maximum height from the end to each position
        suffixMax[h - 1] = height[h - 1];         
        for (int i = h - 2; i >= 0; i--) {             
            suffixMax[i] = Math.max(height[i], suffixMax[i + 1]);         
        }         

        int total = 0;

        // Calculate total water trapped at each position
        for (int i = 0; i < h; i++) {             
            total += Math.min(suffixMax[i], prefixMax[i]) - height[i];         
        }         

        return total;     
    } 
}
