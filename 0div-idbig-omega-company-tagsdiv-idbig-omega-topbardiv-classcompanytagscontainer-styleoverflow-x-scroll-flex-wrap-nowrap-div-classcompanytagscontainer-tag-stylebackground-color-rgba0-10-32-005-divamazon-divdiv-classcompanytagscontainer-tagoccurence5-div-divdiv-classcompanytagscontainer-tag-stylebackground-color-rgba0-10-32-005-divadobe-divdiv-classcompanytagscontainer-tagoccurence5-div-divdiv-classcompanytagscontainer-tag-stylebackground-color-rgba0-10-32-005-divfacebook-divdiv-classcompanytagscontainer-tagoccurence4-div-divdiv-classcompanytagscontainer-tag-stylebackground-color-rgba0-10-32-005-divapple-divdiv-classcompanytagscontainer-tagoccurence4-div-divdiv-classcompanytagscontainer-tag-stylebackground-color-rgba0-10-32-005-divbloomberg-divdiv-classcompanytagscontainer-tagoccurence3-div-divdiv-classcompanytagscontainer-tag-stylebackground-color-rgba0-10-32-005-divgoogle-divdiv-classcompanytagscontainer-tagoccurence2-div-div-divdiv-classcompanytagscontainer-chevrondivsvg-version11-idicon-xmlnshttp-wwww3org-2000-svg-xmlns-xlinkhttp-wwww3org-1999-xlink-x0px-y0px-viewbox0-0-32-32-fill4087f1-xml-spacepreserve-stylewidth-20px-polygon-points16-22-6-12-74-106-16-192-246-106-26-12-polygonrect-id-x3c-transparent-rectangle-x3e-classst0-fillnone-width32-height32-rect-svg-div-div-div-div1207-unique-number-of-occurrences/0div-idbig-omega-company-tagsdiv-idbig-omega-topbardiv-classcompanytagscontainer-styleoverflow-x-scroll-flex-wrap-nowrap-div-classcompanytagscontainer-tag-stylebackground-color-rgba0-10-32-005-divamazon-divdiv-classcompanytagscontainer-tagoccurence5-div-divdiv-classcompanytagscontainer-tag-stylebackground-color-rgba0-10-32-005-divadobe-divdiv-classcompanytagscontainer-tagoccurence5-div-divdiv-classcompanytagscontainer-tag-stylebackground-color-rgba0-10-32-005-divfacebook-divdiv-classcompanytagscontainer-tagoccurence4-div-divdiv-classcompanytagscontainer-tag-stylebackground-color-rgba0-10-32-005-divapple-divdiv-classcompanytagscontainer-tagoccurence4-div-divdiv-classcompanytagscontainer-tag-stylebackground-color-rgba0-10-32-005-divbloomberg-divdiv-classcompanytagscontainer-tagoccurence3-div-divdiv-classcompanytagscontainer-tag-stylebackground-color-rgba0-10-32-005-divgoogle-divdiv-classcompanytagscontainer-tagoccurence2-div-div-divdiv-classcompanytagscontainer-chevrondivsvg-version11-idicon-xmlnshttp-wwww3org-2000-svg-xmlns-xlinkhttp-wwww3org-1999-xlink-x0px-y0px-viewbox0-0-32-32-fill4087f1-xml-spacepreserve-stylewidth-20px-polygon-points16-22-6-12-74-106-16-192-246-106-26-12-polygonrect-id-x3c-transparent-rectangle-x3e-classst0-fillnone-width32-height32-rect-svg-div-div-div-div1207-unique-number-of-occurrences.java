class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>hm=new HashMap<>();
        Set<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            Integer value = entry.getValue();
            if(hs.contains(value)){
                return false;
            }
            hs.add(value);

        }
        return true;
    }
}