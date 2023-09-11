// 1282. Group the People Given the Group Size They Belong To
// ==========================================================

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList();
        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < groupSizes.length; ++i) {
            List<Integer> list = groups.computeIfAbsent(groupSizes[i], k -> new ArrayList());
            list.add(i);
            if (list.size() == groupSizes[i]) {
            res.add(list);
            groups.put(groupSizes[i], new ArrayList());
            }
        }
        return res;
    }
}