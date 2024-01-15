
public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> ts1 = new TreeSet<>();
        Set<Integer> ts2 = new TreeSet<>();
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int len = matches.length;
        for (int i = 0; i < len; i++) {
            ts1.add(matches[i][0]);
            ts2.add(matches[i][1]);
            hm.put(matches[i][1], hm.getOrDefault(matches[i][1], 0) + 1);

        }
        System.out.println(lst1);
        System.out.println(ts1);

        for (Integer element : ts1) {
            if (!ts2.contains(element)) {
                lst1.add(element);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                lst2.add(entry.getKey());
            }
        }
        Collections.sort(lst1);
        Collections.sort(lst2);
        res.add(lst1);
        res.add(lst2);
        return res;
    }
}




























