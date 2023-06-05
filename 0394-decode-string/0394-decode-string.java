class Solution {
    public String decodeString(String s) {
        Stack<Integer>si=new Stack<>();
        Stack<String>str=new Stack<>();
        int pointer=0;
        String ans="";
        while(pointer<s.length()){
            char ch=s.charAt(pointer);
            if(Character.isDigit(ch)){
            int n=0;
                while(Character.isDigit(s.charAt(pointer))){
                    n=n*10+s.charAt(pointer)-'0';
                    pointer++;
                }
            si.push(n);

            }
            else if(ch=='['){
                str.push(ans);
                ans="";
                pointer++;
            }
            else if(ch==']'){
                StringBuilder sb=new StringBuilder(str.pop());
                int count=si.pop();
                for(int i=1;i<=count;i++)
                    sb.append(ans);
                    ans=sb.toString();
                    pointer++;
                
            }
            else{
                ans+=ch;
                pointer++;
            }
        }
        return ans;
    }
}