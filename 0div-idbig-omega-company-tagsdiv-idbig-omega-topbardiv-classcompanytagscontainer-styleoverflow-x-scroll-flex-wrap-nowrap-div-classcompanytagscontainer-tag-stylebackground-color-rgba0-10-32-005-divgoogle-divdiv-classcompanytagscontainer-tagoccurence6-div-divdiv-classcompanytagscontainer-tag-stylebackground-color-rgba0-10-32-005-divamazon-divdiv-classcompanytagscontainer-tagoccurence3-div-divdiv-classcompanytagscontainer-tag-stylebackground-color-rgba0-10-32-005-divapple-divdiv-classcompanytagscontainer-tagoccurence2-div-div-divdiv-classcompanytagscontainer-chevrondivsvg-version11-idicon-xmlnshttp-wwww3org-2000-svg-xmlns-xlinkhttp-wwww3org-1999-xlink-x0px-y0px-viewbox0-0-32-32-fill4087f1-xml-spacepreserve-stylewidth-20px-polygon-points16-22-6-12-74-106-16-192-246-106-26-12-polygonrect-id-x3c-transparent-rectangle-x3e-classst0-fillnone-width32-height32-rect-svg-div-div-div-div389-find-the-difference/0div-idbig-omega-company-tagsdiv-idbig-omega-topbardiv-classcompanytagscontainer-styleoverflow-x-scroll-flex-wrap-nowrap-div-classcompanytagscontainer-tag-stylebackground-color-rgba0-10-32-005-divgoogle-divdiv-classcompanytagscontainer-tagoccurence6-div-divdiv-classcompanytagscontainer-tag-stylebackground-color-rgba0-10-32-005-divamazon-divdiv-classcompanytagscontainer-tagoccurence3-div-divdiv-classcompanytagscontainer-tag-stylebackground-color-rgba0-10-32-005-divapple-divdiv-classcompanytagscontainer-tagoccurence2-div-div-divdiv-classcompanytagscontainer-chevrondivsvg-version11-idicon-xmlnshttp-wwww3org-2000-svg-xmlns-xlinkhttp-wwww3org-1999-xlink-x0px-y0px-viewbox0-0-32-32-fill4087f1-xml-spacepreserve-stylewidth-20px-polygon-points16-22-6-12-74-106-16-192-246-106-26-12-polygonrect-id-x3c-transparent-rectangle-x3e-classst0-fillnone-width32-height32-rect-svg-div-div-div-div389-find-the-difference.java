class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (int i = 0; i < s.length(); i++) {
            c = (char)(c ^ s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            c = (char)(c ^ t.charAt(i));
        }
        return c;
    }
}
