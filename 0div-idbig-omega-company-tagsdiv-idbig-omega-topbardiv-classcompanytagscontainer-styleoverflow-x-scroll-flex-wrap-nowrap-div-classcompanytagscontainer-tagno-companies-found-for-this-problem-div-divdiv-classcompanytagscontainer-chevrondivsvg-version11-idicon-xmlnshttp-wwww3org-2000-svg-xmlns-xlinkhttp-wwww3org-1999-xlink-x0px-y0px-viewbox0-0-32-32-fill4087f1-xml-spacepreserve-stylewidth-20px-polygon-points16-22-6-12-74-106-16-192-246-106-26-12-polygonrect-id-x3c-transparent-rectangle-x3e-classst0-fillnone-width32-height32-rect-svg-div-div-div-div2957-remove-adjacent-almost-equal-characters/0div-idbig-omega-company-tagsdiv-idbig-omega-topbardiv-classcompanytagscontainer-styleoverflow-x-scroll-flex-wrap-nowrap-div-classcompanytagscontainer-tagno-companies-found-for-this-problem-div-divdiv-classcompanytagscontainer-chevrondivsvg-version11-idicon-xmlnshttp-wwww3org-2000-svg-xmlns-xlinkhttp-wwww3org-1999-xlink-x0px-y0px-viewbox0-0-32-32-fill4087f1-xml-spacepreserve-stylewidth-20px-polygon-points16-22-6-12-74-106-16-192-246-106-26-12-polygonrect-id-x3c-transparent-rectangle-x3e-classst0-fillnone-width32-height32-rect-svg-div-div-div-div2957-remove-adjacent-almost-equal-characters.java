class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int len=word.length();
        if(len<2){
            return 0;
        }    
        int cnt=0;
        for(int i=1;i<len;i++){
            if(word.charAt(i-1)==word.charAt(i) || Math.abs(word.charAt(i-1)-word.charAt(i))==1){
                cnt++;
                i++;
            }
            
        }
    return cnt;
    }
}