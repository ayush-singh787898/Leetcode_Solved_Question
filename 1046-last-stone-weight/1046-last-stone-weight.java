class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int temp1=pq.remove();
            int temp2=pq.remove();
            if(temp1==temp2){
                continue;
            }
            else if(temp1!=temp2){
                pq.add(Math.abs(temp2-temp1));
                
            }

            
        }
        if(pq.size()==1){
            return pq.remove();
        }
        return 0;
        
    }
}