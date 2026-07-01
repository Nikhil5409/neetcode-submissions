class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[] suffixMax = new int[n];
        suffixMax[n-1] = prices[n-1];
        for(int i=n-2;i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1], prices[i]);
        }
        int maxProfit=0;
        int profit=0;
        for(int i=0;i<n;i++){
            profit=suffixMax[i]-prices[i];
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
