class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length, x = (int) 1e9 - 1;
        int[][] t = new int[n + 1][amount + 1];
        t[0][0] = x;
        for (int i = 1; i < amount + 1; i++) {
            t[0][i] = x;
        }
        for (int i = 1; i < n + 1; i++) {
            t[i][0] = 0;
        }
        for (int i = 1; i < amount + 1; i++) {
            if (i % coins[0] == 0) {
                t[1][i] = i / coins[0];
            } else {
                t[1][i] = x;
            }
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    t[i][j] = Math.min(t[i - 1][j], 1 + t[i][j - coins[i - 1]]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][amount] == x ? -1 : t[n][amount];
    }
}