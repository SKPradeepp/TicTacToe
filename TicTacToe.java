public class TicTacToe {

    static char[][] board = {
        {'X', 'X', 'X'},
        {'-', 'O', '-'},
        {'O', '-', 'O'}
    };

    public static void main(String[] args) {

        char symbol = 'X';

        if (checkWinner(symbol)) {
            System.out.println(symbol + " wins the game!");
        } else {
            System.out.println("No winner yet.");
        }
    }

    /**
     * UC9: Checks winning condition
     */
    static boolean checkWinner(char symbol) {

        // Check rows
        for (int row = 0; row < 3; row++) {

            if (board[row][0] == symbol &&
                board[row][1] == symbol &&
                board[row][2] == symbol) {

                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {

            if (board[0][col] == symbol &&
                board[1][col] == symbol &&
                board[2][col] == symbol) {

                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {

            return true;
        }

        // Check opposite diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {

            return true;
        }

        return false;
    }
}