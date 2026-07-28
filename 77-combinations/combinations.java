class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        btCombine(1, n, k, new ArrayList<>());
        return ans;
    }

    void btCombine(int start, int n, int k, ArrayList<Integer> curr) {
        if (k == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i <= n; i++) {
            curr.add(i);
            btCombine(i + 1, n, k - 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}