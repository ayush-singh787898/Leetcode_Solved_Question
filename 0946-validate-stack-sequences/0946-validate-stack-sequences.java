class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length){
            return false;
        }
        Stack<Integer>stk=new Stack<>();
        int arr[]=new int[pushed.length];
        int j=0;
        for(int i=0;i<pushed.length;i++){
            stk.push(pushed[i]);
            while(!stk.isEmpty() && j<popped.length && stk.peek()==popped[j]){
                    stk.pop();
                    j++;
            }
        }
        if(j==popped.length){
            return true;
        }
        else{
            return false;
        }
    }
}