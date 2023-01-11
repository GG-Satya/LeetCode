// 1443. Minimum Time to Collect All Apples in a Tree
// ==================================================

class Solution {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

	java.util.Arrays.sort(edges, new java.util.Comparator<int[]>() {

        public int compare(int[] a, int[] b) {
            return a[0] - b[0];
        }
    });

    for(int[] edge: edges)

		if (m.containsKey(edge[1]))

            m.put(edge[0], edge[1]);
        else
            m.put(edge[1], edge[0]);

    int result = 0;

    for(int i = 0; i < hasApple.size(); ++i) {

        if (!hasApple.get(i)) continue;

        int p = i;

        while(p != 0 && m.get(p) >= 0) {

            int temp = m.get(p);

            m.put(p, -1); // mark as visited

            p = temp;

            result += 2;
        }
    }
    return result;
    }
}