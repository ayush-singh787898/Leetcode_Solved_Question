
class Solution {
    public int maximumSwap(int num) {
        // Step 1: Extract digits into a list
        List<Integer> lst = new ArrayList<>();
        int originalNum = num; // Store the original number for reference

        while (num > 0) {
            int rem = num % 10;
            lst.add(rem);
            num /= 10;
        }

        // Reverse the list to have the digits in the original order
        List<Integer> digits = new ArrayList<>();
        for (int i = lst.size() - 1; i >= 0; i--) {
            digits.add(lst.get(i));
        }

        // Step 2: Find the last occurrence of each digit
        int[] last = new int[10]; // Array to track the last position of each digit (0-9)
        for (int i = 0; i < digits.size(); i++) {
            last[digits.get(i)] = i; // Store the last position of each digit
        }

        // Step 3: Find the first digit that can be swapped to form the maximum number
        for (int i = 0; i < digits.size(); i++) {
            // Check for digits greater than digits.get(i) that appear later
            for (int d = 9; d > digits.get(i); d--) {
                if (last[d] > i) { // If the digit d occurs after position i
                    // Swap digits
                    int temp = digits.get(i);
                    digits.set(i, d);
                    digits.set(last[d], temp);
                    // Step 4: Convert the list back to a number and return
                    return convertListToNumber(digits);
                }
            }
        }

        // If no swap is made, return the original number
        return originalNum;
    }

    // Helper method to convert the list of digits back to a number
    private int convertListToNumber(List<Integer> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            result = result * 10 + lst.get(i);
        }
        return result;
    }

}

