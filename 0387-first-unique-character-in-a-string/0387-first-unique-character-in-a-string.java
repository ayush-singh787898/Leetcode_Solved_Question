
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Iterate through the string to find the first unique character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.get(ch) == 1) {
                // Return the index of the first unique character
                return i;
            }
        }

        // If no unique character is found, return -1
        return -1;
    }
}
