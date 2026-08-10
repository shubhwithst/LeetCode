class Solution {
    public int climbStairs(int n) {
        int[] t = new int[n + 1];
        Arrays.fill(t, -1);
        return solve(n, t);
    }

    int solve(int n, int[] t) {
        if (n <= 2) {
            return n;
        }
        if (t[n] != -1) {
            return t[n];
        }
        t[n] = solve(n - 1, t) + solve(n - 2, t);
        return t[n];

    }
}