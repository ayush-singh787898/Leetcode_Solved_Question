

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        // Handle the case where k is greater than the length of the array
        k = k % nums.length;

        // Step-1: Reverse the last k elements
        int i = nums.length - k;
        int j = nums.length - 1;
        while (i < j) {
            swap(i, j, nums);
            i++;
            j--;
        }

        System.out.println("After reversing last k elements: " + Arrays.toString(nums));

        // Step-2 : Reverse the first n-k elements
        i = 0;
        j = nums.length - k - 1;
        while (i < j) {
            swap(i, j, nums);
            i++;
            j--;
        }

        System.out.println("After reversing first n-k elements: " + Arrays.toString(nums));

        // Step-3 : Reverse the complete array
        i = 0;
        j = nums.length - 1;
        while (i < j) {
            swap(i, j, nums);
            i++;
            j--;
        }

        System.out.println("After reversing the entire array: " + Arrays.toString(nums));
    }

    // Swap method
    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        sol.rotate(nums, 3);
        System.out.println("Final rotated array: " + Arrays.toString(nums));  // Output should be [5, 6, 7, 1, 2, 3, 4]
    }
}
