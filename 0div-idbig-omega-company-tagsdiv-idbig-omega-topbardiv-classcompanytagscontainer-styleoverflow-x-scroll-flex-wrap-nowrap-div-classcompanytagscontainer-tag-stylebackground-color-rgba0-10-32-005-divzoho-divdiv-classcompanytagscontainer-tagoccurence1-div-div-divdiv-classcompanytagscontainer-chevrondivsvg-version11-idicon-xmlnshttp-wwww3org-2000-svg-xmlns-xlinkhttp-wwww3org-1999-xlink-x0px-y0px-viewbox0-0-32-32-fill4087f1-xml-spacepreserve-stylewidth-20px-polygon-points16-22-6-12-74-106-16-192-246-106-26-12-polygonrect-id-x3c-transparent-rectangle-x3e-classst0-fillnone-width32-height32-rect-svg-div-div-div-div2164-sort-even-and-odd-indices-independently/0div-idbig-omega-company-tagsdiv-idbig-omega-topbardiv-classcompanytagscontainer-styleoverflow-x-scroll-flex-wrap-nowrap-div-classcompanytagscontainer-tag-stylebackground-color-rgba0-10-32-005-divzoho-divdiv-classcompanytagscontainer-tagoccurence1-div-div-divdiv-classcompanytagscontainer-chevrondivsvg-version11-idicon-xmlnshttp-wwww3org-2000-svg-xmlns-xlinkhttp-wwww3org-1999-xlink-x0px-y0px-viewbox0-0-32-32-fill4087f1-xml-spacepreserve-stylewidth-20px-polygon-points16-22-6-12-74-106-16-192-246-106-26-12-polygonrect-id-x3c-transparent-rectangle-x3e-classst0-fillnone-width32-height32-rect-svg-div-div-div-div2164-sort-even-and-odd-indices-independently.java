
class Solution {

    public int[] sortEvenOdd(int[] nums) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        Collections.sort(list2);
        Collections.sort(list1);
        Collections.reverse(list2);
        List<Integer>list=new ArrayList<>();
        int inx=0;
        int jnx=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                list.add(list1.get(inx));
                inx++;
            }
            else{
                list.add(list2.get(jnx));
                jnx++;
            }

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}








