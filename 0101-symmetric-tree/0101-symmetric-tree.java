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
    public static boolean isMirror(TreeNode leftRoot,TreeNode rightRoot){  
        if(leftRoot==null && rightRoot==null){
            return true;
        }
        if(leftRoot==null || rightRoot==null){
            return false;
        }
        if(leftRoot.val!=rightRoot.val){
            return false;
        }
    return isMirror(leftRoot.left,rightRoot.right) && isMirror(leftRoot.right ,rightRoot.left); 
    }      
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);

    }
}