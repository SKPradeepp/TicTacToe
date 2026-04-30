import java.util.Random;

public class TicTacToe {

    // Game state variables
    static char userSymbol;
    static char computerSymbol;
    static boolean isUserTurn;

    /**
     * Entry point of the program.
     * Performs toss and assigns symbols.
     */
    public static void main(String[] args) {
        tossToDecideTurn();
    }

    /**
     * UC2: Toss to decide first player and assign symbols
     */
    static void tossToDecideTurn() {
        Random rand = new Random();

        // Randomly decide who starts
        isUserTurn = rand.nextBoolean();

        if (isUserTurn) {
            userSymbol = 'X';
            computerSymbol = 'O';
            System.out.println("Toss Result: User plays first!");
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            System.out.println("Toss Result: Computer plays first!");
        }

        // Display assigned symbols
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);

        // Store current player info
        char currentSymbol = isUserTurn ? userSymbol : computerSymbol;
        System.out.println("Current Turn Symbol: " + currentSymbol);
    }
}