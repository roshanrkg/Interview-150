class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int profit=0;
        int maxprofit=0;
        int minprice=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                profit = prices[i] - minprice;
                if(profit > maxprofit){
                    maxprofit= profit;
                }
            }
        }
        return maxprofit;
    }

}
