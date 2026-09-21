class Solution {
    public int findLength(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length, mx = 0;
        int[][] t = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    mx = Math.max(mx, t[i][j]);
                } else {
                    t[i][j] = 0;
                }
            }
        }
        return mx;
    }
}
