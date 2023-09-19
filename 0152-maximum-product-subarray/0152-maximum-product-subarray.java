class Solution {
    public int maxProduct(int[] nums) {
        long max = Integer.MIN_VALUE, product = 1;
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            product *= nums[i];
            if(product < Integer.MAX_VALUE){
                max = Math.max(product, max);
            }
            if (nums[i] == 0) product = 1;
        }
        product = 1;
        for(int i = len - 1; i >= 0; i--) {
            product *= nums[i];
            if(product < Integer.MAX_VALUE){
                max = Math.max(product, max);
            }   
            if (nums[i] == 0){
                product = 1;
            }
        }
        return (int)max;
    }
}