class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n==2){
            return true;
        }
        int ans=2;
        for(int i=1;i<Math.sqrt(n);i++){
            ans*=2;
            if(ans==n){
                return true;
            }
        }
        return false;
    }
}