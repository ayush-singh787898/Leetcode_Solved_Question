
class Solution {
    public void swap1(int[] nums, int z, int i){
        int temp = nums[i];
        nums[i] = nums[z];
        nums[z] = temp;
    }

    public void swap2(int[] nums, int scnd, int i){
        int temp = nums[i];
        nums[i] = nums[scnd];
        nums[scnd] = temp;
    }

    public void sortColors(int[] nums) {
        int z = 0;
        int scnd = nums.length - 1;
        int i = 0;
        
        while (i <= scnd) {
            if (nums[i] == 0) {
                swap1(nums, z, i);
                z++;
                i++;
            } else if (nums[i] == 2) {
                swap2(nums, scnd, i);
                scnd--;
            } else {
                i++;
            }
        }
    }
}
