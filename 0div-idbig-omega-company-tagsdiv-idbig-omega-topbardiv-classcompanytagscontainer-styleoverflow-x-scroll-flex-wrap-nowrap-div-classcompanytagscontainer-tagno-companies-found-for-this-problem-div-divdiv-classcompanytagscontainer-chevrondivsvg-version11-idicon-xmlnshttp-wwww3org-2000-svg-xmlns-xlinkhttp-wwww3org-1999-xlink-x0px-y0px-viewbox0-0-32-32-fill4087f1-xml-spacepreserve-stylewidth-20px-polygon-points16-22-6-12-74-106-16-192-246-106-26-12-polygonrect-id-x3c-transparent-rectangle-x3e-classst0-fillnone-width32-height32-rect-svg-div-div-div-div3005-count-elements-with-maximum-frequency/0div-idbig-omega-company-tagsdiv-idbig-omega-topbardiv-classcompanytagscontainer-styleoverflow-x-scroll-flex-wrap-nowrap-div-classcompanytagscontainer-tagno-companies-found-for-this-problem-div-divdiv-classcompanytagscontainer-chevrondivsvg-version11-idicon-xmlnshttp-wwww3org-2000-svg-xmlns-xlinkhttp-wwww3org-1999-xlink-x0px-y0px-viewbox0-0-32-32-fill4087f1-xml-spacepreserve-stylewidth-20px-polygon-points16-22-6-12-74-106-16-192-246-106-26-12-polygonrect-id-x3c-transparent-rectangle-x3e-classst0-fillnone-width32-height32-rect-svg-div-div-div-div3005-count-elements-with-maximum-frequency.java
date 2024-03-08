class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int freq = 0;

        for (int num : nums) {
            int frequency = hm.getOrDefault(num, 0) + 1;
            hm.put(num, frequency);
            max = Math.max(max, frequency);
        }

        for (int frequency : hm.values()) {
            if (frequency == max) {
                freq += max;
            }
        }

        return freq;
        
    }
}