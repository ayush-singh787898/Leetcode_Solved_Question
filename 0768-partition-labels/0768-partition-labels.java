
class Solution {
    public List<Integer> partitionLabels(String s) {
        // List to store the lengths of partitions
        List<Integer> partition = new ArrayList<>();
        
        // Iterate through the string to find partitions
        for (int i = 0; i < s.length(); i++) {
            // Start and end indices for the current partition
            int startInx = i;
            int endInx = s.lastIndexOf(s.charAt(startInx));
            
            // Expand the end index if necessary
            for (int sinx = startInx + 1; sinx < endInx; sinx++) {
                int lastInxNextChar = s.lastIndexOf(s.charAt(sinx));
                if (lastInxNextChar > endInx) {
                    endInx = lastInxNextChar;
                }
            }
            
            // Add the partition size to the list
            partition.add(endInx - startInx + 1);
            
            // Move the index to the end of the current partition
            i = endInx;
        }
        
        return partition;
    }
}
