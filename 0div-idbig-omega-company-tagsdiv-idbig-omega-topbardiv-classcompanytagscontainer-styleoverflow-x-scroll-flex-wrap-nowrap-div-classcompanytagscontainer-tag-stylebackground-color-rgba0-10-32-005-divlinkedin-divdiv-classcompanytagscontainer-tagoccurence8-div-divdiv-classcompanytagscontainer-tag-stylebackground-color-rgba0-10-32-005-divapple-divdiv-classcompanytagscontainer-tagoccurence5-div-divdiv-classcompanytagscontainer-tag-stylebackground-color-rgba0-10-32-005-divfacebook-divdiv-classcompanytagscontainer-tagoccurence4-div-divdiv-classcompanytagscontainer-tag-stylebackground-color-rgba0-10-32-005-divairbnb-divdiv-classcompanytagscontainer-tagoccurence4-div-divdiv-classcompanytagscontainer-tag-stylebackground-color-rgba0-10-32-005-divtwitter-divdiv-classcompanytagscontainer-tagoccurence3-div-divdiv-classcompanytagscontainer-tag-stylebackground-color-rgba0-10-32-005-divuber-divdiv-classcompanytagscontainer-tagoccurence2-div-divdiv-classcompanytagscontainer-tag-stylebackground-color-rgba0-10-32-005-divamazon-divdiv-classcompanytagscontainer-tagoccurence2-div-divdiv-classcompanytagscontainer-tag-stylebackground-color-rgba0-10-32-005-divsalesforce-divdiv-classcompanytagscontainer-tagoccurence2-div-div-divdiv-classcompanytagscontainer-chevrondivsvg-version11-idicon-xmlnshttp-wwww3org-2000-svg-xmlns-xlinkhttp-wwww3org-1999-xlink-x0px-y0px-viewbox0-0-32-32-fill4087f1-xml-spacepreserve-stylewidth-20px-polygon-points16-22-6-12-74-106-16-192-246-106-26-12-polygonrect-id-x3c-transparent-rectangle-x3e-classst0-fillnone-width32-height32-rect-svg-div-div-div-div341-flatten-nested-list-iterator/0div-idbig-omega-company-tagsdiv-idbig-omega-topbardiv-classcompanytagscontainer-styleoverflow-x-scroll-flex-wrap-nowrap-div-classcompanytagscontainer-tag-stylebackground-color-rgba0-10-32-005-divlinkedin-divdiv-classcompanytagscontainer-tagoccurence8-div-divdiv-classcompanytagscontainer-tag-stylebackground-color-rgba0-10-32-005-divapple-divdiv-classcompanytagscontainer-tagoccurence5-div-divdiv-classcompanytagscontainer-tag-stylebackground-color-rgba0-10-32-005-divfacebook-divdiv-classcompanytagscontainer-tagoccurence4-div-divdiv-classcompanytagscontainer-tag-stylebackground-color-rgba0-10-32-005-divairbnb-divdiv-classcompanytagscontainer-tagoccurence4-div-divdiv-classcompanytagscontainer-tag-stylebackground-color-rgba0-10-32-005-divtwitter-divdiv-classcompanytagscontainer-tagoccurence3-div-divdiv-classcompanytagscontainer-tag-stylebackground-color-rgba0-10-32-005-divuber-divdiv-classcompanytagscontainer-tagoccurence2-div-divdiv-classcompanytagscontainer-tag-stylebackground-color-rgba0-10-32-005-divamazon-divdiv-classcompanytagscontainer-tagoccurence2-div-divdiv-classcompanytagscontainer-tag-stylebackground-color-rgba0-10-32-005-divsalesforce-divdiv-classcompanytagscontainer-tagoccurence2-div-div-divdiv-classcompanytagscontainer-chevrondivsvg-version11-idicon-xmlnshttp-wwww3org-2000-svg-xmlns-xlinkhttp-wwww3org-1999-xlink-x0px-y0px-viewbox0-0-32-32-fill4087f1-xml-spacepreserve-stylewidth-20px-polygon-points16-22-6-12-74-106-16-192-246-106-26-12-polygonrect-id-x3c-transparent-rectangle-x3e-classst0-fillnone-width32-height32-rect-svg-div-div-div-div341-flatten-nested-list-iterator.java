/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger>stk=new Stack<>();
    public NestedIterator(List<NestedInteger> nestedList) {
        if(nestedList==null){
            return;
        }
        for(int i=nestedList.size()-1;i>=0;i--){
            stk.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stk.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!stk.isEmpty()){
            NestedInteger top=stk.peek();
            
//             If stack having only Integer Value
            if(top.isInteger()){
                return true;
            }
            
//             If stack having List then pop the list from stack and insert the value of list from last position to first position in stack again 

            else{
                stk.pop();
                for(int i=top.getList().size()-1;i>=0;i--){
                    stk.push(top.getList().get(i));
                }
            }
        }
        
//         If stack is empty return false;
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */