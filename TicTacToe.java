public class TicTacToe {

    /**
     * Entry point of the program.
     * Demonstrates slot to index conversion.
     */
    public static void main(String[] args) {
        int slot = 5; // Example input

        int[] position = convertSlotToIndex(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }

    /**
     * UC4: Converts slot number (1–9) to row & column (0–2)
     */
    static int[] convertSlotToIndex(int slot) {

        int row = (slot - 1) / 3;   // integer division
        int col = (slot - 1) % 3;   // modulo

        return new int[]{row, col};
    }
}