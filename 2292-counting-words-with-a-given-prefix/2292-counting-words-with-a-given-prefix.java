class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()<pref.length()){
                continue;
            }
            int j=0;
            while(j<pref.length()){
                if(pref.charAt(j)==words[i].charAt(j)){
                    j++;
                }
                else{
                    break;
                }    
            }
            if(j==pref.length()){
                count++;
            }
        }
        return count;
    }
}