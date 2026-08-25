
class Solution {
    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, 0), minCost(cost, 1));
    }

    private int minCost(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        return dp[i] = arr[i] + Math.min(minCost(arr, i + 1), minCost(arr, i + 2));
    }
}