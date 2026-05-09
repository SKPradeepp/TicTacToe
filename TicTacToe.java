import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isUserTurn = true;
        boolean gameOver = false;
        int moves = 0;

        while (!gameOver) {

            printBoard();

            if (isUserTurn) {

                System.out.print("Enter slot (1-9): ");
                int slot = scanner.nextInt();

                int row = (slot - 1) / 3;
                int col = (slot - 1) % 3;

                if (board[row][col] == '-') {
                    board[row][col] = 'X';
                    moves++;
                    isUserTurn = false;
                } else {
                    System.out.println("Cell already occupied!");
                }

            } else {

                computerMove();
                moves++;
                isUserTurn = true;
            }

            // Stop game after all 9 moves (draw condition placeholder)
            if (moves == 9) {
                gameOver = true;
                System.out.println("Game Draw!");
            }
        }

        printBoard();
    }

    /**
     * Computer makes random move
     */
    static void computerMove() {

        Random random = new Random();

        while (true) {

            int slot = random.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {

                board[row][col] = 'O';

                System.out.println("Computer selected slot: " + slot);

                break;
            }
        }
    }

    /**
     * Prints the board
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