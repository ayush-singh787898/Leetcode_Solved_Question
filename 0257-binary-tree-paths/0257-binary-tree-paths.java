








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

import java.util.*;

class Solution {
    static List<String> lst = new ArrayList<>();

    public static void addElement(TreeNode node, String path) {
        if (node == null) {
            return;
        }
        // If it's a leaf node, add the path to the list
        if (node.left == null && node.right == null) {
            lst.add(path + node.val);
            return;
        }
        // If it's not a leaf node, append the current node's value to the path
        addElement(node.left, path + node.val + "->");
        addElement(node.right, path + node.val + "->");
    }

    public List<String> binaryTreePaths(TreeNode root) {
        lst.clear(); // Clear the list before processing the tree
        if (root == null) {
            return lst;
        }
        addElement(root, "");
        return lst;
    }
}









































































