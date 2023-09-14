class Solution {
                
    static void arr(int[] a,int low,int high){
        while(low<high){
            int temp = a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
    }

    static void swap(int nums[],int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    
    public void nextPermutation(int[] nums) {
        
        int inx1=-1;
        if(nums.length==-1){
            return;
        }
//         Step-1: Check whether i+1 th element is greater or not
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                inx1=i;
                break;
            }
        }
        
//         If Indx==-1 then Reverse the whole array
        if(inx1==-1){
//             Reverse Array
            for(int i = 0; i < nums.length / 2; i++) {
            // Swapping the elements
                int j = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = j;
            }

        }
        else{
           int inx2=0;
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[inx1]){
                    inx2=i;
                    break;
                }
            }
//         SWAPPING
        swap(nums,inx1,inx2); 
//           SORTING
        arr(nums,inx1+1,nums.length-1);
   
        }
        
       
    }
}