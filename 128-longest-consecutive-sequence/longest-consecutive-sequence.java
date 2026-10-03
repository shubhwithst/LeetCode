class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int x : nums)
            integerSet.add(x);
        int ans = 0;
        for (int num : integerSet) {
            if (!integerSet.contains(num - 1)) {
                int length = 1;
                while (integerSet.contains(num + length))
                    length++;
                ans = Math.max(length, ans);
            }
        }
        return ans;
    }
}