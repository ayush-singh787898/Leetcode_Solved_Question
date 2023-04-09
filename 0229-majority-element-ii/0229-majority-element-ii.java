class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>al=new ArrayList<>();
        Arrays.sort(nums);
        int freq=0;
        int arr=nums[0];
        int n=nums.length;        
        for(int i=0;i<nums.length;i++){
            if(arr==nums[i]){
                freq++;
            
            if(freq>(n/3)){
                al.add(nums[i]);
                while(i<n-1 && nums[i]==nums[i+1]){
                    i++;
                }
            }
            }
            else{
                freq=1;
                arr=nums[i];
                if(freq>n/3){
                    al.add(arr);
                }
            }
        }
        return al;
    }
}