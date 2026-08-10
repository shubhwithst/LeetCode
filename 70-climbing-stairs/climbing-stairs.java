
class Solution {
    Map<Integer, Integer> t = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        if (t.containsKey(n)) {
            return t.get(n);
        }
        t.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return t.get(n);
    }
}