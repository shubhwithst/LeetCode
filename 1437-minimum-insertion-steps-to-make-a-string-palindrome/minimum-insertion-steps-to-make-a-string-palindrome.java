// class Solution {
//     public int minInsertions(String s) {
        
//     }
// }

class Solution {
    public int minInsertions(String str1) {
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        int m = str1.length(), n = str2.length();
        int[][] t = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    t[i][j] = 1 + t[i - 1][j - 1];
                else
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
            }
        }
        return str1.length() - t[m][n];
    }
}