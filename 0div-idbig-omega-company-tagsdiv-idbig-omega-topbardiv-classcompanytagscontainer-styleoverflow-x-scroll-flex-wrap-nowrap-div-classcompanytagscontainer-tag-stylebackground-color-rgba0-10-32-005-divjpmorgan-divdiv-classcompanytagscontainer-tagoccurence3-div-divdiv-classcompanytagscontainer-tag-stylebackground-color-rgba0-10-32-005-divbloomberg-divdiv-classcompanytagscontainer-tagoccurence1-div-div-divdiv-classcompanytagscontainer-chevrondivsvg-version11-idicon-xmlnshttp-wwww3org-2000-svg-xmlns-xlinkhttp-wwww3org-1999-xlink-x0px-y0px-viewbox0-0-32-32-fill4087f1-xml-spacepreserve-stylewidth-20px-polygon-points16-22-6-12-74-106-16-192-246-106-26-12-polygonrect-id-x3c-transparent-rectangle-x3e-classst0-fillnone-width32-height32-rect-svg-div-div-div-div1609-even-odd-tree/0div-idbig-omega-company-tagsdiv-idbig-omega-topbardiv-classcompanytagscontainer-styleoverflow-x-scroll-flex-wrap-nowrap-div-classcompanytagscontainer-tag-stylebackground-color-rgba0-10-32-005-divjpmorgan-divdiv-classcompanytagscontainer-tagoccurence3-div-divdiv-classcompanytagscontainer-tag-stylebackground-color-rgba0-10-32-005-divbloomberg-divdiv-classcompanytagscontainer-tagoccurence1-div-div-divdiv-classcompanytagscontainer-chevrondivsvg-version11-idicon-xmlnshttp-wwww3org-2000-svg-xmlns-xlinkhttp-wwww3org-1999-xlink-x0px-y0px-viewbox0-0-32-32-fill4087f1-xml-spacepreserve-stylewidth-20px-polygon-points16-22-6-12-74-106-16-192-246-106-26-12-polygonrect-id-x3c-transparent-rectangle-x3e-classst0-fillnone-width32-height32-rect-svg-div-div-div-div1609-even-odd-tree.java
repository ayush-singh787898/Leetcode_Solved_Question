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
    public boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode prev = null;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                // even-level
                if (level % 2 == 0) {
                    // if even elements return false
                    if (curr.val % 2 == 0) {
                        return false;
                    }
                    if (prev != null && curr.val <= prev.val) {
                        return false;
                    }
                }
                // odd-level
                if (level % 2 == 1) {
                    if (curr.val % 2 == 1) {
                        return false;
                    }
                    if (prev != null && curr.val >= prev.val) {
                        return false;
                    }
                }
                prev = curr;
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            level++;
        }
        return true;
    }
}
