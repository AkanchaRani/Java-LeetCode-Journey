class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                  buy=prices[i];
            }
            int profit=prices[i]-buy;
            
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}