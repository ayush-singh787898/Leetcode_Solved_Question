class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set1.contains(nums2[j])){
                return nums2[j];
            }
        }
        return -1;
    }
}