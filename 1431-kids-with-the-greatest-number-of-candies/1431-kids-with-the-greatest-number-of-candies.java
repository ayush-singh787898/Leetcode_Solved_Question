
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>b=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        System.out.print(max);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<max){
                b.add(false);
            }
            else{
                b.add(true);
            }
        }
        return b;
        
    }
}