class Solution {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long evenWays = pow(5, even);
        long oddWays = pow(4, odd);

        return (int) ((evenWays * oddWays) % MOD);
    }


    private long pow(long base, long exp) {
        long res = 1;
        base %= MOD;

        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }

        return res;
    }
}