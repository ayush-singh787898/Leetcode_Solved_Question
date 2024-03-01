class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOne=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                countOne++;
            }
        }   
        String str="";
        for(int i=0;i<s.length()-1;i++){
            if(countOne>1){
                str+="1";
                countOne--;
            }
            else{
                str+="0";
            }
        }
        if(countOne==1){
            str+="1";
        }
        return str;
    }
}