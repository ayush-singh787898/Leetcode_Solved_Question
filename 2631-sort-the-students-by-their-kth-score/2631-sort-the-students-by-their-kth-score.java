class Solution {

    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int m=score[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(score[i][k]<score[j][k]){
                    int arr[]=score[i];
                    score[i]=score[j];
                    score[j]=arr;
                }
            }
        }
        return score;
    }
}