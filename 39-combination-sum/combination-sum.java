class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private void findCombination(int start, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (start == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));

            }
            return;
        }
        if (arr[start] <= target) {
            ds.add(arr[start]);
            findCombination(start, arr, target - arr[start], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(start + 1, arr, target, ans, ds);
    }
}
