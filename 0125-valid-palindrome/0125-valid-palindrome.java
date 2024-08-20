class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && s.charAt(i)!=',' && s.charAt(i)!=':' && Character.isLetterOrDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        str=str.toLowerCase();
        int i=0;
        int j=str.length()-1;
        System.out.print(str);
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}