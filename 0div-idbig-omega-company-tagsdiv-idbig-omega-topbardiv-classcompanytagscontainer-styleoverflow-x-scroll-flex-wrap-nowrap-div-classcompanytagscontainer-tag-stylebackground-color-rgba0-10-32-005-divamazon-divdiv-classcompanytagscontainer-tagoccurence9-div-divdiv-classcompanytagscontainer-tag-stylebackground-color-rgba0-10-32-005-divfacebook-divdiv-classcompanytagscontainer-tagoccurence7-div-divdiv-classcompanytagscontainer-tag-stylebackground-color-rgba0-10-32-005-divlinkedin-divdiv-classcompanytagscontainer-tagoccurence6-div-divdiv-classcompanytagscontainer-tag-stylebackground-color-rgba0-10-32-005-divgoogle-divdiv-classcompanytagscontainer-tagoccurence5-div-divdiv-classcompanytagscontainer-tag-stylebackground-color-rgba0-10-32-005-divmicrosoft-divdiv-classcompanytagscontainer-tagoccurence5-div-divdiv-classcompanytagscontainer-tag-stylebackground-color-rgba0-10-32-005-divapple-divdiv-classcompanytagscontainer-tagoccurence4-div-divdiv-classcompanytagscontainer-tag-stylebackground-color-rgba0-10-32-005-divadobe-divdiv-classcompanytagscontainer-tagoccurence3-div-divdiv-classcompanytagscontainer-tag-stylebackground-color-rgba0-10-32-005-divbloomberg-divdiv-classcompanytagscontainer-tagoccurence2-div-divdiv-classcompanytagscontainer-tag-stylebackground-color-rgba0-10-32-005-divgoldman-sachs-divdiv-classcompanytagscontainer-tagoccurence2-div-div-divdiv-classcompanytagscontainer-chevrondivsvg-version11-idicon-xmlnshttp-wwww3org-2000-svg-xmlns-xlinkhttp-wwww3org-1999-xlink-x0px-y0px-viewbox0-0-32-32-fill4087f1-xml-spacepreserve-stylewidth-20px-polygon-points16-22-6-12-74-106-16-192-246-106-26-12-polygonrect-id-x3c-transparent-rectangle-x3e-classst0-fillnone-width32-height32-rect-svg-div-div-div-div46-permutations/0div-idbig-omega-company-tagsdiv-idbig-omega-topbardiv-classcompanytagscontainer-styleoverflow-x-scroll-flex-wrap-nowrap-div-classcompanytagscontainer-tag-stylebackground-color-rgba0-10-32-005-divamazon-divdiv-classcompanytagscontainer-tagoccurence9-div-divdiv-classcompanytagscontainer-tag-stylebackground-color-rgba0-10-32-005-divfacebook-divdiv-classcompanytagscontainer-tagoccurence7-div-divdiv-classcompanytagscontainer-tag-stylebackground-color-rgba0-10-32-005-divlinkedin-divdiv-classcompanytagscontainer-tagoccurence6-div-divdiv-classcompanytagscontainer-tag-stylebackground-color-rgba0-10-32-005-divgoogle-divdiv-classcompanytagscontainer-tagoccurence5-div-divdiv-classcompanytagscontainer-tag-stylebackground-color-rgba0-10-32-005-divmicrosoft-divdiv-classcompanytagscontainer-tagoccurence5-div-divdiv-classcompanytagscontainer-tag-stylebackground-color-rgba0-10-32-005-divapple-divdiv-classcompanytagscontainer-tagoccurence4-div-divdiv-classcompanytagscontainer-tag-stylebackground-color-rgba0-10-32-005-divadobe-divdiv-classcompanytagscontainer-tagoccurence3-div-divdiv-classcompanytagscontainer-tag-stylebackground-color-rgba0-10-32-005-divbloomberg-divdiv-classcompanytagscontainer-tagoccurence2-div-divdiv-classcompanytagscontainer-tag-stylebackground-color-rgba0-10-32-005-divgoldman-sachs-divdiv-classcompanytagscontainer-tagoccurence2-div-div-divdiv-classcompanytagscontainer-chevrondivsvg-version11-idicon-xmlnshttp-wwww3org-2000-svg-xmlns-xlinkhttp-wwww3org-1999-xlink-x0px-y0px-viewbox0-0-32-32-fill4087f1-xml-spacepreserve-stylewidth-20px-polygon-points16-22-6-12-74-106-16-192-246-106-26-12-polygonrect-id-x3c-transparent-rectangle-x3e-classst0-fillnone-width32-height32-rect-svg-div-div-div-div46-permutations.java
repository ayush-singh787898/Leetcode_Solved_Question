

class Solution {
    public void permut(int indx, int[] nums, List<List<Integer>> ans) {
        if (indx == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int num : nums) {
                ds.add(num);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = indx; i < nums.length; i++) {
            swap(i, indx, nums);
            permut(indx + 1, nums, ans);
            swap(i, indx, nums);
        }
    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permut(0, nums, ans);
        return ans;
    }
}
