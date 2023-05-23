

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int rp=1;
        // for left part
        for(int i=0;i<nums.length;i++){
            arr[i]=rp;
            rp=rp*nums[i];
        }
        // for right par
        rp=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*rp;
            rp=rp*nums[i];
        }
        return arr;
    }
}
























// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int arr[]=new int[nums.length];
   
//         int j=0;
//         int i=0;
//         arr[i]=1;
//         int temp=1;
//         while(i<nums.length-1 && j<nums.length){
//               if(i==nums.length-1){
//                 arr[i]=1;
//                 i=0;
//                 j++;
//             }
//                 if(i==j){
//                     // arr[i]=1;
//                        temp=1; 
//                     // continue;
//                 }
            
         
//                         System.out.println(arr[i]);
//             // int temp=arr[i+1];
//             arr[i]=temp*nums[i+1];
//             temp=arr[i];
//             System.out.println(arr[i]);

//             // if(i==nums.length-1){
//             //     arr[i]=1;
//             //     i=0;
//             //     j++;
//             // }
//             i++;
//             System.out.println(Arrays.toString(arr));
//         }
//         return arr; 
//     }
// }







