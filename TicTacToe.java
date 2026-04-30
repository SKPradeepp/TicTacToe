public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;  // example
        int col = 1;  // example

        if (isValidMove(row, col)) {
            System.out.println("Move is valid!");
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }

    /**
     * UC5: Validates whether the move is within bounds and cell is empty
     */
    static boolean isValidMove(int row, int col) {

        // Check bounds (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}