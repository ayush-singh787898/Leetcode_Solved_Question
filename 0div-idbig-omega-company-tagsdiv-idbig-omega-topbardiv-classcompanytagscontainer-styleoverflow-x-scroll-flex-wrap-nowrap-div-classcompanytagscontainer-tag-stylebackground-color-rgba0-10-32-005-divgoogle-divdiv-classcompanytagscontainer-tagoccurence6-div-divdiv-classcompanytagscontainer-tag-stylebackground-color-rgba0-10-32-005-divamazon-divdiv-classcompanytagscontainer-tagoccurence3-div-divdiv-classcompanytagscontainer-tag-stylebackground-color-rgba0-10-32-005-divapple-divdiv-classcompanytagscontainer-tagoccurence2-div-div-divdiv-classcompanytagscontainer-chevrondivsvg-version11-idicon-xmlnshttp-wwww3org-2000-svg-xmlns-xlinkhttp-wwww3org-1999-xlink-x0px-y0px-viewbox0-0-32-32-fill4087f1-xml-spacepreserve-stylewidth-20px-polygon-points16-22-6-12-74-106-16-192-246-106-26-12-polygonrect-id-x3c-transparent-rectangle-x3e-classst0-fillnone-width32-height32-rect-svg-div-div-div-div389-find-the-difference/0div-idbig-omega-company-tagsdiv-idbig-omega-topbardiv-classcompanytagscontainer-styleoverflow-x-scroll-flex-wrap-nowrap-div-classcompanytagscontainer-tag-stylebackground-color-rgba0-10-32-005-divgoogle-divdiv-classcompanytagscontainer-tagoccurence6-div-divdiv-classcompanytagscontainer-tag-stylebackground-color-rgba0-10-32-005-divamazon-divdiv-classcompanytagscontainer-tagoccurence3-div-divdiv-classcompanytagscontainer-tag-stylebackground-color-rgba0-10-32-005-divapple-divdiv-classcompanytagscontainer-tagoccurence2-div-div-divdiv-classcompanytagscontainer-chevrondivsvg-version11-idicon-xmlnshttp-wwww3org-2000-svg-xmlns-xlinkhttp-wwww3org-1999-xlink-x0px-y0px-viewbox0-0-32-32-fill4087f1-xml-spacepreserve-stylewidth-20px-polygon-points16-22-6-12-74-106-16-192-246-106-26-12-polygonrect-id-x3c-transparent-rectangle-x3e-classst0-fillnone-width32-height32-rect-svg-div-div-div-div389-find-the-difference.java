// Solution-1

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0)+1);             
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
            }
        }
        char ans=',';
       for(Map.Entry<Character,Integer>entryset: hm.entrySet()){
           if(entryset.getValue()!=0){
               ans=entryset.getKey();
           }
       }
        return ans;
    }
}

