

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        // Sort Hashmap
        
        // step-1 create a list of map
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(hm.entrySet());
        //step-2  sort list map
        
        // Collections.sort(sortedEntries, (a, b) -> a.getValue().compareTo(b.getValue()));
        sortedEntries.sort((a, b) -> a.getValue() - b.getValue());

        // remove element whose freq is 1 otherwise decrease its frequency

        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                hm.remove(entry.getKey());
            } else {
                break;
            }
        }
 
        return  hm.size();

    }
}















