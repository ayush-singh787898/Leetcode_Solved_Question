class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        Arrays.sort(nums);
        int temp=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<set.size();i++){
            if(!set.contains(temp)){
                return temp;
            }
            else{
                temp++;
            }
        }
        System.out.print(Arrays.toString(nums));
        return temp;
    }
}