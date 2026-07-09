class Solution {
    public int countPairs(List<Integer> arr, int target) {
        int size = arr.size();
        int cnt = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr.get(i) + arr.get(j) < target)
                    ++cnt;
            }
        }
        return cnt;
    }
}