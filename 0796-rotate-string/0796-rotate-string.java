class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        s+=s;
        if(s.indexOf(goal)>=0){
            return true;
        }
        return false;
    }
}