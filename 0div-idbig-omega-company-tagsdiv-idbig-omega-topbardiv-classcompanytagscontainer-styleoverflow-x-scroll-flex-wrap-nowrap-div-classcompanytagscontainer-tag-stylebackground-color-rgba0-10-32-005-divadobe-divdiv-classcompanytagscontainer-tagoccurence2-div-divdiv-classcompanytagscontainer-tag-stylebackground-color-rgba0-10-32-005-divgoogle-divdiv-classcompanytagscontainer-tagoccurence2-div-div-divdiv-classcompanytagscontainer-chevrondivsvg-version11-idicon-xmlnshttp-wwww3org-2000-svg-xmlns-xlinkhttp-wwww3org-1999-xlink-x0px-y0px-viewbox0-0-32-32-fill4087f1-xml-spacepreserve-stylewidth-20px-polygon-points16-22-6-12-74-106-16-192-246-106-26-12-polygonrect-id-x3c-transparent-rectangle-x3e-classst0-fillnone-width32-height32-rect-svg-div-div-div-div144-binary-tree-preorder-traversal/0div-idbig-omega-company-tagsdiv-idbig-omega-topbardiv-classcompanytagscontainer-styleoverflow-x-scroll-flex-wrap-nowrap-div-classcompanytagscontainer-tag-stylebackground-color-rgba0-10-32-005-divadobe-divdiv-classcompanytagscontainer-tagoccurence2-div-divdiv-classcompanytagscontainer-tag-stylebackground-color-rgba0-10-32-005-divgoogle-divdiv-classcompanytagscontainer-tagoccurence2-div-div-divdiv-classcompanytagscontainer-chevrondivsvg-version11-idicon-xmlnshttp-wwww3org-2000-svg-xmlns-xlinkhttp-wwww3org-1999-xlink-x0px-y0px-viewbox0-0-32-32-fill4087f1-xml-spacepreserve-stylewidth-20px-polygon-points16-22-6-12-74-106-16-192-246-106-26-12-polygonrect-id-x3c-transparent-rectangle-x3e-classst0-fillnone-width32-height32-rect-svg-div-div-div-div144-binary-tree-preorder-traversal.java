/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode>stk=new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        stk.add(root);
        if(root == null) {
            return al;
        }

        while(!stk.isEmpty()){
            TreeNode temp=stk.pop();
            al.add(temp.val);
            if(temp.right!=null){
                stk.push(temp.right);
            }
            if(temp.left!=null){
                
                stk.push(temp.left);
            }
        }
        return al;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}