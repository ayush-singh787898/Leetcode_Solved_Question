class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        while(tickets[k]!=0){
            for(int j=0;j<tickets.length;j++){
                if(tickets[k]==0){
                    return time;
                }
                if(tickets[j]>0){
                    tickets[j]=tickets[j]-1;
                    time++;
                }
            }
        }
        return time;
    }
}