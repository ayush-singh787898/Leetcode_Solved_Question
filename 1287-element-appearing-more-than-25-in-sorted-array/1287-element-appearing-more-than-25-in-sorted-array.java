class Solution {
    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        int quarter=len/4;
        for(int i=0;i<len-quarter;i++){
            if(arr[i]==arr[i+quarter]){
                return arr[i];
            }
        }
        return -1;
    }
}