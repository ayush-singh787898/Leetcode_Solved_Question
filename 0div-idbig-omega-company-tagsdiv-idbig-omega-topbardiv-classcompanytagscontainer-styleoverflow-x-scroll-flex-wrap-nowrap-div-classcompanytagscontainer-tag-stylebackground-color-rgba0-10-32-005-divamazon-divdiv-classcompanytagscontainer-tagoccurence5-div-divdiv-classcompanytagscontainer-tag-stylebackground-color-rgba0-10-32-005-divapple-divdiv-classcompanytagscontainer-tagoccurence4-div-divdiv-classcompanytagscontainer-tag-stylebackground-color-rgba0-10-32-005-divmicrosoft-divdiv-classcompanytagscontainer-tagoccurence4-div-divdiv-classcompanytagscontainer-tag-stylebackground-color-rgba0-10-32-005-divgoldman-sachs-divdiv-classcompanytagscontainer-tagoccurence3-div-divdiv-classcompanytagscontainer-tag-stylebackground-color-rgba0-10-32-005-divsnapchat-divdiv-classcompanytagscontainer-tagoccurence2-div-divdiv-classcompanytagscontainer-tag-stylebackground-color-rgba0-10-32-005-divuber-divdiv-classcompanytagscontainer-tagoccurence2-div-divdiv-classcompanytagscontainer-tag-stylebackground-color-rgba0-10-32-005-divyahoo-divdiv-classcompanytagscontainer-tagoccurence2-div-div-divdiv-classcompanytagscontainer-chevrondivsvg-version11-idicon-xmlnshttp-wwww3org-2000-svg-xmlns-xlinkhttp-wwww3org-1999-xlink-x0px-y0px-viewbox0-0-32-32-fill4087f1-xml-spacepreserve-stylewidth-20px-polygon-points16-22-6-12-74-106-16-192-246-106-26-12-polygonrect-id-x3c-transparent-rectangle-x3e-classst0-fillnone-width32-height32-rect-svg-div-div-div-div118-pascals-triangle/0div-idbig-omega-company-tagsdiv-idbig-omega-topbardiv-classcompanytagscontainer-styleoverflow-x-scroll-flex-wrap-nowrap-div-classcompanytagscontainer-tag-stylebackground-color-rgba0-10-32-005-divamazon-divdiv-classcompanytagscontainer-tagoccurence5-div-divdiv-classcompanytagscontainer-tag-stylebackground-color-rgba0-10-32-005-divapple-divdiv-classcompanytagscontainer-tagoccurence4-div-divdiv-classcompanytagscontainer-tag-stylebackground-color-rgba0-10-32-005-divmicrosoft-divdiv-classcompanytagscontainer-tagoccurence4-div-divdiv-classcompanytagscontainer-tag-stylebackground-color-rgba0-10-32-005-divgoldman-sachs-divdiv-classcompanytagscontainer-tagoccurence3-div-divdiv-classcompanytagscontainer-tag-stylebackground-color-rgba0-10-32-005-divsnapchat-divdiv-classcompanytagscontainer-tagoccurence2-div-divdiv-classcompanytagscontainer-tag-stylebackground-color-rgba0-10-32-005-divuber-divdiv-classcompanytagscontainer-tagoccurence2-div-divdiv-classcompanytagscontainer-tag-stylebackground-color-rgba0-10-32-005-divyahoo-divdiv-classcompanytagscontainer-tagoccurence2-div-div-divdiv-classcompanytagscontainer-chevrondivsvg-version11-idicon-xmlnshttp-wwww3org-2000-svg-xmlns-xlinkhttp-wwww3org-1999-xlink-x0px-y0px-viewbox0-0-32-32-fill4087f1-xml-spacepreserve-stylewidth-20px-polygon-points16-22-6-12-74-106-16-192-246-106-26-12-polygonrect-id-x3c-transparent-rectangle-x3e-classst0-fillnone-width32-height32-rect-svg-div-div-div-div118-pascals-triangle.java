class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        
        // base case 
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer>lst=new ArrayList<>();
            List<Integer>preRow=res.get(i-1);
            lst.add(1);
            for(int j=preRow.size()-1;j>=1;j--){
                lst.add(preRow.get(j)+preRow.get(j-1));
            }
            lst.add(1);
            res.add(lst);

        }
        return res;
    }
}


