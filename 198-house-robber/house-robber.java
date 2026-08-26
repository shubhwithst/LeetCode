
class Solution {
    int[] t;

    public int rob(int[] nums) {
        t = new int[nums.length];
        Arrays.fill(t, -1);
        return maxRob(nums, 0);
    }

    private int maxRob(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        if (t[i] != -1) {
            return t[i];
        }
        return t[i] = Math.max(maxRob(nums, i + 1), nums[i] + maxRob(nums, i + 2));
    }
}