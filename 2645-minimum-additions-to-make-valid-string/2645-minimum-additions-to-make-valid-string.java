class Solution {
    public int addMinimum(String word) {
        int count=0;
        int ans=0;
         if(word.length()==1){
                count=2;
                System.out.print(count);
                return count;
        }
        int i=0;
        while(i<word.length()){
            char ch=word.charAt(i);
                int count1=0;
                if(word.charAt(i)=='a'){
                    count1++;
                    i++;
                }
                 if(i<word.length() && word.charAt(i)=='b'){
                    count1++;i++;

                }
                 if(i<word.length() && word.charAt(i)=='c'){
                    count1++;i++;

                }
            ans+=3-count1;
              
        }
        return ans;
        
    }
}