class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int i=0;
        double timeArr[]=new double[speed.length];
        while(i<dist.length){
            timeArr[i]=(double)dist[i]/speed[i]; 
            i++;
        }
        Arrays.sort(timeArr);
        for(int j=0;j<dist.length;j++){
            if(timeArr[j]<=j){
                return j;
            }
        }
        return speed.length;
    }
}



