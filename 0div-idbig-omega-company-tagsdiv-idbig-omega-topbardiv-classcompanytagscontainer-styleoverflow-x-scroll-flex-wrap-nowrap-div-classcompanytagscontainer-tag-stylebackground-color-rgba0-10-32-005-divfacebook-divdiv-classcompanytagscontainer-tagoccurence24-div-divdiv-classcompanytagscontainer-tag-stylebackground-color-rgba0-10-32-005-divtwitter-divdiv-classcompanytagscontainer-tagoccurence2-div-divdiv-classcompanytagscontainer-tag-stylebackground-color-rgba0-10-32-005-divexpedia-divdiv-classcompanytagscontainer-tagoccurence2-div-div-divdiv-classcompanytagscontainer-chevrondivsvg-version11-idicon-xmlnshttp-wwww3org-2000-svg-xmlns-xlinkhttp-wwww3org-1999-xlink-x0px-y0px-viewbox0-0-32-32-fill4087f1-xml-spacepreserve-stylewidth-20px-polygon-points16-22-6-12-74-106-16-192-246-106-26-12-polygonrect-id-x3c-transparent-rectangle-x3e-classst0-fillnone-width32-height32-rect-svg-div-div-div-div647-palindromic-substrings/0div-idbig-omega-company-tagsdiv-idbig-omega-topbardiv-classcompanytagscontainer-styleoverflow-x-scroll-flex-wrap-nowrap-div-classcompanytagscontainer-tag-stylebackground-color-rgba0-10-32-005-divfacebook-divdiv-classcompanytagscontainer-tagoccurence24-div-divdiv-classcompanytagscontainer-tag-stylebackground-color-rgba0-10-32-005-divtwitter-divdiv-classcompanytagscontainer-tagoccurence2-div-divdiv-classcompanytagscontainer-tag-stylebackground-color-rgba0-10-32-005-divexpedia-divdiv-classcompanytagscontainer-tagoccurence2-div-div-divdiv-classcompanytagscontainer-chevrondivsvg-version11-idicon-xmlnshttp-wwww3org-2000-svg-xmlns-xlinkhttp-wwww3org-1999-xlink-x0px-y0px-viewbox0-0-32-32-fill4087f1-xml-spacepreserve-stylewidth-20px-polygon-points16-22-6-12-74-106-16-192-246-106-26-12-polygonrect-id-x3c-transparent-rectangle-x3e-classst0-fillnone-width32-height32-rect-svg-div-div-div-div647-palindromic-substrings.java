class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int end=str.length()-1;
        while(left<=end){
            if(str.charAt(left)!=str.charAt(end)){
                return false;
            }
            left++;
            end--;
        }
        return true;
    }

    
}