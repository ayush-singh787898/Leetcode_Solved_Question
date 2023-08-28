class MyStack {
    Deque<Integer>q1=new LinkedList<>();
        
    
    public void push(int x) {
       q1.addLast(x);
    }
    
    public int pop() {
        
        return q1.removeLast();
    }
    
    public int top() {
       return q1.peekLast();
            }
            
    public boolean empty() {
   return q1.size()==0;

    }
}