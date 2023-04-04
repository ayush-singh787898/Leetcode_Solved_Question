class Solution {
    public int partitionString(String s) {
        HashSet<Character>hs=new HashSet<>();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else{
                hs.clear();
                hs.add(s.charAt(i));
                count++;
            }
        }
        return count;
    }
}