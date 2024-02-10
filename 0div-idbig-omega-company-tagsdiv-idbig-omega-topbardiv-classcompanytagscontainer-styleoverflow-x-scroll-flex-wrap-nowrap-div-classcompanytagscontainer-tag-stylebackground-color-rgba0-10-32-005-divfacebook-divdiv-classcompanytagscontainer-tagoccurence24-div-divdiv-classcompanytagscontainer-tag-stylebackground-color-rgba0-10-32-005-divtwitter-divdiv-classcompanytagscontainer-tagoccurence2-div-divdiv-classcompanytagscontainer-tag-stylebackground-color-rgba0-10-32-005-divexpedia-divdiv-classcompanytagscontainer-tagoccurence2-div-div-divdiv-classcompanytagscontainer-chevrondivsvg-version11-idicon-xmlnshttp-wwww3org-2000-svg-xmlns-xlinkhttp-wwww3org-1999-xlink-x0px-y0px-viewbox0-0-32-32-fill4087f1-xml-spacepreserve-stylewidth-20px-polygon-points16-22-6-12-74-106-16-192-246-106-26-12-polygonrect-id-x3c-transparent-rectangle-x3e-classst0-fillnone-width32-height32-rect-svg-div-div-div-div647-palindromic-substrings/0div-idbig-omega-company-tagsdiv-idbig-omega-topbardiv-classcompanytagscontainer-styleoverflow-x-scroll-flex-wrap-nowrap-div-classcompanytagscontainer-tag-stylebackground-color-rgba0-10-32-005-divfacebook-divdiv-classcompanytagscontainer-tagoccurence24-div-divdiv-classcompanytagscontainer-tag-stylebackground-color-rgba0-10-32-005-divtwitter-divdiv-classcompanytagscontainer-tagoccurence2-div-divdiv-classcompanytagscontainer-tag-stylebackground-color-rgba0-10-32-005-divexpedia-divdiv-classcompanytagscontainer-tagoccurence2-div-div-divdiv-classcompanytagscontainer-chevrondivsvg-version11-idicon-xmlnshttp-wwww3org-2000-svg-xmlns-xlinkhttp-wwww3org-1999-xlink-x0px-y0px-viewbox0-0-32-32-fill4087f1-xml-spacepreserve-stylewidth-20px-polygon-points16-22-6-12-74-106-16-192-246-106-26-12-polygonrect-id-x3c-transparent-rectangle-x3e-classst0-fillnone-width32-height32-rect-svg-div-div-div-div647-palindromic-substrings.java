class Solution {
    public int countSubstrings(String s) {
        int totalSubCount=0;
        for(int i=0;i<s.length();i++){
            // odd length palindrome
            totalSubCount+=countPalindrome(s,i,i);
            // even length palindrome
            totalSubCount+=countPalindrome(s,i,i+1);
        }
        return totalSubCount;
    }
    public static int countPalindrome(String str,int start,int end){

        int count=0;
        while(start>=0 && end<str.length() && str.charAt(start)==str.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }

    
}