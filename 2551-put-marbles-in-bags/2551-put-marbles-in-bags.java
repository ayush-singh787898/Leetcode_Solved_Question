class Solution {
    public long putMarbles(int[] weights, int k) {
        List<Integer>sumMar=new ArrayList<>();
        long minSum=0;
        long maxSum=0;
        for(int i=1;i<weights.length;i++){
            sumMar.add(weights[i]+weights[i-1]);
        }
//         find MinSum
        Collections.sort(sumMar);
        for(int i=0;i<k-1;i++){
            minSum+=sumMar.get(i);
        }
        
        
//         find MaxSum
        
        Collections.reverse(sumMar);
        
        for(int i=0;i<k-1;i++){
            maxSum+=sumMar.get(i);
        }
        return maxSum-minSum;
    }
}







