class Solution {
    public int minimumLength(String s) {
        if (s.length() == 0) {
            return 0;
        }
        
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j && s.charAt(i) == s.charAt(j)) {
            char current = s.charAt(i);
            while (i <= j && s.charAt(i) == current) {
                i++;
            }
            while (j >= i && s.charAt(j) == current) {
                j--;
            }
        }
        
        return j - i + 1;
    }
}
