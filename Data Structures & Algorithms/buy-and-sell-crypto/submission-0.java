class Solution {
    public int maxProfit(int[] prices) {
         int buy=prices[0];
        int profit=0;
        int running=0;


        for(int fast = 1; fast<prices.length; fast++) {
            if(buy<prices[fast]) {
                running=prices[fast]-buy;
                profit=Math.max(running,profit);
            }
            else {
                buy=prices[fast];
            }

        }
        return profit;
    }
}
