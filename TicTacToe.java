public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     * Places a move and prints the updated board.
     */
    public static void main(String[] args) {

        int row = 1;
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
     * Prints the Tic-Tac-Toe board
     */
    static void printBoard() {
        System.out.println("-------------------");

        for (int row = 0; row < 3; row++) {

            System.out.print("| ");

            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }

            System.out.println();
            System.out.println("-------------------");
        }
    }
}