class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length;i++){
            StringBuilder temp=new StringBuilder();
            if(s.charAt(i)=='('){
                stk.push('(');
            }
            if(s.charAt(i)=='(' && stk.peek()=='('){
                while(s.charAt(i)=='('){
                    stk.push('(');
                    i++;
                }
                if(s.charAt(i)=='(' && stk.peek()=='('){
                    // if(stk.size()>2){
                        while(stk.size()!=1){
                            temp.append(stk.pop());
                        }
                        String reverse+=temp.toString().reverse();
                        ans+=reverse;

                        
                    // }

                }
            }
        }
        
    }
}