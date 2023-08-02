class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        backTrack(ans,new ArrayList<>(),nums);
        return ans;
        
        
    }
    void backTrack(List<List<Integer>>ans,ArrayList<Integer>tList,int[] nums){
        // base case
        
        if(tList.size()==nums.length){
            ans.add(new ArrayList<>(tList));
            return;
        }
        
        for(int n:nums){
            if(tList.contains(n)){
                continue;
            }
            
            tList.add(n);
            
            backTrack(ans,tList,nums);
            
            tList.remove(tList.size()-1);
        }
        
        
        
    }
}