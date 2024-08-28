class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s = s.replaceAll("\\s+", " ");
        String str="";
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)==' '){
                sb.reverse();
                sb.append(' ');
                str+=sb.toString();
                sb.setLength(0);
            }
        }
        sb.reverse();
        str+=sb.toString();
        return str;
    }
}