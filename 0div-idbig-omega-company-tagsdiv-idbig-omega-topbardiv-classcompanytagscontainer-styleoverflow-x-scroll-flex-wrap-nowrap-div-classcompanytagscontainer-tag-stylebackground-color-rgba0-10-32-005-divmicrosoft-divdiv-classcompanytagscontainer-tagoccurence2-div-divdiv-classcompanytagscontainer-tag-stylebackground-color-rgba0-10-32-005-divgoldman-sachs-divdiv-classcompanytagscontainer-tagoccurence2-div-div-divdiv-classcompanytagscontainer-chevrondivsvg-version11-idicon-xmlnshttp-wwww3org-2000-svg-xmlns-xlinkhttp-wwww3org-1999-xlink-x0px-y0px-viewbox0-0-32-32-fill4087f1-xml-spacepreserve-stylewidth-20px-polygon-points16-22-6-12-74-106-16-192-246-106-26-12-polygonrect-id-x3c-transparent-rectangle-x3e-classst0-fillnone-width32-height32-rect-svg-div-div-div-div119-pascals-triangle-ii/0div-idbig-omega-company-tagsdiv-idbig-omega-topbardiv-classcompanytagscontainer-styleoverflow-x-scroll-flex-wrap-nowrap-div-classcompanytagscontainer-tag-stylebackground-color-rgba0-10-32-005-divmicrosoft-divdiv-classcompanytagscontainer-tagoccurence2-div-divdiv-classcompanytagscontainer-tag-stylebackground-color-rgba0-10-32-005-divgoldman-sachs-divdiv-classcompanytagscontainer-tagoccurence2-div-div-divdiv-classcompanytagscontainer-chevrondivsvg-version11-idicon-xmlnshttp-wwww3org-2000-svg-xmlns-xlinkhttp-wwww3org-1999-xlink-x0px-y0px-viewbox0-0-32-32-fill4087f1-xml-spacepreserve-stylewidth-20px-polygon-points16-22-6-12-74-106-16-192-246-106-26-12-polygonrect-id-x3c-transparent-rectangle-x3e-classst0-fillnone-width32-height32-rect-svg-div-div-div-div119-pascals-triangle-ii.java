class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>row=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer>lst=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    lst.add(1);
                }
                else{
                    lst.add(row.get(j-1)+row.get(j));
                }
            }
            row=lst;
        }
        return row;
    }
}