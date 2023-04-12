class Solution {
    public boolean isIsomorphic(String s, String t) {
    HashMap<Character,Character>hm=new HashMap<Character,Character>();
    if(s.length()!=t.length()){
        return false;
    }
    for(int i=0;i<s.length();i++){
        if(hm.containsKey(s.charAt(i))){
            if(!hm.get(s.charAt(i)).equals(t.charAt(i))){			// value doesn't match
                return false;
            }
        }
        else{
            if(hm.containsValue(t.charAt(i))){
                return false;	
            }
            // if key and value both are not mapped then map both the character.
            hm.put(s.charAt(i),t.charAt(i));
        }
    }
    return true;
        
    }
}