class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer>hmp=new HashMap<>();
        int len=words.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<words[i].length();j++){
                hmp.put(words[i].charAt(j),hmp.getOrDefault(words[i].charAt(j),0)+1);      // Increase freq of character by 1 if the character repeat 

            }
        }
        for (Map.Entry<Character, Integer> entry : hmp.entrySet()) {
            if (entry.getValue() % len != 0) {  // here we are cheking whether frequency of character equals to no. of words or not. If equal return true otherwise retrun false;
                return false;
            }
        }

        return true;
    }
}