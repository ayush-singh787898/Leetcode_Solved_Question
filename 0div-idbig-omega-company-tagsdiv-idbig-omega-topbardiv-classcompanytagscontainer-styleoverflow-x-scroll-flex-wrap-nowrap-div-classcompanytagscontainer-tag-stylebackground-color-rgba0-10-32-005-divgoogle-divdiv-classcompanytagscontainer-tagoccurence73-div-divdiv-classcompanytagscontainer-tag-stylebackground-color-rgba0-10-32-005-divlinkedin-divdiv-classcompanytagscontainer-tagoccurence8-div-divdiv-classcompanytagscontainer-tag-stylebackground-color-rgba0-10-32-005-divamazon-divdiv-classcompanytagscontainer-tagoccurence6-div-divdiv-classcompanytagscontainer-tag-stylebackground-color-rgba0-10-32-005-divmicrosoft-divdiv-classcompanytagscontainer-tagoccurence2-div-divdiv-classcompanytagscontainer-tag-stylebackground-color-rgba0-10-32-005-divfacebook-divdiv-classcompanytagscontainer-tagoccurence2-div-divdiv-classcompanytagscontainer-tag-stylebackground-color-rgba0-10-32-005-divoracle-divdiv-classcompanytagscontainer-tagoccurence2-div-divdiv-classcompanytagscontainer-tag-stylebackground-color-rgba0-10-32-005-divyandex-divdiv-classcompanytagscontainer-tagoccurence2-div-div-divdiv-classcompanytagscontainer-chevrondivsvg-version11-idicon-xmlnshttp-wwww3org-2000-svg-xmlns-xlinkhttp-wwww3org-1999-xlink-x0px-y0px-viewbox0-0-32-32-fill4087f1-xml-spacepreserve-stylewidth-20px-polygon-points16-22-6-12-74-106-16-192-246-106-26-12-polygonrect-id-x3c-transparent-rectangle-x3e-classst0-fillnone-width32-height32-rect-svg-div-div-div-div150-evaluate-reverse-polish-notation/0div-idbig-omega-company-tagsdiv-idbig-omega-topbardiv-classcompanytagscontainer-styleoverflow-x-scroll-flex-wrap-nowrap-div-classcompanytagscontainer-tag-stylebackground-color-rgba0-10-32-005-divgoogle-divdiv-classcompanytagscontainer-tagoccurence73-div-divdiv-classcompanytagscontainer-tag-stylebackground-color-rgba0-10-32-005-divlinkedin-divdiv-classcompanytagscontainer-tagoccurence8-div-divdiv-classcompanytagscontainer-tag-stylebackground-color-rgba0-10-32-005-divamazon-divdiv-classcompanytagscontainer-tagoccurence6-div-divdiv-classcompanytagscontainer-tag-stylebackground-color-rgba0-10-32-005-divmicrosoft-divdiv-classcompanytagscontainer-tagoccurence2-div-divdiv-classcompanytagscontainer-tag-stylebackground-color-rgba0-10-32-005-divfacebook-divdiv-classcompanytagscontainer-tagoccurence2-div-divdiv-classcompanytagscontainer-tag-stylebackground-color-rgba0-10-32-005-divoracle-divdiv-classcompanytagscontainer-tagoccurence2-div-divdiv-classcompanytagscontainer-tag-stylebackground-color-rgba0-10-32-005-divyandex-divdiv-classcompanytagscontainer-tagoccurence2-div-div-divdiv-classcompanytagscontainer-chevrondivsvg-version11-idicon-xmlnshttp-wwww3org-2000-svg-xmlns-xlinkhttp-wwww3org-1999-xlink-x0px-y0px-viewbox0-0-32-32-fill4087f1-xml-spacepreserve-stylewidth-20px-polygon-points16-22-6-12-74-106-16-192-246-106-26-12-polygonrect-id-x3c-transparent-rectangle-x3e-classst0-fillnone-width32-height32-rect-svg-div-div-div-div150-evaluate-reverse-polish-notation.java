
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            stk.push(tokens[i]);
            if (tokens[i].equals("-") || tokens[i].equals("+") || tokens[i].equals("*") || tokens[i].equals("/")) {
                String symbl = stk.pop();
                int top = Integer.parseInt(stk.pop());
                int btm = Integer.parseInt(stk.pop());
                int val = 0;

                if (symbl.equals("-")) {
                    val = btm - top;
                }
                else if (symbl.equals("+")) {
                    val = btm + top;
                } 
                else if (symbl.equals("*")) {
                    val = btm * top;
                }
                else if (symbl.equals("/")) {
                    val = btm / top; 
                }

                String s = String.valueOf(val);
                stk.push(s);
            }
        }
        return Integer.parseInt(stk.pop());
    }
}

























