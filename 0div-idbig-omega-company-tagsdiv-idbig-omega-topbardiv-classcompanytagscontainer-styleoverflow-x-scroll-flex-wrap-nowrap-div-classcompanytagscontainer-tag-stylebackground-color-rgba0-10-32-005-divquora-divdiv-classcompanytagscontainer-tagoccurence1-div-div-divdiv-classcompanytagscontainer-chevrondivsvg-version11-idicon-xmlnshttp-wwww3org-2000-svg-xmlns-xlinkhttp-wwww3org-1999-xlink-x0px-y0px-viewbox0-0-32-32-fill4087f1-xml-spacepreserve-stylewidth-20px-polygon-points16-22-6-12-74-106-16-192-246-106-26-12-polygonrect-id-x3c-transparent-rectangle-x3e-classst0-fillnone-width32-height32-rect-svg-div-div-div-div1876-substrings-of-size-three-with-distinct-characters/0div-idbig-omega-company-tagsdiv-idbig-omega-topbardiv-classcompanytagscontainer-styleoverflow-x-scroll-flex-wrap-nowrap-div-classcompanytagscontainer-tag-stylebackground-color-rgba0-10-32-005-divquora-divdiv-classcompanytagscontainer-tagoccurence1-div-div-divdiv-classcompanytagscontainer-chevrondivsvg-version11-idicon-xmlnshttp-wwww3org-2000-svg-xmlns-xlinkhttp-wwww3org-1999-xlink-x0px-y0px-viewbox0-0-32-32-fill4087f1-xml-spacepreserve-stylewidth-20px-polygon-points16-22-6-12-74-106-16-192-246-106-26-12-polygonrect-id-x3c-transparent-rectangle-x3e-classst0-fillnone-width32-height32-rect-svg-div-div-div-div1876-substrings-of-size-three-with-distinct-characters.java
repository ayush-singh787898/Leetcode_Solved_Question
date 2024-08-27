class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        List<String>lst=new ArrayList<>();
        String str="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(count==3){
                count=2;
                lst.add(str);
                System.out.println(str);
                str=str.substring(1);
            }
            count++;
            str+=s.charAt(i);
        }
        str+=s.charAt(s.length()-1);
        lst.add(str);
        int res=0;
        for(int i=0;i<lst.size();i++){
            Set<Character>set=new HashSet<>();
            int c=0;
            for(int j=0;j<3;j++){
                if(!set.contains(lst.get(i).charAt(j))){
                    set.add(lst.get(i).charAt(j));
                    c++;
                }
            }
            if(c==3){
                res++;
            }
        }
        return res;
    }
}