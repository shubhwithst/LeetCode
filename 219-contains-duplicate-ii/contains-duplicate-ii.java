class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1)
            return false;

        Set<Integer> values = new HashSet<>();
        int i = 0;
        for (; i < k + 1 && i < n; i++) {
            if (values.contains(nums[i])) {
                return true;
            } else
                values.add(nums[i]);
        }

        while (i < n) {
            values.remove(nums[i - k - 1]);
            if (values.contains(nums[i])) {
                return true;
            }
            values.add(nums[i++]);
        }
        return false;
    }
}