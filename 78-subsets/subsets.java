class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        btFunction(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void btFunction(int[] nums, int start, List<Integer> current, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            btFunction(nums, i + 1, current, ans);
            current.remove(current.size() - 1);
        }
    }
}