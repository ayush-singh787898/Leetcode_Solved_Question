class Solution {
     public static boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)) == true) {
                newStr.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println("new String: " + newStr);
        StringBuilder revstr = new StringBuilder();
        for (int i = newStr.length() - 1; i >= 0; i--) {
            revstr.append(newStr.charAt(i));
        }
        boolean palindrome = false;
        if (revstr.toString().equals(newStr.toString())) {
            palindrome = true;
        } else {
            palindrome = false;
        }

        return palindrome;
    }
}