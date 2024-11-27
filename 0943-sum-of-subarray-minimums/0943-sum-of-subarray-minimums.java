import java.util.Stack;

class Solution {
    // Function to find Next Smaller Element (NSE) indices
    public static int[] findNSE(int[] arr) {
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int[] nse = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements that are not smaller than current
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            // Assign NSE index or default value
            nse[i] = stk.isEmpty() ? n : stk.peek();
            // Push current index to stack
            stk.push(i);
        }
        return nse;
    }

    // Function to find Previous Smaller Element (PSE) indices
    public static int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements that are not smaller than current
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                stk.pop();
            }
            // Assign PSE index or default value
            pse[i] = stk.isEmpty() ? -1 : stk.peek();
            // Push current index to stack
            stk.push(i);
        }
        return pse;
    }

    // Main function to calculate the sum of subarray minimums
    public int sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        int n = arr.length;
        long total = 0; // Use long to handle overflow
        int mod = (int) (1e9 + 7);

        for (int i = 0; i < n; i++) {
            // Calculate contribution of arr[i] as the minimum in subarrays
            long left = i - pse[i];
            long right = nse[i] - i;
            total = (total + (right * left % mod) * arr[i] % mod) % mod;
        }
        return (int) total; // Convert back to int for the result
    }
}
