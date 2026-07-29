class Solution {

    List<List<Integer>> ans;

    public List<List<Integer>> permute(int[] arr) {
        ans = new ArrayList<>();
        btPermute(arr, new ArrayList<>());
        return ans;
    }

    void btPermute(int[] arr, List<Integer> temp) {
        if (temp.size() == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (temp.contains(arr[i]))
                continue;
            temp.add(arr[i]);
            btPermute(arr, temp);
            temp.remove(temp.size() - 1);
        }

    }
}