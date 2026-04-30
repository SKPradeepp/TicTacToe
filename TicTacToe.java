import java.util.Scanner;

public class TicTacToe {

    /**
     * Entry point of the program.
     * Calls method to take user input.
     */
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("User selected slot: " + slot);
    }

    /**
     * UC3: Accepts user slot input (1–9)
     * Returns the selected slot number
     */
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        System.out.print("Enter a slot number (1-9): ");
        slot = scanner.nextInt();

        return slot;
    }
}