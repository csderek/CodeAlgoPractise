class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int last_1 = cost[0];
        int last_2 = 0;
        int cur;

        for(int i = 1; i < cost.length; i++){
            cur = Math.min(last_1 + cost[i], last_2 + cost[i]);
            last_2 = last_1;
            last_1 = cur;
        }

        return Math.min(last_2, last_1);
    }

    
}