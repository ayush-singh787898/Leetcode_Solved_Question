

class Solution {
	    private int onesCount(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
    public int maxScore(String s) {
        int max = 0;
        int countZeroesLeft = 0;
        int NoOnesRight = onesCount(s);

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                countZeroesLeft++;
            } 
            else{
                NoOnesRight--;
            }
            max = Math.max(max, countZeroesLeft + NoOnesRight);
        }
        return max;
    }


}
