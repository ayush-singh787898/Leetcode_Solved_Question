class Solution {
    public int[] findArray(int[] pref) {
       int len=pref.length;
        int arr[]=new int[len];
        if(len==1){
           return pref;
        }
        arr[0]=pref[0];
        for(int i=1;i<len;i++){
            int xor=pref[i-1]^pref[i];
            arr[i]=xor;
        }
        return arr;
    }
}