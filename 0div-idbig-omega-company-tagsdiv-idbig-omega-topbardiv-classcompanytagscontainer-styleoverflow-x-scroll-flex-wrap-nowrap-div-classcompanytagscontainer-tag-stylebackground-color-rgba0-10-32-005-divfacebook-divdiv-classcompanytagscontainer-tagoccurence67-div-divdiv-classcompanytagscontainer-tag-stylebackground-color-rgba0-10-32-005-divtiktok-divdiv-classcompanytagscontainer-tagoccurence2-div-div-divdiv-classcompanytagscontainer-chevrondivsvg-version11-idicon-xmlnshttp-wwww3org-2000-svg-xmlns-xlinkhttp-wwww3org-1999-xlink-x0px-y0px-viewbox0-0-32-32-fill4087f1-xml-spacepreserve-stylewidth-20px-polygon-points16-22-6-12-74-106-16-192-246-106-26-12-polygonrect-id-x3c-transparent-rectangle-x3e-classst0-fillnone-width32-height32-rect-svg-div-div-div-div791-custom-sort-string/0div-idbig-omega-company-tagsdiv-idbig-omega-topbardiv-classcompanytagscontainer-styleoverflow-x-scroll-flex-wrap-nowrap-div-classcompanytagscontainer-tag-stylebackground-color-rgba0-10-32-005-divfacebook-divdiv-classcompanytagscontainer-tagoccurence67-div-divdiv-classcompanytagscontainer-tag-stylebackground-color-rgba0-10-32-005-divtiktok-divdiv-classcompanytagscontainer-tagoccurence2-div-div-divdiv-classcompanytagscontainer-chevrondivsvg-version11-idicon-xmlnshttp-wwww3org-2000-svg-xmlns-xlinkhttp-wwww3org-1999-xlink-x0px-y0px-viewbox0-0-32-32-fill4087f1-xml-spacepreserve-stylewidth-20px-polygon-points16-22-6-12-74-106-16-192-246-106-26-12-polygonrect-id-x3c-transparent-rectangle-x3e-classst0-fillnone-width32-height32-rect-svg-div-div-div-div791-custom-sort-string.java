class Solution {
    public String customSortString(String order, String s) {
        
// create frequency array and store frequency of each character of String s.
        int []fr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fr[ch-'a']++;
        }
        
// Check if character of order string is present in fr array or not.
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<order.length();i++){
            char cho=order.charAt(i);
            while(fr[cho-'a']>0){
                sb.append(cho);
                fr[cho-'a']--;
            }
            
        }
        
// Add remaining character of string s to stringBuilder sb;
        for(int i=0;i<26;i++){
            while(fr[i]>0){
                sb.append((char)('a'+i));
                fr[i]--;
            }
        }
        return sb.toString();
    }
}

