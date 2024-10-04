class Solution {
    public int myAtoi(String s) {
        // Trim any leading or trailing whitespace from the input string
        s = s.trim();

        // If the string is empty after trimming, return 0
        if (s.length() == 0) {
            return 0;
        }

        boolean neg = false;  // Flag to indicate if the number is negative
        long ans = 0;  // Variable to store the result

        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // Get the current character

            // Handle the first character for sign determination
            if (i == 0) {
                if (ch == '-') {  // If it's a negative sign, set the flag
                    neg = true;
                    continue;
                } else if (ch == '+') {  // If it's a positive sign, continue
                    neg = false;
                    continue;
                }
            }

            // If the character is a digit, process it
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';  // Convert character to its integer value
                ans = ans * 10 + digit;  // Build the number

                // Check for overflow if the number is negative
                if (neg) {
                    long check = -ans;
                    if (check < Integer.MIN_VALUE) {  // If it goes below the minimum int value
                        return Integer.MIN_VALUE;
                    }
                } 
                // Check for overflow if the number is positive
                else {
                    if (ans > Integer.MAX_VALUE) {  // If it exceeds the maximum int value
                        return Integer.MAX_VALUE;
                    }
                }
            } else {
                // If a non-digit character is encountered, stop processing
                break;
            }
        }

        // If the number is negative, convert the result to negative
        if (neg) {
            ans = -ans;
        }

        // Return the final result as an int (long is cast to int)
        return (int) ans;
    }
}
