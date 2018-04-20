package za.co.entelect.tictactoe;

/**
 * Uses the MiniMax algorithm to play a move in a game of Tic Tac Toe.
 */
class MiniMax {

    private static double maxPly;

    /**
     * MiniMax cannot be instantiated.
     */
    private MiniMax() {
    }

    /**
     * Execute the algorithm.
     *
     * @param player the player that the AI will identify as
     * @param board  the Tic Tac Toe board to play on
     * @param maxPly the maximum depth
     */
    static void run(Board.State player, Board board, double maxPly) {
        if (maxPly < 1) {
            throw new IllegalArgumentException("Maximum depth must be greater than 0.");
        }

        MiniMax.maxPly = maxPly;
        miniMax(player, board, 0);
    }

    /**
     * The meat of the algorithm.
     *
     * @param player     the player that the AI will identify as
     * @param board      the Tic Tac Toe board to play on
     * @param currentPly the current depth
     * @return the score of the board
     */
    private static int miniMax(Board.State player, Board board, int currentPly) {
        // TODO: Implement me :)
        return 0;
    }

    /**
     * Play the move with the highest score.
     *
     * @param player     the player that the AI will identify as
     * @param board      the Tic Tac Toe board to play on
     * @param currentPly the current depth
     * @return the score of the board
     */
    private static int getMax(Board.State player, Board board, int currentPly) {
        // TODO: Implement me :)
        return 0;
    }

    /**
     * Play the move with the lowest score.
     *
     * @param player     the player that the AI will identify as
     * @param board      the Tic Tac Toe board to play on
     * @param currentPly the current depth
     * @return the score of the board
     */
    private static int getMin(Board.State player, Board board, int currentPly) {
        // TODO: Implement me :)
        return 0;
    }

    /**
     * Get the score of the board.
     *
     * @param player the play that the AI will identify as
     * @param board  the Tic Tac Toe board to play on
     * @return the score of the board
     */
    private static int score(Board.State player, Board board) {
        if (player == Board.State.Blank) {
            throw new IllegalArgumentException("Player must be X or O.");
        }

        // TODO: Implement me :)
        return 0;
    }


}
