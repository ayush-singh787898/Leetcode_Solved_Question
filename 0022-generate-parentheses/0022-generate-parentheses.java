class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        backTrack(ans,"",0,0,n);        // ans,current string,open parenthesis,close parenthesis,input
        return ans;
    }
    public void backTrack(List<String>ans,String curr,int open,int close,int max){
        if(curr.length()==max*2){
            ans.add(curr);
            return;
        }
        if(open<max){
            backTrack(ans,curr+"(",open+1,close,max);
        }
        if(close<open){
            backTrack(ans,curr+")",open,close+1,max);
        }
    }
}