class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            String x=Integer.toBinaryString(i);
            int Count_One=0;
            for(int j=0;j<x.length();j++){
                if(x.charAt(j)==49){
                    Count_One++;
                }
            }
            arr[i]=Count_One;
        }
        return arr;
    }
}