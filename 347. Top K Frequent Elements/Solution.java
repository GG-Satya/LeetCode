// 347. Top K Frequent Elements
// ============================

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       // Count frequencies of elements using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Use a PriorityQueue to get the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(frequencyMap.entrySet());

        // Extract the top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}