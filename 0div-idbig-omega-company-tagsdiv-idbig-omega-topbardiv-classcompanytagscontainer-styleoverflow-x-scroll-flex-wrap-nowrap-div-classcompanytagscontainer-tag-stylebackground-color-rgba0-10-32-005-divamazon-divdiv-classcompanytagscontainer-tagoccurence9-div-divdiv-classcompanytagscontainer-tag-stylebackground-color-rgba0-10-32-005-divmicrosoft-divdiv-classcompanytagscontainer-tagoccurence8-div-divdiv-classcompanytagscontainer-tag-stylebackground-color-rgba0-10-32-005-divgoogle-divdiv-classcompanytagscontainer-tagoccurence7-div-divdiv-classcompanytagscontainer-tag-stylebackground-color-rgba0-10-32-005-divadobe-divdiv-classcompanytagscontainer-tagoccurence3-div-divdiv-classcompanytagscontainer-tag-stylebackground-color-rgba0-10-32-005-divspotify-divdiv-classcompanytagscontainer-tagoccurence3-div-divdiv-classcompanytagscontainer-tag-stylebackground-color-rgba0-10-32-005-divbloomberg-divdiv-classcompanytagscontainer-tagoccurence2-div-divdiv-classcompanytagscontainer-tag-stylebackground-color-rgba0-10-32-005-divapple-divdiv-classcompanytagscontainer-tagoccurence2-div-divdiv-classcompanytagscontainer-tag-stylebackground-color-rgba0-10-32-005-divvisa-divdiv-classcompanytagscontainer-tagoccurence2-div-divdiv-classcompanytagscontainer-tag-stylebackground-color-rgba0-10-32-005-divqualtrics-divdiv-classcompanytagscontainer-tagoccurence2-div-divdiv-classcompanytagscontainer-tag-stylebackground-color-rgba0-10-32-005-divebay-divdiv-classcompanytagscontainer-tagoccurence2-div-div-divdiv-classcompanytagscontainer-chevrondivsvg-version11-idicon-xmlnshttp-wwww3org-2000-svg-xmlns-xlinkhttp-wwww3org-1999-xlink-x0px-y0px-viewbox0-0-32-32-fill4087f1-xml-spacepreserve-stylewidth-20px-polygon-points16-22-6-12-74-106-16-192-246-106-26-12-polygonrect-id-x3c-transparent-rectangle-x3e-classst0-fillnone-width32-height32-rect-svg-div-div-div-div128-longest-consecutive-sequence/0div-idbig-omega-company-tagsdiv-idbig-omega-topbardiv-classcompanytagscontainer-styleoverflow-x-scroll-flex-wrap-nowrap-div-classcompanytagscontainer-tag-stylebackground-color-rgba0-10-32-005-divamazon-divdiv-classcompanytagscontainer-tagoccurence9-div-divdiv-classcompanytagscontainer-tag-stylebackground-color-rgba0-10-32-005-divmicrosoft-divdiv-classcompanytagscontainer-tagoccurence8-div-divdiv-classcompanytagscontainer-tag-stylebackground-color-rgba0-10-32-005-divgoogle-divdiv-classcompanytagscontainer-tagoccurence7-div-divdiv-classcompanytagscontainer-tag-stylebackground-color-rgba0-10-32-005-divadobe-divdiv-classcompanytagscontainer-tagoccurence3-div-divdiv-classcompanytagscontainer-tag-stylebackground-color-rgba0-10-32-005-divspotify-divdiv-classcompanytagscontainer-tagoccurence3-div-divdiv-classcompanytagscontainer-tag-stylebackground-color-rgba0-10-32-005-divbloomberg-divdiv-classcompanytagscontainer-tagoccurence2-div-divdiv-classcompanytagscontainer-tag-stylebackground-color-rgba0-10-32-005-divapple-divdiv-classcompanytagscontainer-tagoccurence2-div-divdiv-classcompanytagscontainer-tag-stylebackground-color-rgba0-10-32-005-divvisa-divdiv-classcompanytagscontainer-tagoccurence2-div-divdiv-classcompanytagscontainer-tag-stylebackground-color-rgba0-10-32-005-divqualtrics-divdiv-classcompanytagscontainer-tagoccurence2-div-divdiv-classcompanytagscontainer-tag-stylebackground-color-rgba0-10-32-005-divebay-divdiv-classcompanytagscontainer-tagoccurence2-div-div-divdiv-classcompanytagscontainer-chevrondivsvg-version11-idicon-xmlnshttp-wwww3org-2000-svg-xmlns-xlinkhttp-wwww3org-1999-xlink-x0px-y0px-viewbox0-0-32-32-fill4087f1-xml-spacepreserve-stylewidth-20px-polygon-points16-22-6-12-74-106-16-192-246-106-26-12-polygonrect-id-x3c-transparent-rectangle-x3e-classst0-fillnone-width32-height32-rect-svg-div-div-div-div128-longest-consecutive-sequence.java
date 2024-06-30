import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int curDif = 0;
        int maxi = 1; // at least one number is a consecutive sequence
        int count = 1; // to count the current sequence
        int prev = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            curDif = nums[i] - nums[i - 1];
            if (curDif == 1) {
                count++;
            } else if (curDif > 1) {
                count = 1; // reset the count if the current difference is greater than 1
            }
            prev = nums[i];
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
}
