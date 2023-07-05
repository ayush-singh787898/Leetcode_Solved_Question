class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b.compareTo(a)); 
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a); 



        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int j=0;
        while(j<k-1){
            pq.remove();
            j++;
        }
        return pq.peek();
    }
}