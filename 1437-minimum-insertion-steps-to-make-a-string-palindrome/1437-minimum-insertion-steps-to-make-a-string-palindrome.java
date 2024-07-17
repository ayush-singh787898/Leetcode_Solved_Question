class Solution {
    public static int stepCount(int dp[][],String s,String res){
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){
                if(s.charAt(i-1)==res.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=0+Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }

        }
        int LongesPalindromeLength=dp[s.length()][res.length()];
        return s.length()-LongesPalindromeLength;
    }
    public int minInsertions(String s) {
        String res=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[s.length()+1][res.length()+1];
        return stepCount(dp,s,res);
    }
}