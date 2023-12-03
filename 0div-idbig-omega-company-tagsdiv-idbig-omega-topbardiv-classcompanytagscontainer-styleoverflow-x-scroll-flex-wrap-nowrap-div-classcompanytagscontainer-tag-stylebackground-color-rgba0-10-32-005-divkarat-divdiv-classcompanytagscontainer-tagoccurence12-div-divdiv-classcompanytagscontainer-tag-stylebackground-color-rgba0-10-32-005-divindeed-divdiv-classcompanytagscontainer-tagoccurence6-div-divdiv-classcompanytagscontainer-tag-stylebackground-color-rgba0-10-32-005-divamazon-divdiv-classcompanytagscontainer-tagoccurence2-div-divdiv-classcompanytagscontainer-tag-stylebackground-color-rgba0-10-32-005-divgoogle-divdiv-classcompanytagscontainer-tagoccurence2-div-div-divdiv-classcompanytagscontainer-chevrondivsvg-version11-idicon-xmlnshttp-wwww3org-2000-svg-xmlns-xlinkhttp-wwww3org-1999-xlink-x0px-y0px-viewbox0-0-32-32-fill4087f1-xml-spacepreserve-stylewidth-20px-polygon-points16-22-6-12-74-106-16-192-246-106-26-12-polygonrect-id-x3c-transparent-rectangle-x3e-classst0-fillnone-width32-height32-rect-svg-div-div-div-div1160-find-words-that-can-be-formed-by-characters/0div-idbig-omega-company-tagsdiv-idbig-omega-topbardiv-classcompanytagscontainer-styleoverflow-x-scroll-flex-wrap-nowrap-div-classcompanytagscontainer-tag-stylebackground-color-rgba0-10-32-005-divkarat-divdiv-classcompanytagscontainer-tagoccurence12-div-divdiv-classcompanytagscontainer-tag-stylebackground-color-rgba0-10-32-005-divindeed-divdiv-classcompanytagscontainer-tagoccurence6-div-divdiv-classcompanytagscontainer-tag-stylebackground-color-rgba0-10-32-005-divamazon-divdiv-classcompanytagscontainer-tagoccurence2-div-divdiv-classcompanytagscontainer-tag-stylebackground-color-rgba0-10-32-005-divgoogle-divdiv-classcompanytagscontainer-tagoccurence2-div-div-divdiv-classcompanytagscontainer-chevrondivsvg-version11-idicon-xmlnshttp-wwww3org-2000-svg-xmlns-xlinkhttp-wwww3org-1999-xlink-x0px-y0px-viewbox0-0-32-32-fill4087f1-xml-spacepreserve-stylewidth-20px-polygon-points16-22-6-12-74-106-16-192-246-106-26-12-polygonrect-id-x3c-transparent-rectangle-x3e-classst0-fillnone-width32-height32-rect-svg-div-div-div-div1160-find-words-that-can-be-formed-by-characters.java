
class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            hm.put(chars.charAt(i),hm.getOrDefault(chars.charAt(i),0)+1);
        }
        int length=0;
            for(String word : words){
            boolean check = true;
            HashMap<Character, Integer> hm1=new HashMap<>();
            for(int i=0; i<word.length(); i++){
                char ch = word.charAt(i);
                hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
            }
            for(char c : hm1.keySet()){
                if(!hm.containsKey(c) || hm.get(c)<hm1.get(c)){
                    check = false;
                    break;
                }
            } 
            if(check){
                length+=word.length();
            }           
        }
        return length;
    }
}



















