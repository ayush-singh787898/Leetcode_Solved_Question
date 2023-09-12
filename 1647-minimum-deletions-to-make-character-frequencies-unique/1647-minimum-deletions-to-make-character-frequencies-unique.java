class Solution {
    public int minDeletions(String s) {
        int count=0;
        Set<Integer>set=new HashSet<>();
        int [] ch=new int[26];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        
//         line no 6 to 8 or  line no. 11 to 13 both are same
        // for(char c:s.toCharArray()){
        //     ch[c-'a']++;
        // }
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            while(ch[i]>0 && set.contains(ch[i])){
                ch[i]--;
                count++;
            }
            set.add(ch[i]);
        }
        return count;
    }
}