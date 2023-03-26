class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char arr1[]=jewels.toCharArray();
        char arr2[]=stones.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int j=0;j<jewels.length();j++){
            for(int i=0;i<stones.length();i++){
                if(arr1[j]==arr2[i]){
                    count++;
                }
            }
        }
        return count;
        
    }
}