/**
 * This program will use a recursive backtracking algorithm
 * to sort through a given two-dimensional array to prove
 * either the given array solution is valid or invalid
 *
 * @author Nicholas Kier
 * @version 1.0
 */
public class Sudoku {

    public static int[][] grid;

    public static boolean sudokuCheck(int[][] s) {
        // row checker
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 8; col++)
                for (int col2 = col + 1; col2 < 9; col2++)
                    if (s[row][col] == s[row][col2])
                        return false;
        }
        // column checker
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 8; row++)
                for (int row2 = row + 1; row2 < 9; row2++)
                    if (s[row][col] == s[row2][col])
                        return false;
        }
        // grid checker
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3)
                // row, col is the start of the 3x3 grid
                for (int pos = 0; pos < 8; pos++)
                    for (int pos2 = pos + 1; pos2 < 9; pos2++)
                        if (s[row + pos % 3][col + pos / 3] == s[row + pos2 % 3][col + pos2 / 3])
                            return false;
        }
        return true;
    }
}

