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
    public static boolean pathSum(TreeNode root,int targetSum,int sum){
        if(root==null){
            return false;
        }
        sum+=root.val; 
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                return true;
            }
        }
        boolean left=pathSum(root.left,targetSum,sum);
        boolean right=pathSum(root.right,targetSum,sum);
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
       boolean isPathSum=pathSum(root,targetSum,0);
        return isPathSum;
    }
}