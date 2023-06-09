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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>al=new ArrayList<>();
        Stack<TreeNode>stk=new Stack<>();
        if(root==null){
            return al;
        }
        while(!stk.isEmpty() || root!=null){
            if(root!=null){
                stk.push(root);
                root=root.left;
            }
            else{
                TreeNode n= stk.pop();
                al.add(n.val);
                root=n.right;
            }
            
        }
        return al;

        
        
    }
}