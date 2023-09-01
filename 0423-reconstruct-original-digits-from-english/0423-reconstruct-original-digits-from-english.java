class Solution {
    public String originalDigits(String s) {
        
        /*
        
        Z(Zero) -> 0
        X (Six) -> 6
        U (Four) -> 4
        W (Two) ->2
        G (Eight) ->8
        F (Five+Four+Zero) -> 0 & 1 & 2 & 4
        O (One+Two+Four+Zero)   -> 0 & 1 & 2 & 4
        T (three+Eight+two)     -> 3 & 8 & 2
        S (Seven+Six)  -> 6 & 7 
        I (nine+five+six+eight) ->  9 & 5 & 6 & 8
        */
        
        int []map=new int[26];
        for(char ch:s.toCharArray()){
            map[ch-'a']++;
        }
        int n=10;
        int digit []=new int[n];
        digit[0]=map['z'-'a'];
        digit[6]=map['x'-'a'];
        digit[4]=map['u'-'a'];
        digit[2]=map['w'-'a'];
        digit[8]=map['g'-'a'];
        digit[5]=map['f'-'a']- digit[4];
        digit[7]=map['s'-'a']- digit[6];
        digit[1]=map['o'-'a']- digit[0]- digit[2]- digit[4];
        digit[3]=map['t'-'a']-digit[8]-digit[2];
        digit[9]=map['i'-'a']- digit[5]- digit[6]- digit[8];
        
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            int count=digit[i];
            while(count>0){
                res.append(i);
                count--;
            }
        }
        return res.toString();


        
    }
}