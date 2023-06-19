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
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer>ls=new ArrayList<>();
//         if(root==null){
//             return null;
//         }
//         Queue<TreeNode>q=new LinkedList<>();
//         q.offer(root);
//         while(!q.isEmpty()){
//             int n=q.size();
//             for(int i=0;i<n;i++){
//                 TreeNode curr=q.element();
//                 q.poll();
//                 if(i==n-1){
//                     ls.add(curr.val);
//                 }
//                 if(curr.left!=null){
//                     q.offer(curr.left);
//                 }

//                 if(curr.right!=null){
//                     q.offer(curr.right);
//                 }
//             }
//         }
//      return ls;   
//     }
// }

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.val);
        }
        
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
        
    }
}
