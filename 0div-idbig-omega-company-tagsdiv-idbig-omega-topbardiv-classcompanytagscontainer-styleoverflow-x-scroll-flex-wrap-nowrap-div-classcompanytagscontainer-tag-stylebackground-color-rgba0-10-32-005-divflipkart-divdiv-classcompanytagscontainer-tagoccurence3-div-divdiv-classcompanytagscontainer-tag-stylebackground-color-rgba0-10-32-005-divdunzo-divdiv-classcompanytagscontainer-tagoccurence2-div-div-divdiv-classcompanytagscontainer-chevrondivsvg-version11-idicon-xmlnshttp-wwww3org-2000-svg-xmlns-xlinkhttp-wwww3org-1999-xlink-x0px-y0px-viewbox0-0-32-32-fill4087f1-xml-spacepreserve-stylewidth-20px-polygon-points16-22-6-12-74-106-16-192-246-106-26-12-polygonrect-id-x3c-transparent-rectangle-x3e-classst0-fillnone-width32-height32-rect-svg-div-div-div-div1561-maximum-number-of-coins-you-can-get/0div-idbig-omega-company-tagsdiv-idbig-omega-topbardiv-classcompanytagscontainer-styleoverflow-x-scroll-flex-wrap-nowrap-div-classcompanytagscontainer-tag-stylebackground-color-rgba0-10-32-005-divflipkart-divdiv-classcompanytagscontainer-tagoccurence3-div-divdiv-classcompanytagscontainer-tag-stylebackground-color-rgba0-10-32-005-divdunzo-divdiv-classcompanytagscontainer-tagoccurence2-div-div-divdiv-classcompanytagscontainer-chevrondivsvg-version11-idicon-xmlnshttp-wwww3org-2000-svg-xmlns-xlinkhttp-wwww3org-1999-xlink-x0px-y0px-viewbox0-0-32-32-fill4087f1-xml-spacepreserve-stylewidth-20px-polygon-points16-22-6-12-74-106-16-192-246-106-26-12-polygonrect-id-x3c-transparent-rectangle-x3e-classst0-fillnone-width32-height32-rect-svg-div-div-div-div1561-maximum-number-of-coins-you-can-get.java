class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0;
        int j=piles.length-2;
        int y=0;
        int sum=0;
        while(i<piles.length/3){   
            sum+=piles[j];
            j-=2;
             i++;;
        }
        return sum;
        
    }
}