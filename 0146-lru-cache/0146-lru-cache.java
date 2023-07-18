// class LRUCache {
//         Stack<Integer> stk1=new Stack<>(capacity);
//     public LRUCache(int capacity) {
//         // Stack<Integer> stk=new Stack<>(capacity);
//     }
    
//     public int get(int key) {
//         while(!stk.isEmpty()){
//             int s=stk.peek();
//             if(s==key){
//                 return key;
//             }
//         }
//         return -1;
//     }
    
//     public void put(int key, int value) {
//         int count=0;
//         if(stk1.isEmpty()){
//             stk1.push(key,value);
//              count=1;
//         }
        
//         while(count<2){
//             stk1.push(key,value);
//             count++;
            
//         }
//         stk1.peek();
//         stk1.push(key,value);
        
//     }
// }






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

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */