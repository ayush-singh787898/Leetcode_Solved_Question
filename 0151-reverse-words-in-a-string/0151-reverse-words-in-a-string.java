class Solution {
    public String reverseWords(String s) {
        // Trim the string and replace multiple spaces with a single space
        s = s.trim().replaceAll("\\s+", " ");
        
        // Reverse the entire string
        StringBuilder sb = new StringBuilder(s).reverse();
        
        // Split the reversed string by spaces
        String[] words = sb.toString().split(" ");
        
        // Reverse each word and join them with a space
        sb.setLength(0); // Clear the StringBuilder for reuse
        for (int i = 0; i < words.length; i++) {
            sb.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
