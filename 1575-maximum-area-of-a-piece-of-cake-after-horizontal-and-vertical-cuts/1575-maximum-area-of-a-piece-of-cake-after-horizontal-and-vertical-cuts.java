import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        // Find the maximum distance between two horizontal cuts
        int max1 = horizontalCuts[0];
        for (int i = 1; i < horizontalCuts.length; i++) {
            max1 = Math.max(max1, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        max1 = Math.max(max1, h - horizontalCuts[horizontalCuts.length - 1]);

        // Find the maximum distance between two vertical cuts
        int max2 = verticalCuts[0];
        for (int i = 1; i < verticalCuts.length; i++) {
            max2 = Math.max(max2, verticalCuts[i] - verticalCuts[i - 1]);
        }
        max2 = Math.max(max2, w - verticalCuts[verticalCuts.length - 1]);

        // Calculate the area and apply the modulus
        long mod = 1000000007;
        long area = (long) max1 * max2;
        return (int) (area % mod);
    }
}
