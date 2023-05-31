class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>result=new ArrayList<List<Integer>>();
        HashSet<Integer>hs1=new HashSet<Integer>();
        HashSet<Integer>hs2=new HashSet<Integer>();
          for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
          }
          for(int i=0;i<nums2.length;i++){
            hs2.add(nums2[i]);
              if(hs1.contains(nums2[i])){
                  hs1.remove(nums2[i]);
              }
          }
          for(int i=0;i<nums1.length;i++){
              if(hs2.contains(nums1[i])){
                  hs2.remove(nums1[i]);
              }
          }
        result.add(new ArrayList<Integer>(hs1));
        result.add(new ArrayList<Integer>(hs2));
        return result;
    }
}