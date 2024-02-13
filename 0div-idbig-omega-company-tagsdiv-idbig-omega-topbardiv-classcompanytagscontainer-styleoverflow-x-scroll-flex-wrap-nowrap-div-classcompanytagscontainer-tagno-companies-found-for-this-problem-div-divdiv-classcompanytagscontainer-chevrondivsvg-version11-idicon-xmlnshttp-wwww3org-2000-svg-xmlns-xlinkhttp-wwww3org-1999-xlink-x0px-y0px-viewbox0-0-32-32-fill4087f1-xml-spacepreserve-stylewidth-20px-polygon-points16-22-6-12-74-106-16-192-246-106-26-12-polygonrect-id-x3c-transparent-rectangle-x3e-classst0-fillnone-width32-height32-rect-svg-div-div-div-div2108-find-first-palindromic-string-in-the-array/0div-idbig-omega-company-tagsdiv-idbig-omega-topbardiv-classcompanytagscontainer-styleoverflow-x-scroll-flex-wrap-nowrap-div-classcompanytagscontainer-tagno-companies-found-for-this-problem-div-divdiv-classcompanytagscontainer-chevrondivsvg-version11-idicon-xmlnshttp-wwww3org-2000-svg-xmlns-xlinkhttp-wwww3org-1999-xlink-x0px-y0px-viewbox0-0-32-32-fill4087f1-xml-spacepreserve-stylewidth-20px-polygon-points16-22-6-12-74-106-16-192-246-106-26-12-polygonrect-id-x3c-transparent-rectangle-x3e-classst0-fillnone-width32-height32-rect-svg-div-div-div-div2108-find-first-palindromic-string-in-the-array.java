class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            StringBuilder reverseString = new StringBuilder(word).reverse();
            if(word.equals(reverseString.toString())){
                return word;
            }
        }
        
        return "";
    }
}