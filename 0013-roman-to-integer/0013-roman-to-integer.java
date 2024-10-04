class Solution {
    public static int getValue(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int n=s.length();
        int res=0;
        for(int i=1;i<n;i++){
            char ch1=s.charAt(i-1);
            char ch2=s.charAt(i);
            if(getValue(ch1)<getValue(ch2)){
                res-=getValue(ch1);
            }
            else{
                res+=getValue(ch1);
            }
        }
        res+=getValue(s.charAt(n-1));
        return res;
    }
}