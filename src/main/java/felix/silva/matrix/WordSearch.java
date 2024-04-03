package felix.silva.matrix;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (tryMountingWord(i, j, board, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean tryMountingWord(int i, int j, char[][] board, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        var temp = board[i][j];
        board[i][j] = '*';

        boolean found = tryMountingWord(i - 1, j, board, word, index + 1) ||
            tryMountingWord(i, j - 1, board, word, index + 1) ||
            tryMountingWord(i + 1, j, board, word, index + 1) ||
            tryMountingWord(i, j + 1, board, word, index + 1);

        board[i][j] = temp;

        return found;
    }
}


