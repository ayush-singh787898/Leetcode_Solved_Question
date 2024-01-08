import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void count(TreeNode root, int low, int high, List<Integer> arrLst) {
        if (root != null) {
            count(root.left, low, high, arrLst);
            if (root.val >= low && root.val <= high) {
                arrLst.add(root.val);
            }
            count(root.right, low, high, arrLst);
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        List<Integer> arrLst = new ArrayList<>();
        count(root, low, high, arrLst);

        int sum = 0;
        for (int val : arrLst) {
            sum += val;
        }

        return sum;
    }
}
