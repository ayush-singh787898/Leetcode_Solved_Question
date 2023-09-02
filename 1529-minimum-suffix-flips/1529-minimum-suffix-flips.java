
class Solution {
    public int minFlips(String target) {
        int flips = 0; 
        for (char c : target.toCharArray()) {
            if (c == '1') {
                if (flips % 2 == 0) {
                    flips++;
                }
            }
            else { 
                if (flips % 2 == 1) {
                    flips++;
                }
            }
        }
        
        return flips; 
    }
}





