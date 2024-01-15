class Solution {
    List<Integer>lst=new ArrayList<>();
    public void Inorder(TreeNode root){
        
        if(root==null){
            return;
        }
        Inorder(root.left);
        lst.add(root.val);
        Inorder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        Inorder(root);
        return lst;    
    }
}