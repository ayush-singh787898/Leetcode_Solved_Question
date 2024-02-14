
class Solution {
    public int myAtoi(String s) {
       String str=s.trim();
        if(str.length()==0){
            return 0;
        }
        int res=0; 
        boolean neg=false;
        int i=0;
        if(str.charAt(0)=='-'){
            neg=true;
            i++;
            
        }  
        else if(str.charAt(0)=='+'){
            i++;
        }
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            System.out.println(digit);
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return (neg ==false ) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digit;
            i++;
        }
        if(neg){
            res=res*-1;
        }
        return res;
    }
}


































