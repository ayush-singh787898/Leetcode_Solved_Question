class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder(s);      // String s is converted to StringBuilder
            int i=0;
            while(i<sb.length()){
                if(sb.charAt(i)=='*'){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i-1);
                    i=i-2;
                }
            i++;
            }
        String str=sb.toString();       // StringBuilder is converted to string
        return str;
            
    }
}