class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        int n=columnNumber;
        while(n>0){
            n--;
            s.append((char)(n%26+'A'));
            n=n/26;
        }
        return s.reverse().toString();
    }
}