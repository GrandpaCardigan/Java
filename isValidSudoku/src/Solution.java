import java.io.*;

public class Solution {

    public static boolean isValidSudoku(char[][] board){

        short[] rows = new short[9];
        short[] cols = new short[9];
        short[] squares = new short[9];

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] == '.') continue;

                short value = (short) (1 << (board[row][col] - '1'));
            }
        }

        return false;
    }
    public static void main(String[] args){
        char[][] board = {
                {'1', '8', '4', '9', '6', '3', '7', '2', '5'},
                {'5', '6', '2', '7', '4', '8', '3', '1', '9'},
                {'3', '9', '7', '5', '1', '2', '8', '6', '4'},
                {'2', '3', '9', '6', '5', '7', '1', '4', '8'},
                {'7', '5', '6', '1', '8', '4', '2', '9', '3'},
                {'4', '1', '8', '2', '3', '9', '6', '6', '4'},
                {'9', '4', '1', '3', '7', '6', '5', '8', '2'},
                {'6', '2', '3', '8', '9', '5', '4', '7', '1'},
                {'8', '7', '5', '4', '2', '1', '9', '3', '6'},
        };
        System.out.println(isValidSudoku(board));
        }
    }

