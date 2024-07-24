class Solution {
    List<int[]>result=new ArrayList<>();
    public int[][] insert(int[][] intervals, int[] newInterval) {
        for(int []curr:intervals){
            if(newInterval[0]>curr[1]){
                result.add(curr);
            }
            else if(newInterval[1]<curr[0]){
                result.add(newInterval);
                newInterval=curr;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],curr[0]);
                newInterval[1]=Math.max(newInterval[1],curr[1]);
            }
        }
        
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}