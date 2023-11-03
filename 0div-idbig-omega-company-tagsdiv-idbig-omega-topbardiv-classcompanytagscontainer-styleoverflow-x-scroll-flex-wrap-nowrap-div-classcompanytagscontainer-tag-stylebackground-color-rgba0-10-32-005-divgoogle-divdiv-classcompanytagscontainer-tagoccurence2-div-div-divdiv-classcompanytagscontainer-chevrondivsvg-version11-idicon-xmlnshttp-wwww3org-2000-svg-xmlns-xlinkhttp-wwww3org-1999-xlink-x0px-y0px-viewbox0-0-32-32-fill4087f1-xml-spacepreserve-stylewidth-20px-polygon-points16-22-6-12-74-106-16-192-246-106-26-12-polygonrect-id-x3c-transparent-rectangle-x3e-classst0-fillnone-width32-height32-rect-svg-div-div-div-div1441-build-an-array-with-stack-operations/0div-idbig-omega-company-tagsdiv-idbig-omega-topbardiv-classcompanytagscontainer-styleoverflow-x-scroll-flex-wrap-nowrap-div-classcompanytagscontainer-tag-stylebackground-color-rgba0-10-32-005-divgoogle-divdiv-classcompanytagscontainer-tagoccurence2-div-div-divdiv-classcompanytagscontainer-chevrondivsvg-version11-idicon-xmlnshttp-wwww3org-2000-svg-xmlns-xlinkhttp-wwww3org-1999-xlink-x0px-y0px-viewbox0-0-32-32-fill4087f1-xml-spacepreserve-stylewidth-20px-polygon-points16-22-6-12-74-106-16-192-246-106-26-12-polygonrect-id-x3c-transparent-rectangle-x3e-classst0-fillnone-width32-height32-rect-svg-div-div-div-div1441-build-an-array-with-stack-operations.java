class Solution {
    public List<String> buildArray(int[] target, int n) {


        int stream = 1;
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < target.length && stream <= n) {
            result.add("Push");
            
            if (stream == target[i]) {
                i++;
            } else {
                result.add("Pop");
            }
            stream++;
        }
        
        return result;

    }
}