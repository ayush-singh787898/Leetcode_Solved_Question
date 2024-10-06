class Solution {
    public String reverseWords(String s) {
        s=s.trim();     // remove first and last space 
        String []str=s.split("\\s+");       // convert string to string array and also replace multiple space with single space.
        System.out.println(Arrays.toString(str));
        String res="";
        for(int i=str.length-1;i>0;i--){
            res+=str[i];
            res+=" ";   
        }
        res+=str[0];
        return res;

    }
}