class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> pSum = new HashMap<>();
        pSum.put(0, 1);
        int sum = 0, cnt = 0;
        for (int x : arr) {
            sum += x;
            if (pSum.containsKey(sum - k)) {
                cnt += pSum.get(sum - k);
            }

            pSum.put(sum, pSum.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}