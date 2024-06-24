
class Solution {
    public void swap(int[] nums, int z, int i){
        int temp = nums[i];
        nums[i] = nums[z];
        nums[z] = temp;
    }

    public void sortColors(int[] nums) {
        int z = 0;
        int scnd = nums.length - 1;
        int i = 0;
        
        while (i <= scnd) {
            if (nums[i] == 0) {
                swap(nums, z, i);
                z++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, scnd, i);
                scnd--;
            } else {
                i++;
            }
        }
    }
}
