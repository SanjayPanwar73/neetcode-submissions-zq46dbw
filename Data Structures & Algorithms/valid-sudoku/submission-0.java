class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] seenRow = new boolean[9];
            boolean[] seenCol = new boolean[9];
            boolean[] seenBox = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // check row i
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (num < 0 || num >= 9) return false; 
                    if (seenRow[num]) return false;
                    seenRow[num] = true;
                }

                // check column i
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (num < 0 || num >= 9) return false;
                    if (seenCol[num]) return false;
                    seenCol[num] = true;
                }

                int boxRow = 3 * (i / 3) + j / 3;
                int boxCol = 3 * (i % 3) + j % 3;
                if (board[boxRow][boxCol] != '.') {
                    int num = board[boxRow][boxCol] - '1';
                    if (num < 0 || num >= 9) return false;
                    if (seenBox[num]) return false;
                    seenBox[num] = true;
                }
            }
        }
        return true;
    }
}
