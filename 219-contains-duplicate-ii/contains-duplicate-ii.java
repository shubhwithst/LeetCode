class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1)
            return false;

        Set<Integer> values = new HashSet<>();
        int i = 0;

        while (i < n) {
            if (i - k - 1 >= 0 && i - k - 1 < n)
                values.remove(nums[i - k - 1]);
            if (!values.add(nums[i++]))
                return true;
        }
        return false;
    }
}