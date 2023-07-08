class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int differ[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Set<Integer>s1=new HashSet<>();
            for(int j=0;j<=i;j++){
                    s1.add(nums[j]);
            }
            Set<Integer>s2=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                    
                    s2.add(nums[j]);
                
            }
            differ[i]=s1.size()-s2.size();
        }

        return differ;
    }
}






