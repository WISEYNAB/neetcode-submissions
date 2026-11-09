class Solution {
    public int maxProfit(int[] prices) {
        int maxel = 0;
        int max = 0;
        int n = prices.length;
        
        for(int i = n - 1;i >= 0;i--){
           if(maxel > prices[i]){
            max = Math.max(max,maxel - prices[i]);
           } else {
            maxel = prices[i];
           }
        }

        return max < 0 ? 0 : max;
    }
}
