class Solution {
 
    public int longestStrChain(String[] words) {
            Arrays.sort(words, Comparator.comparing(s->s.length()));        // sort string on the basis of length.
            Map<String,Integer>hm=new HashMap<>();
            int ans=0;        
            for(String word:words){
                int maxlen=0;
                 for(int i=0;i<word.length();i++){
                    String predecessor=word.substring(0,i)+word.substring(i+1);
                     maxlen=Math.max(maxlen,hm.getOrDefault(predecessor,0)+1);
                }
                hm.put(word,maxlen);
                ans=Math.max(ans,maxlen);

            }
           
            return ans;
    }
}
