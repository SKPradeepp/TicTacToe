public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;   // example position
        int col = 1;
        char symbol = 'X';

        placeMove(row, col, symbol);
        printBoard();
    }

    /**
     * UC6: Places the given symbol on the board
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    /**
     * Utility method to print board
     */
    static void printBoard() {
        System.out.println("-------------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }
}