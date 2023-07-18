

// Use hashMap 
class LRUCache {
    LinkedHashMap<Integer, Integer> mem_Cache = new LinkedHashMap<>();
        int storCap;
    public LRUCache(int capacity) {
        this. storCap = capacity;
    }
    private void recentCall(int key){
    int val =  mem_Cache.get(key);
     mem_Cache.remove(key);
     mem_Cache.put(key, val);
    }
    public int get(int key) {
        if (! mem_Cache.containsKey(key)){
            return -1;
        } 
        recentCall(key);
        return  mem_Cache.get(key);
    }
    
    public void put(int key, int value) {
        if ( mem_Cache.containsKey(key)){
             mem_Cache.remove(key);
            
        }
        if (this. storCap <=  mem_Cache.size()){
            int oldest =  mem_Cache.keySet().iterator().next();
             mem_Cache.remove(oldest);
        }
         mem_Cache.put(key, value);
    }


}

