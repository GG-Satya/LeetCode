// 1962. Remove Stones to Minimize the Total
// =========================================

class Solution {

    public int minStoneSum(int[] piles, int k) {

        int n = piles.length;

        while (k > 0) {

            Arrays.sort(piles);

            for (int i=n-1; i>=n/2; i--) {

                int remove = (int)Math.floor(piles[i]/2);

                piles[i] -= remove;

                k--;

                if (k == 0) break;
            }
        }

        int ans = 0;

        for (int w :piles) 

        ans += w;

        return ans;
    }
}