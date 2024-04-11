
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        if (num.charAt(0) != '0') {
            stk.push(num.charAt(0));
        }
        for (int i = 1; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (!stk.isEmpty() && k > 0 && ch < stk.peek()) {
                stk.pop();
                k--;
            }
            if (ch != '0' || !stk.isEmpty()) {
                stk.push(ch);
            }
        }
        while (!stk.isEmpty() && k > 0) {
            stk.pop();
            k--;
        }
        if (stk.isEmpty()) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        while (!stk.isEmpty()) {
            res.append(stk.pop());
        }
        return res.reverse().toString();
    }
}
