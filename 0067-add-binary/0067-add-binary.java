class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            carry=sum>1?1:0;        // if sum is greater than 1 then carry=1
            sb.append(sum%2);          // sum%2 b/c binary value can either be 0 or 1.
            i--;
            j--;
        }
        if(carry>0){
            sb.append(carry);       // it means carry will be 1 and it is added at last
        }
        return sb.reverse().toString();     
        
    }
}