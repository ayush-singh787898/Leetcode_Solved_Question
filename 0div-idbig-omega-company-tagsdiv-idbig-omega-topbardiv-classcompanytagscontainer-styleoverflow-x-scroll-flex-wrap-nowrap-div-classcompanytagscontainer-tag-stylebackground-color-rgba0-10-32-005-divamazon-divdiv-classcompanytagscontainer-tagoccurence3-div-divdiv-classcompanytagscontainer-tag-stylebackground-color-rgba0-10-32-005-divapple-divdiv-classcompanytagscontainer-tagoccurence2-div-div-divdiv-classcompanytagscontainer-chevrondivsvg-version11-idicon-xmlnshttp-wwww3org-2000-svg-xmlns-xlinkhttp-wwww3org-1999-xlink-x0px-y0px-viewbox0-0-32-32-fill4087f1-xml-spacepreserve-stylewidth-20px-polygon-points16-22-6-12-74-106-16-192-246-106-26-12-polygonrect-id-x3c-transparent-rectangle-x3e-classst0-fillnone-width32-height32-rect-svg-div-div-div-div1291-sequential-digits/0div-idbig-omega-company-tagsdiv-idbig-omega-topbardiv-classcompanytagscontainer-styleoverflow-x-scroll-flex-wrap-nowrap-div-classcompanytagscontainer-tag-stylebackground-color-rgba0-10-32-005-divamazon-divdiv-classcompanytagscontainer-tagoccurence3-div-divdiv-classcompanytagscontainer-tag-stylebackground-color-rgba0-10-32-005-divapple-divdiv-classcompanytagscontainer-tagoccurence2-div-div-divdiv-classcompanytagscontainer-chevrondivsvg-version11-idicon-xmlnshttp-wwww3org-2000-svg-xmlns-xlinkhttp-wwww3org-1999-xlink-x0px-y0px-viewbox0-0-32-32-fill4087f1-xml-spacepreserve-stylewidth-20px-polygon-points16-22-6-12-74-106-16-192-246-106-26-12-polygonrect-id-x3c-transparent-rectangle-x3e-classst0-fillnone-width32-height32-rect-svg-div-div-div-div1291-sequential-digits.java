class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>al=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            int nextNum=i+1;
            while(num<=high && nextNum<=9){
                num=num*10+nextNum;
                if(num>=low && num<=high){
                    al.add(num);
                }
                nextNum++;
            }
        }
        Collections.sort(al);
        return al;
    }
}