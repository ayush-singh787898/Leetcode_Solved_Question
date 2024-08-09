import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length; // size of the array

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // Select an interval
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Skip all the merged intervals
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            // Check the rest of the intervals
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }

        // Convert the list of lists to a 2D array
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}

