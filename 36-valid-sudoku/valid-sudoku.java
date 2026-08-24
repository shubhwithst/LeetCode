
class Solution {
    public boolean isValidSudoku(char[][] board) {

        // valid col
        for (int row = 0; row < 9; row++) {
            HashSet<Character> st = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') continue;
                if (st.contains(board[row][col])) return false;
                else st.add(board[row][col]);
            }
        }

        // validate row
        for (int col = 0; col < 9; col++) {
            HashSet<Character> st = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') continue;
                if (st.contains(board[row][col])) return false;
                else st.add(board[row][col]);
            }
        }

        //validate boxes
        for (int rS = 0; rS < 9; rS += 3) {
            int rE = rS + 2;
            for (int cS = 0; cS < 9; cS += 3) {
                int cE = cS + 2;
                if (!isValidBox(board, rS, rE, cS, cE)) {
                    return false;
                }
            }

        }

        return true;
    }

    private boolean isValidBox(char[][] board, int rS, int rE, int cS, int cE) {
        HashSet<Character> st = new HashSet<>();
        for (int i = rS; i <= rE; i++) {
            for (int j = cS; j <= cE; j++) {
                if (board[i][j] == '.') continue;
                if (st.contains(board[i][j]))
                    return false;
                st.add(board[i][j]);

            }
        }
        return true;
    }
}