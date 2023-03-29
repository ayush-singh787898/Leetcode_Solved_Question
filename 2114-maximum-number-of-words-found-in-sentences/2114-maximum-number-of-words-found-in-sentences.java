class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int count=0;
            int len=sentences[i].length();
            for(int j=0;j<len;j++){
                    if(sentences[i].charAt(j)==32){             //  b/c Ascii value of space is 32
                    count++;
                    }
            }
                    max=Math.max(max,count);

        }
        return max+1;
        
    }
}