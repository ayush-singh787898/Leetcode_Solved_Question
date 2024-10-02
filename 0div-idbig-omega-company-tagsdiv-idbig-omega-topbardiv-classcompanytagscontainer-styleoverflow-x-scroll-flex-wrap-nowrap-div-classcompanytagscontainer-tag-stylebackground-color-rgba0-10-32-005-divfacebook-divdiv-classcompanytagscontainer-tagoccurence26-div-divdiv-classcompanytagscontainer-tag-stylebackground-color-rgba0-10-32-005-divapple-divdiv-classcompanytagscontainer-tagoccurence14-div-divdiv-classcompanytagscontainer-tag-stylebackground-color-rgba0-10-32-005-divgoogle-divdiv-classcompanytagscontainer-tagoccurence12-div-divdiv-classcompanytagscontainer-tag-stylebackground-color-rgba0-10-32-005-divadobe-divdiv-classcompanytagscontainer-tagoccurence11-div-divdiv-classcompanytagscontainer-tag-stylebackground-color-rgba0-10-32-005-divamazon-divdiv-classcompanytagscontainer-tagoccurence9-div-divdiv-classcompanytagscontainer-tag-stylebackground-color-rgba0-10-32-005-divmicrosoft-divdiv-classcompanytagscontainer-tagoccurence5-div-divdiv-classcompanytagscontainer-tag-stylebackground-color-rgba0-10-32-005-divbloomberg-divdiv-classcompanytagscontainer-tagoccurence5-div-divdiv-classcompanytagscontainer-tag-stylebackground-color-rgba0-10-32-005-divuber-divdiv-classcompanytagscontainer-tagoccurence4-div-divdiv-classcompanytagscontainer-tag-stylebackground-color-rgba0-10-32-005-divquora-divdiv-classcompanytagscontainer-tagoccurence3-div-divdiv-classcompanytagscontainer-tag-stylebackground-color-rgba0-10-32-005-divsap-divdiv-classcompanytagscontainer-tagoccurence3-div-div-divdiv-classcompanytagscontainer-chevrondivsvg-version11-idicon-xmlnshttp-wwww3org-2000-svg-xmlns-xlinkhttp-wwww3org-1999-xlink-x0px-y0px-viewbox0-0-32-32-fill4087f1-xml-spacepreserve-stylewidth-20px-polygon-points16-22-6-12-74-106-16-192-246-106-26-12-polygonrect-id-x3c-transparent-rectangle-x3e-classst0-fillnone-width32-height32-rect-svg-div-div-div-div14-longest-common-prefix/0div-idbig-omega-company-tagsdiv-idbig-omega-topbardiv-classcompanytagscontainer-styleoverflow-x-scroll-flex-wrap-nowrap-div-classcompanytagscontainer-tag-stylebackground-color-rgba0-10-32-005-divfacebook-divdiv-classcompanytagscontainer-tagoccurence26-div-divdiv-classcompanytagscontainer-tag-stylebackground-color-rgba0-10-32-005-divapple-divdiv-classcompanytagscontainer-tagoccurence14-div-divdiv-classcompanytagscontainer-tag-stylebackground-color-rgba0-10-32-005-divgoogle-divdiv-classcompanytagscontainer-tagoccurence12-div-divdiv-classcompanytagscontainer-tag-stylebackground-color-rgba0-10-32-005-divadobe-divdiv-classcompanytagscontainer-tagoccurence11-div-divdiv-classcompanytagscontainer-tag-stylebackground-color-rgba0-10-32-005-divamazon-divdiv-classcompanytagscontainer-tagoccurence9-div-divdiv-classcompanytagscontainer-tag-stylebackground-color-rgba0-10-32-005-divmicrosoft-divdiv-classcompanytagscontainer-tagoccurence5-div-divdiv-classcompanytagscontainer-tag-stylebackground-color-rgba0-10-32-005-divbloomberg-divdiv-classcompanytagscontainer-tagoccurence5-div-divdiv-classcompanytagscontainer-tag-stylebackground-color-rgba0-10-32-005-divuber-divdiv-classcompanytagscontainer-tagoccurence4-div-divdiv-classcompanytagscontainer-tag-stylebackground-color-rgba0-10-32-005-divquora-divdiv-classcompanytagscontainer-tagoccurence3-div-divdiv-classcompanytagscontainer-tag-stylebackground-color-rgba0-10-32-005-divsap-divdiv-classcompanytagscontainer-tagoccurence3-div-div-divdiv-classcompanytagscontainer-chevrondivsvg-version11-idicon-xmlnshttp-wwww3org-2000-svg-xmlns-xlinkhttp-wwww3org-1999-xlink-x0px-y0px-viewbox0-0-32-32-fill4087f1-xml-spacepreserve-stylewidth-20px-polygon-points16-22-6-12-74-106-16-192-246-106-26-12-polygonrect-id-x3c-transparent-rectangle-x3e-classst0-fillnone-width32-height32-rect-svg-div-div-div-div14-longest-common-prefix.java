class Solution {
    public String longestCommonPrefix(String[] strs) {
        int inx=0;
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        
        while(inx<s1.length() && inx<s2.length()){
            if(s1.charAt(inx)==s2.charAt(inx)){
                inx++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,inx);
    }
}