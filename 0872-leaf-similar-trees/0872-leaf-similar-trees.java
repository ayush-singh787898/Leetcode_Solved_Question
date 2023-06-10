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
    private void dfs(TreeNode root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ans.add(root.val);
            return;
        }
        dfs(root.left, ans);
        dfs(root.right, ans);

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        dfs(root1, r1);
        dfs(root2, r2);
        if(r1.size() != r2.size()){
            return false;
        }
        for(int i = 0; i < r1.size(); i++){
           if(r1.get(i) != r2.get(i)){
                return false;
            }
        }
        return true;
        
    }
}
