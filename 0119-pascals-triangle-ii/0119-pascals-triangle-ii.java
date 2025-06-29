class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>lst=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer>arr=new ArrayList<>();
            arr.add(1);
            for(int j=1;j<i;j++){
                arr.add(lst.get(i-1).get(j-1)+lst.get(i-1).get(j));
            }
            if(i>0){
                arr.add(1);
            }
            lst.add(arr);

        }
        
        return lst.get(rowIndex);
    }
}