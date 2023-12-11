
public class Solution {
    public int findSpecialInteger(int[] arr) {
        int val = (int) (0.25 * arr.length);
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > val) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
