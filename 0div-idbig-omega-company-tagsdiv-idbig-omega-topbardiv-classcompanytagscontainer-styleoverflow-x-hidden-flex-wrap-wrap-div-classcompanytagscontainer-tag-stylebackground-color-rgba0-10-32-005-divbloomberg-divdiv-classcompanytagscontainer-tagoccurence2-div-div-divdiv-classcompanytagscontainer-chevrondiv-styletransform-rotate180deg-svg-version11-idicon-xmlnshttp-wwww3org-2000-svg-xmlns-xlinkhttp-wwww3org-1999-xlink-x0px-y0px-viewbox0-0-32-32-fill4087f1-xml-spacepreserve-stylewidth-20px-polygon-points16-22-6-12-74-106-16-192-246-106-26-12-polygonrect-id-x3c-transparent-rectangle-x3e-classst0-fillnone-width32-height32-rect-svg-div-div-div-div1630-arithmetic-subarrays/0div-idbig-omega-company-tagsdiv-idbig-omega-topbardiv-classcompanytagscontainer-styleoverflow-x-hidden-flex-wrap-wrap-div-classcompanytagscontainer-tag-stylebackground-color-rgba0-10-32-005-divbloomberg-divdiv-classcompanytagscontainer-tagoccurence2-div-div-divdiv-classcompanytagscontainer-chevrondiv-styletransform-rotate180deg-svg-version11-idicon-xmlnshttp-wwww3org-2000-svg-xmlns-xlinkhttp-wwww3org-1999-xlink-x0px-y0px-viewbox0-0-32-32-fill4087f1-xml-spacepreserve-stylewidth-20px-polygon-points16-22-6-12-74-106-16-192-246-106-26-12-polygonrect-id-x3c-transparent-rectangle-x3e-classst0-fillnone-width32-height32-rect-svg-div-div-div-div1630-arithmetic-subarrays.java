class Solution {
    public static Boolean arithOper(int x,int y,int[]nums){
        List<Integer>lst=new ArrayList<>();
        for(int i=x;i<=y;i++){
            lst.add(nums[i]);
        }
        Collections.sort(lst);
        System.out.println(lst);

        int d=lst.get(1)-lst.get(0);
        for(int i=2;i<lst.size();i++){
            if((lst.get(i)-lst.get(i-1))!=d){
                return false;
            }
            
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean>lb=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            int x=l[i];
            int y=r[i];
            Boolean b=arithOper(x,y,nums);
            lb.add(b);     
        }
        return lb;     
    }
}