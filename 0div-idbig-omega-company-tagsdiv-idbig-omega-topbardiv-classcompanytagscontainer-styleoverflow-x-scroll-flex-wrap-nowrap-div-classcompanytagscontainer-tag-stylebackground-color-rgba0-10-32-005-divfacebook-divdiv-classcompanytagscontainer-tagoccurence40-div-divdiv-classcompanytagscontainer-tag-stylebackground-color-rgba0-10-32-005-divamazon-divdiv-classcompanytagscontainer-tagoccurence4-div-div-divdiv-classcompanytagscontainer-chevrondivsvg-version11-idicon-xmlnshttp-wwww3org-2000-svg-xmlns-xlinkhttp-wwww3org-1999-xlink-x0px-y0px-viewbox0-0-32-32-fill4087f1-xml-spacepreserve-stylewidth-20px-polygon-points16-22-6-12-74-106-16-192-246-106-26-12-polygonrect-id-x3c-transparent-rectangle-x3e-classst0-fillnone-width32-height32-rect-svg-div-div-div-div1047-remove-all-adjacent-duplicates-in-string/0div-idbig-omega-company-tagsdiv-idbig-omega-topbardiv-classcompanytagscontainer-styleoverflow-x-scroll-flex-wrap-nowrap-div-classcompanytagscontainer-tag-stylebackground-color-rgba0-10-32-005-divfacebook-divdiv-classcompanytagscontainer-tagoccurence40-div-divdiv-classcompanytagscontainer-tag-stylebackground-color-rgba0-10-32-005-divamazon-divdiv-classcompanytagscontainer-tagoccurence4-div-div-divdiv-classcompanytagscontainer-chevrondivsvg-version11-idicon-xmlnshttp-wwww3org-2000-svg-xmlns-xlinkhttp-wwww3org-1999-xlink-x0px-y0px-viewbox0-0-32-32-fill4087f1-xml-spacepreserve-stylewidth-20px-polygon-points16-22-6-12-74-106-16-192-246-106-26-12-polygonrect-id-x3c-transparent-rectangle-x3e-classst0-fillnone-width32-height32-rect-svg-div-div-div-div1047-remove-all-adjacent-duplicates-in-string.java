class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if( stk.size()>0 && stk.peek()==s.charAt(i)){

                stk.pop();
            }
            else{
                stk.push(s.charAt(i));

            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();

    }
}
