class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stk1=new Stack<>();
        Stack<Character>stk2=new Stack<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        if(s.length()==0 && t.length()==0){
            return true;
        }
    
        int i=0;
        int j=0;
        while(i<s.length()){
            if(s.charAt(i)=='#' && !stk1.isEmpty()){
                stk1.pop();
            }
            else if(s.charAt(i)!='#'){
                stk1.push(s.charAt(i));
                
            }
            i++;
        }
        while(j<t.length()){
            if(t.charAt(j)=='#' && !stk2.isEmpty()){
                stk2.pop();
            }
            else if(t.charAt(j)!='#'){
                stk2.push(t.charAt(j));
                
            }
            j++;
        }
        while(!stk1.isEmpty()){
            sb1.append(stk1.pop());
        }
        while(!stk2.isEmpty()){
            sb2.append(stk2.pop());
        }
    
        return sb1.toString().equals(sb2.toString());
    }
}