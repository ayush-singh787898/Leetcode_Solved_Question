class Solution {
        public static int ExtChar(int indx,String s,Map<String,Boolean>map ,int dp[]){
            if(indx>=s.length()){
                return 0;
            }
            if(dp[indx]!=-1){
                return dp[indx];
            }
            String curr="";
            int ans=s.length();
            for(int i=indx;i<s.length();i++){
                curr+=s.charAt(i);
                int extraCount=curr.length();
                if(map.containsKey(curr)){
                    extraCount=0;
                }
                extraCount+=ExtChar(i+1, s, map, dp);
                ans=Math.min(ans,extraCount);
            }
        return dp[indx]=ans;    
    }
    public int minExtraChar(String s, String[] dictionary) {
        
        Map<String,Boolean>map=new HashMap<>();
        for(String str:dictionary){
            map.put(str, true);
        }
        int arr[]=new int[51];
        Arrays.fill(arr,-1);
        return ExtChar(0,s,map,arr);
    }
}