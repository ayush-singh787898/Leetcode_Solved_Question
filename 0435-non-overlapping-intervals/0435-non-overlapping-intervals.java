class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int len=intervals.length;
        int count=0;
        int endIndex=0;
        if(len<2){
            return 0;
        }
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));     // sorting the 2D array
        int i=1;
        while(i<len){
            //             overlapping case
            if(intervals[i][0]<intervals[endIndex][1]){
                count++;
                if(intervals[i][1]<intervals[endIndex][1]){
                    endIndex=i;
                }
            }
            // non-overlapping case

            else{
                endIndex=i;
            }
            i++;
        }
        return count;
    }
}