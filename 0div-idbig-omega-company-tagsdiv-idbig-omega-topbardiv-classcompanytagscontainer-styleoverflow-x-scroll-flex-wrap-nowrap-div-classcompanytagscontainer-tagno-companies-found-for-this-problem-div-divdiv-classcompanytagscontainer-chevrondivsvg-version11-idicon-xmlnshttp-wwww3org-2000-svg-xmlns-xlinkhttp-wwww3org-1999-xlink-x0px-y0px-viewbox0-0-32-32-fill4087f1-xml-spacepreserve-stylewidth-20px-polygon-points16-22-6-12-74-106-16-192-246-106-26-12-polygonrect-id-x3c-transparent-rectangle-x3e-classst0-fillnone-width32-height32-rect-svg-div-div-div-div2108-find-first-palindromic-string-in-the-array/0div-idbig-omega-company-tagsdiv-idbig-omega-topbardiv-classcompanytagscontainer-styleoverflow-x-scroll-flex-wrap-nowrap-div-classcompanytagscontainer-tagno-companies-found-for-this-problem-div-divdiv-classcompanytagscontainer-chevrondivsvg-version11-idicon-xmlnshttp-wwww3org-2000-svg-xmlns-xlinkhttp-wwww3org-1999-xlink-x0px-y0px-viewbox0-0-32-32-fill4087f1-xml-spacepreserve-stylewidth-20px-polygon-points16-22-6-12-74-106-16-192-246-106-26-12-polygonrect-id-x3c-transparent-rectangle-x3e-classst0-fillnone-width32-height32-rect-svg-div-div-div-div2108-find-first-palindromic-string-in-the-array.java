class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            int left=0;
            int right=word.length()-1;
            boolean flag=true;
            while(left<right){
                if(word.charAt(left)!=word.charAt(right)){
                    flag=false;
                    // break;
                }
                left++;
                right--;
            }
            if(flag){
                return word;
            }
        }
        
        return "";
    }
}




