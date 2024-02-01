class Solution {
	public static int[][] divideArray(int[] nums, int k) {
		int x = 0;
		Arrays.sort(nums);
		int row_length = nums.length / 3;
		int output[][] = new int[row_length][3];
		for (int i = 0; i < nums.length; i += 3) {
			if (i + 2 < nums.length) {
				if ((nums[i + 2] - nums[i]) <= k) {
					output[x][0] = nums[i];
					output[x][1] = nums[i + 1];
					output[x][2] = nums[i + 2];
					x++;
				} 
                else {
					return new int[][] {};
				}
			}
		}
		return output;
	}
}