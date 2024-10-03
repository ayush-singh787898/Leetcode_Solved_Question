class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1=new char[26];
        char[] ch2=new char[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            ch1[s.charAt(i)-'a']++;
            ch2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}
