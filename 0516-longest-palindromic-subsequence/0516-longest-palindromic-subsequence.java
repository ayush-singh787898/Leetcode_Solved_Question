class Solution {
    public static int LPS(String s,String rs,int dp[][]){
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=rs.length();j++){
                if(s.charAt(i-1)==rs.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=0+Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }

        }
        return dp[s.length()][rs.length()];

    }
    public int longestPalindromeSubseq(String s) {
        // String rs="";
        // for(int i=s.length()-1;i>=0;i--){
        //     rs+=s.charAt(i);
        // }
        String rs=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[s.length()+1][s.length()+1];
        return LPS(s,rs,dp);
        
    }
}