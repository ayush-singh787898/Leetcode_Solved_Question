
class Pair{
	int el;
	int min;
	Pair(int el,int min){
		this.el = el;
		this.min = min;
	}
}
class MinStack {

    Stack<Pair> st;
    
	MinStack()
	{
		st = new Stack<Pair>();
	}

	void push(int x){
        if(!st.isEmpty()){
			Pair n = new Pair(x,Math.min(x,st.peek().min));
			st.push(n);
		}else st.push(new Pair(x,x));
    }
	
	void pop(){
		st.pop();
	}
    int top(){
        return st.peek().el;
    }
    int getMin(){
        return st.peek().min;
	}
}




















/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */