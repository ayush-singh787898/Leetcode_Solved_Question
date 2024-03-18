// class Solution {
//     public int minDistance(String word1, String word2) {
//         int dp[][]=new int[word1.length()+1][word2.length()+1];
//         for(int i=0;i<word1.length();i)
//     }
// }

class Solution {
    public int minDistance(String word1, String word2) {
        char[] str1=word1.toCharArray();
        char[] str2=word2.toCharArray();
        int temp[][]=new int[str1.length+1][str2.length+1];
        for(int i=0;i<str1.length+1;i++){
            temp[i][0]=i;
        }
        for(int j=0;j<str2.length+1;j++){
            temp[0][j]=j;
        }
        for(int i=1;i<temp.length;i++){
            for(int j=1;j<temp[i].length;j++){
                if(str1[i-1]==str2[j-1]){
                    temp[i][j]=temp[i-1][j-1];
                }
                else{
                    temp[i][j]=Math.min(temp[i-1][j-1],Math.min(temp[i-1][j],temp[i][j-1]))+1;
                }
               
            }

        }
        // System.out.println(Arrays.deepToString(temp));
        return temp[word1.length()][word2.length()];   
    }
}