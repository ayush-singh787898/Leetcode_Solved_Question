class Solution {
    public String largestOddNumber(String num) {
        StringBuilder res=new StringBuilder();
        for(int i=num.length()-1;i>=0;i--){
            int ch=num.charAt(i)-'0';
            if(ch%2!=0){
                while(i>=0){
                    ch=num.charAt(i)-'0';
                    res.append(ch);
                    i--;
                }
            }
        }
        return res.reverse().toString();
    }
}