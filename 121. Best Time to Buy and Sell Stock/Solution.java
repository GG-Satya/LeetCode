// 121. Best Time to Buy and Sell Stock
// ====================================

class Solution {

    public int maxProfit(int[] prices) {

        int len = prices.length;

        int ans = 0;

        int min = prices[0];

        for(int i=0; i<len-1; i++){

            min = prices[i]<min ? prices[i]: min;

            int diff = prices[i+1] - min;

            if(diff>0)ans = diff>ans?diff:ans;

        }return ans;
    }
}