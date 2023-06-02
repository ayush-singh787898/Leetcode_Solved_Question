// class Solution {
//     public boolean closeStrings(String word1, String word2){
//         int freq1[]=new int[26];
//         int freq2[]=new int[26];
//         Set<Character>set1=new HashSet<>();
//         Set<Character>set2=new HashSet<>();
       
//         for(char c: word1.toCharArray()){
//             freq1[c-'a']++;
//             set1.add(c);
//         }
        
//         for(char c : word2.toCharArray()){
//             freq2[c-'a']++;
//             set2.add(c);
//         }
//         Set<Integer>freqs1=new HashSet<>();
//         Set<Integer>freqs2=new HashSet<>();
//         for(int f:freq1){
//             freqs1.add(f);
//         }
//         for(int f:freq2){
//             freqs2.add(f);
//         }

//         return set1.equals(set2) && freqs1.equals(freqs2);
        
//     }
// }



class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        
        for(int i=0;i<word1.length();i++)
            arr1[word1.charAt(i)-'a']++;
        
        for(int i=0;i<word2.length();i++)
            arr2[word2.charAt(i)-'a']++;
        
        for(int i=0;i<26;i++)
            if((arr1[i]==0 && arr2[i]!=0) || (arr1[i]!=0 && arr2[i]==0))
                return false;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0;i<26;i++)
            if(arr1[i]!=arr2[i])
                return false;
        
        return true;
    }
}