class Solution {

    public int lengthOfLIS(int[] nums) {
        List<Integer>lst=new ArrayList<>();
        lst.add(nums[0]);
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>lst.get(lst.size()-1)){
                lst.add(nums[i]);
                len++;
            }
            else{
                int indx=lowerBound(lst,nums[i]);  // apply binary search to insert the element at their right position. 
                lst.set(indx,nums[i]);
            }
        }
        return len;
    }
    
    
    public static int lowerBound(List<Integer>lst,int key){
        int low=0;
        int high=lst.size();
        while(low<high){
            int mid=(low+high)/2;
            if(lst.get(mid)<key){     // Search right half
                low=mid+1;
            }
            else{           // Search left half
                high=mid;
            }
        }
        return low;
    }
}