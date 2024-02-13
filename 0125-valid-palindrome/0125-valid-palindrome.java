class Solution {
    public boolean isPalindrome(String s) {
        String x=s.toLowerCase();
        Set<Character>set=new HashSet<>();
        Set<Integer>Nset=new HashSet<>();
        for(char ch='a';ch<'z';ch++){
            set.add(ch);
        }
        for(int i=0;i<=9;i++){
            Nset.add(i);
        }
        String str="";
        for(int i=0;i<x.length();i++){
            if(set.contains(x.charAt(i))){
                str+=x.charAt(i);
            }
  
            if (Nset.contains(x.charAt(i) - '0')) {
                 str += x.charAt(i);
            }

        }
        int left=0;
        int right=str.length()-1;
        boolean flag=true;
         while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=false;
            }
            left++;
            right--;
         }
        if(flag){
            return true;
        }
        System.out.println(str);
   

        return false;
    }
}