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


// Recursion

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        inorder(p,ls1);
        inorder(q,ls2);
        return ls1.equals(ls2);
    }


  public void inorder(TreeNode root,List<Integer> ls){
      if(root==null){
        return;
      }
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
      if(root.left==null){
      ls.add(null);  
      }
      if(root.right==null){
          ls.add(null);
      }
        
    }
}
