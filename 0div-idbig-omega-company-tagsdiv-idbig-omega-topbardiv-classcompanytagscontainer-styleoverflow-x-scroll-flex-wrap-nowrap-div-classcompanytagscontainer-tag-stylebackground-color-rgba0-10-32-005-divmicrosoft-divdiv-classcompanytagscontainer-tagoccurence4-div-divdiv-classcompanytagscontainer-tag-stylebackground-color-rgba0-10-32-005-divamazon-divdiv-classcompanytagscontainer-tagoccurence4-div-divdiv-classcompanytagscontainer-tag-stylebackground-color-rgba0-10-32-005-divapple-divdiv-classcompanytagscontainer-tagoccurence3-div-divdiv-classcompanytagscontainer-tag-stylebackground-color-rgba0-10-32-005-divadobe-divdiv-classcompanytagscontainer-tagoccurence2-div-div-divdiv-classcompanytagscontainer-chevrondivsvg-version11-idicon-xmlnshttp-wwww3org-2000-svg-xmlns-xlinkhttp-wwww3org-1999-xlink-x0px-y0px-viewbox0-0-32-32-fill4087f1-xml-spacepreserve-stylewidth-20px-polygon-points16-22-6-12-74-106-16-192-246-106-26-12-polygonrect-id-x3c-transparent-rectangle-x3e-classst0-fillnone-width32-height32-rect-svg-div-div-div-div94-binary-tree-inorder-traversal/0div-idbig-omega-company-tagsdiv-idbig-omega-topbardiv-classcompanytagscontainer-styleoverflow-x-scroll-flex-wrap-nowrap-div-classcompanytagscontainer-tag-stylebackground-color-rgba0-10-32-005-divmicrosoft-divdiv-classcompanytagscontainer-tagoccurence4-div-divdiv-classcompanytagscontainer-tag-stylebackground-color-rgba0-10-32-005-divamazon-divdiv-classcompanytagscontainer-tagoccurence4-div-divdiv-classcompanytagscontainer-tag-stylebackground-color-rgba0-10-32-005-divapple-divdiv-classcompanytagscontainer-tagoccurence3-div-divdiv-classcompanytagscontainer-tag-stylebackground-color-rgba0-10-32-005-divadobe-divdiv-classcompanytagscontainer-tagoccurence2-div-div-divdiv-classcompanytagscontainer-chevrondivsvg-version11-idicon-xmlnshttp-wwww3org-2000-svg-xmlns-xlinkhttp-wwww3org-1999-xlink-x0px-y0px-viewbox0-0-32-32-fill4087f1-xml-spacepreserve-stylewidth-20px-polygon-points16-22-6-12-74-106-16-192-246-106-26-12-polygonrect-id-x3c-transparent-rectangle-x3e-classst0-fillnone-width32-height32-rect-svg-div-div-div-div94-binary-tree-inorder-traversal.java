class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>lst=new ArrayList<>();
        if(root==null){
            return lst;
        }      
        Stack<TreeNode>stk=new Stack<>();
        stk.push(root);
        TreeNode temp=stk.pop();
        while(!stk.isEmpty() || temp!=null){
            if(temp!=null){
                stk.push(temp);
                temp=temp.left;
            }
            else{
                temp=stk.pop();
                lst.add(temp.val);
                temp=temp.right;
            }
        }
        return lst;
    }
}