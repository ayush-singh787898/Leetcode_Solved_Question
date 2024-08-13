class Solution {
    public int removeElement(int[] nums, int val) {
        Stack<Integer>stk=new Stack<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                stk.push(nums[i]);
                nums[k++]=nums[i];
            }
        }
        return stk.size();
    }
}