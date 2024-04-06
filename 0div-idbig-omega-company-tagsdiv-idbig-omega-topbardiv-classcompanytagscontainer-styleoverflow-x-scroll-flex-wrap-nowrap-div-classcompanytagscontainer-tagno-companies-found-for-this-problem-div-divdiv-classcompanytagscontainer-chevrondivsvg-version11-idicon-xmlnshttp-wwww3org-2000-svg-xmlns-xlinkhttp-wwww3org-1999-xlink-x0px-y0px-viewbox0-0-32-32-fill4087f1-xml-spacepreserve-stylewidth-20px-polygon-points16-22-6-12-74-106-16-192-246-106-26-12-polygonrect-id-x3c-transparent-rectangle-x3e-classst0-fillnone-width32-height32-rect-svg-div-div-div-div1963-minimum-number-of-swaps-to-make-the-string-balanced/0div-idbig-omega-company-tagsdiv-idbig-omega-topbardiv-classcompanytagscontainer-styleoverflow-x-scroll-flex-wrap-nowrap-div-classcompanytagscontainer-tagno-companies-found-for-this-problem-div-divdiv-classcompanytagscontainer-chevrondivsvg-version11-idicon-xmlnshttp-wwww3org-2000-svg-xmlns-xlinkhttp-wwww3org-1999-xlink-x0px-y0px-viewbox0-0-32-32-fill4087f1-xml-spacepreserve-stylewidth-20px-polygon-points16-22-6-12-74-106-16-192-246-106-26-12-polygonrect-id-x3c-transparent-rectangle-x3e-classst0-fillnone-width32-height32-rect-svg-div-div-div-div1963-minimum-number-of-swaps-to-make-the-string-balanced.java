class Solution {
    public int minSwaps(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty() || stk.peek()==']'){
                    stk.push(ch);
                }
                else{
                    stk.pop();
                }
            }
        }
        int totalBracket=stk.size();
        int closedBracket=totalBracket/2;
        return (closedBracket+1)/2;     // +1 is used to handle odd no. of closed bracket.
    }
}