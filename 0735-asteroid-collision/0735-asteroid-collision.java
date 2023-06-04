class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stk=new Stack<>();
        for(int ast : asteroids){
            if(ast>0){
                stk.push(ast);
            }
            else{
                while(!stk.isEmpty() && stk.peek()>0 && stk.peek()<Math.abs(ast)){
                    stk.pop();
                }
                if(!stk.isEmpty() && stk.peek()==Math.abs(ast)){
                    stk.pop();
                }
                else if(stk.isEmpty() || stk.peek()<0){
                    stk.push(ast);
                }
            }
        }
        int arr[]=new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--){
            arr[i]=stk.pop();
        }
        return arr;
    }
}