class Solution {
    public int reverse(int x) {
        boolean b=false;
        if(x<0){
            x=x*-1;
            b=true;
        }
        long rev=0;
        while(x>0){
            int temp=x%10;
            rev=rev*10+temp;
            x=x/10;
        }
        if(b==true){
            rev=rev*-1;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
        
        
    }
}