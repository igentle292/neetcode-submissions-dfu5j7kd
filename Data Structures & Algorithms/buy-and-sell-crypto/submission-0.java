class Solution {
    public int maxProfit(int[] prices) {
        // int profit = 0;
        // int lowest = 101;
        // int highest = -1;
        // for(int price : prices){
        //     if(price < lowest){
        //         lowest = price;
        //     }
        //     if(price > highest){
        //         highest = price;
        //     }
        //     if(highest - lowest > profit){
        //         profit = highest - lowest;
        //     }
        // }
        if(prices.length == 1){
            return 0;
        }
        int max_profit = 0;
        for(int i=0; i<prices.length - 1; i++){
            int min = prices[i];
            int max = prices[i];
            for(int j=i+1; j<prices.length; j++){
                max = Math.max(max, prices[j]);
            }
            max_profit = Math.max(max_profit, (max - min));
        }
        return max_profit;
    }
}
