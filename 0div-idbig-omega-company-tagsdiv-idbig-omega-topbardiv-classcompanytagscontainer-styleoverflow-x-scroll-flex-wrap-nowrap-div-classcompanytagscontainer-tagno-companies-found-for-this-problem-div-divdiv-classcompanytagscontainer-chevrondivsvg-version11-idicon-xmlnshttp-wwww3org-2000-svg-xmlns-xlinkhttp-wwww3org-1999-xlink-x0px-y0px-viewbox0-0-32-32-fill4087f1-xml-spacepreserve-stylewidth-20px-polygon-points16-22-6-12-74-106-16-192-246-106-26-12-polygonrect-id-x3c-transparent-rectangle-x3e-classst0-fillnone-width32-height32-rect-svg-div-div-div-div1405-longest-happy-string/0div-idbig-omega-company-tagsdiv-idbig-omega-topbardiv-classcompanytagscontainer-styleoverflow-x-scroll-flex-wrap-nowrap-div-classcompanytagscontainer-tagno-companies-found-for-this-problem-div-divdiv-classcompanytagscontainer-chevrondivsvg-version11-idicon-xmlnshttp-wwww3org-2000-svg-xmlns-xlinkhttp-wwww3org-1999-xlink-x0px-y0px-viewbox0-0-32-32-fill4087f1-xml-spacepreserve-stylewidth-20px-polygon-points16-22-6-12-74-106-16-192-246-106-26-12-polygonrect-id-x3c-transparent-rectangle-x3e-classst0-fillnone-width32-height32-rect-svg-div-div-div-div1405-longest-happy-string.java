class Solution {
    // Class to store the count of each character and the character itself
    static class Pair implements Comparable<Pair> {
        int count;
        char character;

        // Constructor to initialize the pair with character count and the character
        Pair(int count, char character) {
            this.count = count;
            this.character = character;
        }

        // Custom compareTo method to sort pairs in descending order by count
        @Override
        public int compareTo(Pair other) {
            return other.count - this.count;  // Sort based on higher count
        }
    }

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();  // To store the resulting string
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>();  // Max heap to store characters by count

        // Add characters to the heap if their count is greater than 0
        if (a > 0) maxHeap.add(new Pair(a, 'a'));
        if (b > 0) maxHeap.add(new Pair(b, 'b'));
        if (c > 0) maxHeap.add(new Pair(c, 'c'));

        // Process characters until the heap is empty
        while (!maxHeap.isEmpty()) {
            Pair current = maxHeap.poll();  // Get the character with the highest count
            int n = res.length();

            // Check if the last two characters are the same as the current character
            if (n >= 2 && res.charAt(n - 1) == current.character && res.charAt(n - 2) == current.character) {
                // If yes, try to use the next character in the heap
                if (maxHeap.isEmpty()) break;  // If no other characters, break out of the loop

                Pair next = maxHeap.poll();  // Get the next character with a lower count
                res.append(next.character);  // Add it to the result
                next.count--;  // Decrease its count

                // If the next character still has occurrences, re-add it to the heap
                if (next.count > 0) maxHeap.add(next);
            } else {
                // Otherwise, append the current character to the result
                res.append(current.character);
                current.count--;  // Decrease its count
            }

            // Re-add the current character to the heap if it still has occurrences
            if (current.count > 0) maxHeap.add(current);
        }

        return res.toString();  
    }
}
