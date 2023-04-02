class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int i=0;
        int result=0;
        while(i<s.length()){
            int zero_Count=0;
            int one_Count=0;
            while(i<s.length() && s.charAt(i)=='0'){
                i++;
                zero_Count++;
            }
            if(i<s.length() && s.charAt(i)=='1'){
                 while(i<s.length() && s.charAt(i)=='1'){
                i++;
                one_Count++;
            }
            }
            result=Math.max(result,Math.min(one_Count,zero_Count));
        }
        return 2*result;
    }
}