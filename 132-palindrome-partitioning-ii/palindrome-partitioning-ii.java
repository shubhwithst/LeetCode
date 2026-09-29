class Solution {
    int[][] t = new int[2001][2001];

    public int minCut(String s) {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        char[] chars = s.toCharArray();
        return solve(chars, 0, s.length() - 1);
    }

    int solve(char[] s, int i, int j) {
        if (i >= j || isPalindrome(s, i, j))
            return 0;
        if (t[i][j] != -1)
            return t[i][j];
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            if (isPalindrome(s, i, k)) {
                int tempAns = 1 + solve(s, i, k) + solve(s, k + 1, j);
                ans = Math.min(ans, tempAns);
            }

        }
        return t[i][j] = ans;
    }

    private boolean isPalindrome(char[] s, int i, int j) {
        while (i <= j) {
            if (s[i] != s[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
