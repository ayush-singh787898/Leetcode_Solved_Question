class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ng[]=new int[nums2.length];
        Arrays.fill(ng,-1);
        int res[]=new int[nums1.length];
        Stack<Integer> stk=new Stack<>();
        
        int x=0;
        
        for(int i=nums2.length-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=nums2[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                ng[i]=stk.peek();
            }
            stk.push(nums2[i]);
        }
        System.out.println(Arrays.toString(ng));
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                res[i]=ng[j];
                break;
            }
        }
        }
     
        return res;
    }
}