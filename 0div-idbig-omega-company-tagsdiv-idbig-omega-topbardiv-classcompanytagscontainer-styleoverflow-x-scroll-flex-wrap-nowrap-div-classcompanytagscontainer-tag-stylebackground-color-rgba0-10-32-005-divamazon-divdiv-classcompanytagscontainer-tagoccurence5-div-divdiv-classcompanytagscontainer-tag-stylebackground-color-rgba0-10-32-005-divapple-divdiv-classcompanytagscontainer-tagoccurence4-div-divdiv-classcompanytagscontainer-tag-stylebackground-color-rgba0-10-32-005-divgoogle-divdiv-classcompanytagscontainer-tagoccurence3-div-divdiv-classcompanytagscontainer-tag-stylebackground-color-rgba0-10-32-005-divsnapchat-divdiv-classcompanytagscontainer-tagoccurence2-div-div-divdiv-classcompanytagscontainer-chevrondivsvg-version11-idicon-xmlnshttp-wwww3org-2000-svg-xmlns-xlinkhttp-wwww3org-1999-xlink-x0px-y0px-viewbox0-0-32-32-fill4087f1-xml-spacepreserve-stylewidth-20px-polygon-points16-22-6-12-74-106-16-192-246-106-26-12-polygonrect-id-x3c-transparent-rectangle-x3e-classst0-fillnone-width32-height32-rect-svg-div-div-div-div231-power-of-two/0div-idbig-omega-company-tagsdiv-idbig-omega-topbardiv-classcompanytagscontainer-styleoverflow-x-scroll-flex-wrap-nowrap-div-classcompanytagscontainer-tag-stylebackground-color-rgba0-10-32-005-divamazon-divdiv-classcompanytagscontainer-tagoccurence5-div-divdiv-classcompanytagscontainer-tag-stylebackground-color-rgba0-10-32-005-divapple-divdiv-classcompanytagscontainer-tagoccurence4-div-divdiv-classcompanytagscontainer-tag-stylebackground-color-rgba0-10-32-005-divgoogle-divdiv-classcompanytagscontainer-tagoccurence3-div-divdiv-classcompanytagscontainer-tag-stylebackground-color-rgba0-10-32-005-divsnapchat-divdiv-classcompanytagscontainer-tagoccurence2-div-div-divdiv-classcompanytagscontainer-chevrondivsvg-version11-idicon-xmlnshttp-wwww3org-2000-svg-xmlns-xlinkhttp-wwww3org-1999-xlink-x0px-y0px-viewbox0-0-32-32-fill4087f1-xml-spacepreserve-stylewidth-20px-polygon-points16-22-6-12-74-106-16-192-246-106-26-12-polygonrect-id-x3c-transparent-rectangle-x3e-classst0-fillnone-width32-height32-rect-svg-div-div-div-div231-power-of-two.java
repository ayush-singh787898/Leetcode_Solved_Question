class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        String binary1 = Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<binary1.length();i++){
            if(binary1.charAt(i)=='1'){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}