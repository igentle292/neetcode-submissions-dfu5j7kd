class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] total_costs = new int[cost.length + 1];
        total_costs[0] = cost[0];
        total_costs[1] = cost[1];
        for(int i=2; i<total_costs.length; i++){
            total_costs[i] = (total_costs[i-1] < total_costs[i-2]) ? total_costs[i-1] : total_costs[i-2];
            if(i < cost.length){
                total_costs[i] += cost[i];
            }
        }
        return total_costs[cost.length];
    }
}
