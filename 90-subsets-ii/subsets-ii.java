class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        solve(nums, 0, new ArrayList<Integer>());
        return ans;
    }

    void solve(int[] nums, int start, List<Integer> curr) {
        if (!ans.contains(curr)) {
            ans.add(new ArrayList<>(curr));
        }
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            solve(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }

    }
}
