// 950. Reveal Cards In Increasing Order
// =====================================

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++)q.add(i);
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[q.poll()] = deck[i];
            q.add(q.poll());
        }
        return ans;
    }
}