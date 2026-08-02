class Solution {
     public int longestOnes(int[] arr, int k) {
        int left = 0;
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt++;
            }
            if (cnt > k) {
                while (arr[left] != 0) {
                    left++;
                }
                cnt--;
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}