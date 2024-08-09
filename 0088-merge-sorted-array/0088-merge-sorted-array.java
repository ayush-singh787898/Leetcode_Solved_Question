
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;   // Pointer for nums1
        int j = 0;   // Pointer for nums2
        int[] arr = new int[m + n];  // New array to store the merged result
        int inx = 0; // Pointer for the merged array

        // Merge the arrays while both pointers are within the bounds of m and n
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[inx] = nums1[i];
                i++;
            } else {
                arr[inx] = nums2[j];
                j++;
            }
            inx++;
        }

        // Copy any remaining elements from nums1 (if any)
        while (i < m) {
            arr[inx] = nums1[i];
            i++;
            inx++;
        }

        // Copy any remaining elements from nums2 (if any)
        while (j < n) {
            arr[inx] = nums2[j];
            j++;
            inx++;
        }

        // Copy the merged array back into nums1
        for (i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
