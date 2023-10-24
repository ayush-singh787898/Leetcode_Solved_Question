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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        Queue<TreeNode>que=new LinkedList<>();
        if(root==null){
            return list;
            
        }
        que.add(root);
        while(!que.isEmpty()){
             TreeNode temp=root;
            int sz=que.size();
                int max=Integer.MIN_VALUE;

            while(sz>0){
                temp=que.poll();
                max=Math.max(max,temp.val);
                if(temp.left!=null){
                    que.add(temp.left);
                }
                if(temp.right!=null){
                    que.add(temp.right);
                }
                sz--;
            }
            list.add(max);
            
        }
        return list;
    }
}