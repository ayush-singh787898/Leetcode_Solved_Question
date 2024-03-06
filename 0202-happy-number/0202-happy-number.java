class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){  // If n becomes 1, it's a happy number, if it becomes 4, it's not a happy number.

            int res=0;
            while(n>0){
                int temp=n%10;
                res+=temp*temp;
                n=n/10;
            }
            n=res;
        }
        if(n==1){
            return true;
        }
        return false;
        
    }
}