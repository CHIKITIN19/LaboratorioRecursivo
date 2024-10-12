/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queen;

public class EightQueens {
    private final int BOARD_SIZE = 8;
    private final char QUEEN = 'Q';
    private final char EMPTY = '.';
    
    private final char[][] board = new char[BOARD_SIZE][BOARD_SIZE];

    public EightQueens() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public boolean solve(int col) {
        if (col >= BOARD_SIZE) {
            return true;
        }
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (isSafe(row, col)) {
                board[row][col] = QUEEN;
                if (solve(col + 1)) {
                    return true;
                }
                board[row][col] = EMPTY;
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == QUEEN) {
                return false;
            }
        }
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][col] == QUEEN) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < BOARD_SIZE; i--, j++) {
            if (board[i][j] == QUEEN) {
                return false; 
            }
        }
        for (int i = row + 1, j = col - 1; i < BOARD_SIZE && j >= 0; i++, j--) {
            if (board[i][j] == QUEEN) {
                return false; 
            }
        }
        for (int i = row + 1, j = col + 1; i < BOARD_SIZE && j < BOARD_SIZE; i++, j++) {
            if (board[i][j] == QUEEN) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
