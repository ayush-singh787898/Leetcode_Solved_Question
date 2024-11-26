

class Solution{
    // Function to find the amount of water that can be trapped within
    // a given set of bars in linear time and extra space
    public static int trap(int[] bars){
        int n = bars.length;
        
        // base case
        if (n <= 2) {
            return 0;
        }
 
        int water = 0;
 
        // `left[i]` stores the maximum height of a bar to the left
        // of the current bar
        int[] left = new int[n-1];
        left[0] = Integer.MIN_VALUE;
 
        // process bars from left to right
        for (int i = 1; i < n - 1; i++) {
            left[i] = Integer.max(left[i - 1], bars[i - 1]);
        }
 

 
        // `right` stores the maximum height of a bar to the right
        // of the current bar
        int right = Integer.MIN_VALUE;
 
        // process bars from right to left
        for (int i = n - 2; i >= 1; i--){
            right = Integer.max(right, bars[i + 1]);
 
            // check if it is possible to store water in the current bar
            if (Integer.min(left[i], right) > bars[i]) {
                water += Integer.min(left[i], right) - bars[i];
            }
        }
 
        return water;
    }
}
