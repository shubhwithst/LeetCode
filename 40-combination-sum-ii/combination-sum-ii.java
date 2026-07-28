class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        btCombinationSum2(candidates, target, new ArrayList<>(), 0);
        return ans;
    }

    void btCombinationSum2(int[] candidates, int target, List<Integer> curr, int start) {
        if (target < 0)
            return;
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            curr.add(candidates[i]);
            btCombinationSum2(candidates, target - candidates[i], curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}