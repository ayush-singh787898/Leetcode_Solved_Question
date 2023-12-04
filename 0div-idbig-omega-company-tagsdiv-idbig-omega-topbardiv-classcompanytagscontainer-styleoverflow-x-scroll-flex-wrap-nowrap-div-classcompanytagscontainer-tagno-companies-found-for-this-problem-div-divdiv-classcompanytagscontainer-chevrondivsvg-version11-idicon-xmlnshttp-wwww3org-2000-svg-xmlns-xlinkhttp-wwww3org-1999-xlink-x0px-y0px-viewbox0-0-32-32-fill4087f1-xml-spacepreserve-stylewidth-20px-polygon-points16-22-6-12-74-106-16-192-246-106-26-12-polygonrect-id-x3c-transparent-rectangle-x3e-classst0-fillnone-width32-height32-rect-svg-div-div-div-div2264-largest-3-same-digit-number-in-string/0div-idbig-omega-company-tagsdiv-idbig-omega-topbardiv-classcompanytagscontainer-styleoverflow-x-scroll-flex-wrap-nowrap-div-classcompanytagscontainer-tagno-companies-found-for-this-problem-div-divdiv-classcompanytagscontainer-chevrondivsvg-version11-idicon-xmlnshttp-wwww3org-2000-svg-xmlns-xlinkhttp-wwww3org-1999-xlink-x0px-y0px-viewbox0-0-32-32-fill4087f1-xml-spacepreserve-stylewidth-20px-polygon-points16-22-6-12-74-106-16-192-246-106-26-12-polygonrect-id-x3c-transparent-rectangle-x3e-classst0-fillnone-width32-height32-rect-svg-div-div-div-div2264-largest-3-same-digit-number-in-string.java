class Solution {
    public String largestGoodInteger(String num) {
        String str="";
        
        for(int i=0;i<num.length()-2;i++){
            char ch1=num.charAt(i);
            char ch2=num.charAt(i+1);
            char ch3=num.charAt(i+2);
                if(ch1==ch2 && ch2==ch3){
                    if(str.length()>0 && ch1>str.charAt(str.length()-1)){
                        str="";
                        str+=ch1;
                        str+=ch2;
                        str+=ch3;
                    }
                    if(str.length()==0){
                        str+=ch1;
                        str+=ch2;
                        str+=ch3;
                    }
               
                }
        }
        return str;
    }
}