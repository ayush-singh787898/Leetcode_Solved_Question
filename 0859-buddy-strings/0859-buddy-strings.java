class Solution {
    public boolean buddyStrings(String A, String B) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(A.length() != B.length()){
            
            return false;

        }
        
        for(int i = 0; i < A.length(); i++) {
            arr1[A.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < B.length(); i++) {
            arr2[B.charAt(i)-'a']++;
        }
        
        for(int i=0; i<26; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        
        int freq = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                freq++;
            }
        }
        
        if(freq == 2) return true;
        
        if(freq == 0) {
            for(int i=0; i<26; i++) {
                if(arr1[i] > 1) return true;
            }
        }
        
        return false;
    }
}
