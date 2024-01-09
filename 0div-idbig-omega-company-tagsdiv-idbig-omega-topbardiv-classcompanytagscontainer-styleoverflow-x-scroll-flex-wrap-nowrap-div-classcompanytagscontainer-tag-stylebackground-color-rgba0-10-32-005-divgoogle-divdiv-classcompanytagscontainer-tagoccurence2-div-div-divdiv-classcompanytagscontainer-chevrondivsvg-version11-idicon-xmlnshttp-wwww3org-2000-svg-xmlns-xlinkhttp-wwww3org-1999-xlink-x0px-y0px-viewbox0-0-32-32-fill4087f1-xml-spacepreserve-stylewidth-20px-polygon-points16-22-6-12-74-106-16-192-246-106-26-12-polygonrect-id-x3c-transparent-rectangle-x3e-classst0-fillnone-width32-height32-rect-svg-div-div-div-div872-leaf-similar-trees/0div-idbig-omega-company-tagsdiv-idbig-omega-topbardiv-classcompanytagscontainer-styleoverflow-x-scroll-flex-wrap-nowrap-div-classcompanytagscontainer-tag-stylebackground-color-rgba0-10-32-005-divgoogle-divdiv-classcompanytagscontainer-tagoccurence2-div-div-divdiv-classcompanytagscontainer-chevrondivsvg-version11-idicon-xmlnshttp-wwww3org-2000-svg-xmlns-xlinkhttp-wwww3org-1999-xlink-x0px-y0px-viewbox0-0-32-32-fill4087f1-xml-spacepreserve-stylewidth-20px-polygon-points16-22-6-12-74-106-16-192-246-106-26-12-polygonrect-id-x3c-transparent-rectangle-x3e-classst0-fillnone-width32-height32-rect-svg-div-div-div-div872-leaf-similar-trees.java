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
    public static boolean isSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        
        // Helper function to perform in-order traversal and collect leaf nodes
        // in the given list
        inorderTraversal(root1, lst1);
        inorderTraversal(root2, lst2);

        // Compare the lists
        return lst1.equals(lst2);
    }

    private static void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        inorderTraversal(node.left, list);
        inorderTraversal(node.right, list);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if ((root1 == null && root2 != null) || (root2 == null && root1 != null)) {
            return false;
        }

        if (root1 == null && root2 == null) {
            return true;
        }

        return isSimilar(root1, root2);
    }
}
