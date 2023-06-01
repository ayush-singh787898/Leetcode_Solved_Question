// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
//         Arrays.sort(arr);
//         int count=1;
//         HashMap<Integer,Integer>hm=new HashMap<>();
//         for(int i=0;i<arr.length-1;i++){
//             while(i+1<n){
//                 if(arr[i]==arr[i+1]){
//                 count++;
//                 }
                
//             }  
            

//             else{
//                 hm.add(arr[i],count);
                
//             }
//             // hm.add(arr[i],count);
//         }
//         for(int i=0;i<hm.size();i++){
//             if(hm.get(i)==hm.get(i+1)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }



class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : hm.values()) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }
}
