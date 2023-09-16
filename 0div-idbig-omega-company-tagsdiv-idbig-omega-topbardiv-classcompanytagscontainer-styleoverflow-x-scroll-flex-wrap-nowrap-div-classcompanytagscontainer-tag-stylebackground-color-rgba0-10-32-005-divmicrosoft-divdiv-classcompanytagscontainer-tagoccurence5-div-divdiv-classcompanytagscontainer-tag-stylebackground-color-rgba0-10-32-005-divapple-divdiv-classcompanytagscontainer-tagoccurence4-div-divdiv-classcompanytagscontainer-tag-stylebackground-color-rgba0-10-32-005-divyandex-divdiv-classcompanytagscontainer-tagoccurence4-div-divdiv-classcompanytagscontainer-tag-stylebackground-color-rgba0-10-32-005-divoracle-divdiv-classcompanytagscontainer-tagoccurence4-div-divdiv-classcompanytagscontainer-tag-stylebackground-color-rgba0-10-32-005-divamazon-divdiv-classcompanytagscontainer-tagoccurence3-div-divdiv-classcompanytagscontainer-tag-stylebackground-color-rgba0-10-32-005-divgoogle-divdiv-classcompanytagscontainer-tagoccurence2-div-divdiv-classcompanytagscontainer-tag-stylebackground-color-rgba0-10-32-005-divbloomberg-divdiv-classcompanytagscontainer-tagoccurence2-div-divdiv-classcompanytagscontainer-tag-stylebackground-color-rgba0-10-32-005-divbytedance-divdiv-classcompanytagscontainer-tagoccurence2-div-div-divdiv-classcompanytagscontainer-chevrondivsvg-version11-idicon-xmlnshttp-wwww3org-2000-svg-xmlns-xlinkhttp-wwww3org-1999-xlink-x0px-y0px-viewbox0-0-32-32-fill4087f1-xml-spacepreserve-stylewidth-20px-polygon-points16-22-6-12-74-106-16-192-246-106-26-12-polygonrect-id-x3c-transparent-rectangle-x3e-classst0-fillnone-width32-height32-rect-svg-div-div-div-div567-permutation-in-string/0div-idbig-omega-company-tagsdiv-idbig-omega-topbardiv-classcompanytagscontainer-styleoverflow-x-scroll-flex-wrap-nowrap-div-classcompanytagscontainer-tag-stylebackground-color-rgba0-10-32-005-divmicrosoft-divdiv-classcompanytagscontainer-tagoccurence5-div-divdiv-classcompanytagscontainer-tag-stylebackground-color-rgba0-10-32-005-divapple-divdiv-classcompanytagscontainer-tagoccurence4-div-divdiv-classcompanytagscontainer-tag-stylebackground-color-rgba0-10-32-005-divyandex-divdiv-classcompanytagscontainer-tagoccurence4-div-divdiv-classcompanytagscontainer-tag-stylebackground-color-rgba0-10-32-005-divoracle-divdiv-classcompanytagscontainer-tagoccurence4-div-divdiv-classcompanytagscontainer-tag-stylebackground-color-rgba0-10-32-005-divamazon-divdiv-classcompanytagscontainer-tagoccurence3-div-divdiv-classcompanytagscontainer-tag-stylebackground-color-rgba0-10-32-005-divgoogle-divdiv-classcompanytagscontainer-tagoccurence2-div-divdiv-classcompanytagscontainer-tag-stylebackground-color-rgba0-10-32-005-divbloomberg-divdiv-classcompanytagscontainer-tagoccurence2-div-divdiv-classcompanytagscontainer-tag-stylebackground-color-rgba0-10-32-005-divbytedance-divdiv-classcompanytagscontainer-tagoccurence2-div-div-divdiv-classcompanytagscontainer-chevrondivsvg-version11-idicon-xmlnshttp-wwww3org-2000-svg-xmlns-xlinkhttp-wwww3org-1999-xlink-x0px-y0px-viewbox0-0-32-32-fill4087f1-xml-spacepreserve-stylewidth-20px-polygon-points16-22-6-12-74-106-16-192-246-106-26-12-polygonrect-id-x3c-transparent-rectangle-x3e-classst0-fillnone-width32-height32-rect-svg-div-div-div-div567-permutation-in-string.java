class Solution {
    
    public static boolean allZero(int []arr){
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {

        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<len1;i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
            if(i-len1>=0){
                arr[s2.charAt(i-len1)-'a']++;
            }
            if(allZero(arr)){
                return true;
            }

        }
        return false;
    }
}