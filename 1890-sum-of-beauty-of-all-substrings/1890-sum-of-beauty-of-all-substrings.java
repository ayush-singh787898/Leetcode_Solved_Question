class Solution {
    public static int beauty(String s,int i,int j){
        int[]ch=new int[26];
        for(int inx=i;inx<=j;inx++){
            char elm=s.charAt(inx);
            ch[elm-'a']++;
        }
        // System.out.println(Arrays.toString(ch));

        int maxi=0;
        int mini=Integer.MAX_VALUE;
        for(int inx=0;inx<ch.length;inx++){
            if(ch[inx]>0){
                maxi=Math.max(ch[inx],maxi);
                mini=Math.min(ch[inx],mini);

            }
        }
        return maxi-mini;
    }
    public int beautySum(String s) {
        int beauty=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                beauty+=beauty(s,i,j);
            }
        }
        return beauty;
    }
}