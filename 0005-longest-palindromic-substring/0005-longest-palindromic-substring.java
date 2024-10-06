

class Solution {    
    // Helper function to check if a substring is a palindrome
    public static boolean palindrome(String S, int i, int j) {
        while (i <= j) {
            if (S.charAt(i) != S.charAt(j)) {
                return false;  // Return false if characters at i and j don't match
            }
            i++;
            j--;
        }
        return true;  // Return true if the substring is a palindrome
    }

    // Function to find the longest palindrome substring
    public String longestPalindrome(String s) {
        int len = 0;            // Track the length of the longest palindrome
        String res = "";        // Store the result (longest palindrome)
        
        // Iterate over all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // Check if the substring s[i:j+1] is a palindrome
                if (palindrome(s, i, j)) {
                    String temp = s.substring(i, j + 1);  // Extract the palindrome substring
                    if (temp.length() > len) {  // Update result if a longer palindrome is found
                        len = temp.length();
                        res = temp;
                    }
                }
            }
        }
        return res;  // Return the longest palindrome
    }
}
