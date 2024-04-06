class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character>stk=new Stack<>();
        int leftPar=0;
        int rightPar=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                leftPar++;
            }
            if(ch==')'){
                rightPar++;
            }
            if(rightPar>leftPar){
                rightPar--;
                continue;
            }
            else{
                stk.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()){
            char ch=stk.pop();
            if(leftPar>rightPar && ch=='('){
                leftPar--;
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
}