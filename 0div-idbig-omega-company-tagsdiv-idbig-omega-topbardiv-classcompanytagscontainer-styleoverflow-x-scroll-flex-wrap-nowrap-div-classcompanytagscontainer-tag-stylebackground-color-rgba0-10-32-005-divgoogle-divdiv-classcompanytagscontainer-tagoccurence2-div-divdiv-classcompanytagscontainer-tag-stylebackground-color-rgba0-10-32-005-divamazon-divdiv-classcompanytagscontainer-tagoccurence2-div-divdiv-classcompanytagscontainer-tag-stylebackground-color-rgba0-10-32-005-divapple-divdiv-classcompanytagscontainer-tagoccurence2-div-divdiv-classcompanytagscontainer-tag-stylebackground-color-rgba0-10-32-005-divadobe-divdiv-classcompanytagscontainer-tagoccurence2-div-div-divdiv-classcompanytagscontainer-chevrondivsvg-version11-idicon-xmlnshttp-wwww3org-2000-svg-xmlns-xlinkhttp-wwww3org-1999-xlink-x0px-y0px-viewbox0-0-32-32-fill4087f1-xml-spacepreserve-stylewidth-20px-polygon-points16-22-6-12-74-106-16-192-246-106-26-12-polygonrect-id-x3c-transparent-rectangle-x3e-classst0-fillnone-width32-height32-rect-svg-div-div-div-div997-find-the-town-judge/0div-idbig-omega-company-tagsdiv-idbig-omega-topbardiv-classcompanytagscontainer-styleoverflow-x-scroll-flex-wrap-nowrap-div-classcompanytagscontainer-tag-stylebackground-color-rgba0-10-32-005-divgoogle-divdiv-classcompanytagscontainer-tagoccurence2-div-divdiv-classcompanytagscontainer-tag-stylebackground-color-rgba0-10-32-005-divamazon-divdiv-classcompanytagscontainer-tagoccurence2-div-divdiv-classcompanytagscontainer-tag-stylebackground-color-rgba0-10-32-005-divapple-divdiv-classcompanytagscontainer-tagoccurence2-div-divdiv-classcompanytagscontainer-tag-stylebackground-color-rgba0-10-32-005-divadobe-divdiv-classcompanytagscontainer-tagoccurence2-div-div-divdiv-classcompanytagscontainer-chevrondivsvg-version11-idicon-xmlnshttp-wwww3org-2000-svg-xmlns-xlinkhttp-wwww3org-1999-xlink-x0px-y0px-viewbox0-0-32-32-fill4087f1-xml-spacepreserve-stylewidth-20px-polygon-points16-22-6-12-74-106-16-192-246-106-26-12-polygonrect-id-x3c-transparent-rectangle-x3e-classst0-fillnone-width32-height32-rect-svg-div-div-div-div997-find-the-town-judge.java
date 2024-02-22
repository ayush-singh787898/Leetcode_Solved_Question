class Solution {
    public int findJudge(int n, int[][] trust) {
        
        if(trust.length==0){
            if(n==2) return -1;
            else return 1;
        }
        Set<Integer>people=new HashSet<>();
        Map<Integer,Integer>hm=new HashMap<>();     
        for(int i=0;i<trust.length;i++){
            people.add(trust[i][0]);
            int key=trust[i][1];
            if(hm.containsKey(key)){
                hm.put(key,hm.get(key)+1);
            }
            else{
                hm.put(key,1);
            }
            
        }
        for(Integer key:hm.keySet()){
            if(hm.get(key)==n-1 && people.contains(key)==false){
                return key;
            }
        }
        return -1;
    }
}