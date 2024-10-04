import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        
        // Count frequencies of characters
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        // Convert HashMap to List of Map.Entry
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(hm.entrySet());
        
        // Sort the List based on values (frequencies)
        Collections.sort(entryList, (a, b) -> b.getValue() - a.getValue());
        
        // Build the sorted string
        // StringBuilder str = new StringBuilder();
        String str="";
        for (Map.Entry<Character, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                // str.append(entry.getKey());
            }
        }
        
        return str.toString();
    }
}
