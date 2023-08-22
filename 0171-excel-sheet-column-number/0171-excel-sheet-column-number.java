class Solution {
    public int titleToNumber(String columnTitle) {
        int pwr=0;
        int i=columnTitle.length()-1;
        int res=0;
        while(i>=0){
            char ch=columnTitle.charAt(i);
            int val=ch-65+1;
            res+=val*Math.pow(26,pwr);
            i--;
            pwr++;
        }
        return res;
    }
}