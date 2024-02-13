class Solution {
    public String firstPalindrome(String[] words) {
        boolean isPalindrome=false;
        String str="";
        for(int i=0;i<words.length;i++){
            int left=0;
            
            int right=words[i].length()-1;
            if(words[i].length()%2!=0){
                while(left<=right){
                    if(words[i].charAt(left)!=words[i].charAt(right)){
                        break;
                    }
                    System.out.println(i);
                    if(left==right){
                        str+=words[i];
                        return str;
                    }
                    left++;
                    right--;
                }
            }
            if(words[i].length()%2==0){
                
            
                while(left<right){
                    if(words[i].charAt(left)!=words[i].charAt(right)){
                        break;
                    }
                    System.out.println(i);
                    if(left==words[i].length()/2-1 && right==words[i].length()/2){
                        str+=words[i];
                        return str;
                    }
                    left++;
                    right--;
                }
            }    
        }
        return str;
    }
}