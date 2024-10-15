class Solution {
    public long minimumSteps(String s) {
        long count=0;
        long black=0;       // 1 shows black
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count+=(long)black;
            }
            else{
                black++;
            }
        }
        return count;
    }
}