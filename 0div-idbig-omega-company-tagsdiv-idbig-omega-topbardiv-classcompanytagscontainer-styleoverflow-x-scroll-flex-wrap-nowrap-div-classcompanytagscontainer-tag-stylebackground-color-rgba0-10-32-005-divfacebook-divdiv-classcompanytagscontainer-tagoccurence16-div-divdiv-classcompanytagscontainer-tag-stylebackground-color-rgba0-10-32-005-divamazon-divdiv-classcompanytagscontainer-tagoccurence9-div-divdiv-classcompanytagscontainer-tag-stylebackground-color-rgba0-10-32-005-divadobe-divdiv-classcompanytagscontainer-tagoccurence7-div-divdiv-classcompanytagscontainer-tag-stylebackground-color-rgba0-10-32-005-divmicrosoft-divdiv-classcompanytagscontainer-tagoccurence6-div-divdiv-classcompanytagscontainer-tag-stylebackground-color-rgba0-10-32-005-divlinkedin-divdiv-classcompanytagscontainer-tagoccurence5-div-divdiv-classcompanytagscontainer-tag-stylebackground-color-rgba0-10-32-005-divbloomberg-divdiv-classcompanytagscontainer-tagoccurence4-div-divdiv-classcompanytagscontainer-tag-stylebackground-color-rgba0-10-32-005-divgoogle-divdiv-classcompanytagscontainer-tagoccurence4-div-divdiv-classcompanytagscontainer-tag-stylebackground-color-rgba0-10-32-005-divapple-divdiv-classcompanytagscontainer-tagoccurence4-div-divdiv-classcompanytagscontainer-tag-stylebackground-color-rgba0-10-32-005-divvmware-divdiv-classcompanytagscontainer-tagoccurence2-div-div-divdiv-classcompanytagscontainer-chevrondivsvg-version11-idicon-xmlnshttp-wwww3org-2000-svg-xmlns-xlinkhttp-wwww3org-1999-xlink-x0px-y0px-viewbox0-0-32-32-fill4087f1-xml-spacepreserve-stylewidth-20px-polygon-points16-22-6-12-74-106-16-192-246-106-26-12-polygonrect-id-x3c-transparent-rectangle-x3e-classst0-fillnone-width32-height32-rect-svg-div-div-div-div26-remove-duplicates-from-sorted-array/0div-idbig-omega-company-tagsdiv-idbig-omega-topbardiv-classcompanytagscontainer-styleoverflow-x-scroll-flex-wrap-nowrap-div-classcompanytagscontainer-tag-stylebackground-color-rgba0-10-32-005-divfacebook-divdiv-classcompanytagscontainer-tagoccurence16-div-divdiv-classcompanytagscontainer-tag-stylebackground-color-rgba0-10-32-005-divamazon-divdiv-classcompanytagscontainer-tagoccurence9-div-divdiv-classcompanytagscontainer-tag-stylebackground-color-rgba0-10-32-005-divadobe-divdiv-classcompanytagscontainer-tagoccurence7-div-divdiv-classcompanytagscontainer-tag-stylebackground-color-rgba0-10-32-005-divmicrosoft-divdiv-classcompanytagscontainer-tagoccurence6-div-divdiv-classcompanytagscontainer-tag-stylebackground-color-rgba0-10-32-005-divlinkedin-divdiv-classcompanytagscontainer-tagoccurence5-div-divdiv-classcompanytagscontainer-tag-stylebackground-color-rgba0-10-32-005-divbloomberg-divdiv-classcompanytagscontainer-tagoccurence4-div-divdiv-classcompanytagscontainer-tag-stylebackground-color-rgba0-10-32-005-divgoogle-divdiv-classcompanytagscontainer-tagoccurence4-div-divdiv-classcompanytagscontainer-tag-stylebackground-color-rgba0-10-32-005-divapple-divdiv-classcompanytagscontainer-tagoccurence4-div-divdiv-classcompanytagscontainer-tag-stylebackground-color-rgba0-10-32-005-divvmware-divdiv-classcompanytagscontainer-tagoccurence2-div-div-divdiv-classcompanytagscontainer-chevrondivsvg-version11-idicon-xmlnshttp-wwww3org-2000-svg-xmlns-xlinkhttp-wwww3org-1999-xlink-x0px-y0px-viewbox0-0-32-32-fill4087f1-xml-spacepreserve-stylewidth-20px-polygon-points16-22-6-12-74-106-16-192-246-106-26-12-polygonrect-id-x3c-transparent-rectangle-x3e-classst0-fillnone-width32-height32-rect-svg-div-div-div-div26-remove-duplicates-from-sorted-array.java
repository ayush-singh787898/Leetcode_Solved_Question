class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer>ts=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            ts.add(nums[i]);
            
        }
        int i=0;
        int c=0;
        for(Integer elm:ts){
            nums[i]=elm;
            i++;
            c++;
        }
        return c;
    }
}