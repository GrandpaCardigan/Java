public class sudokuSolver {

    private static boolean safeChecker(int[][] board,
                                       int row, int col,
                                       int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == num) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int gridRowStart = row - row % sqrt;
        int gridColStart = col - col % sqrt;

        for (int j = gridRowStart;
             j < gridRowStart + sqrt; j++) {
            for (int k = gridColStart;
                 k < gridColStart + sqrt; k++) {
                if (board[j][k] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean sudokuSolver(int[][] board, int n) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;

                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        } if (isEmpty){
            return true;
        }

}
