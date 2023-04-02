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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ls=new ArrayList<>();
        Stack<TreeNode>stk=new Stack<>();
        stk.push(root);
        if(root==null){
            return ls;
        }
        while(!stk.isEmpty()){
            TreeNode temp=stk.pop();
            ls.add(0,temp.val);
            if(temp.left!=null){
                stk.push(temp.left);
            }
            if(temp.right!=null){
                stk.push(temp.right);
            }
            
        }
                    return ls;

        
    }
}