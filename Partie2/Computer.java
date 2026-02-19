public class Computer extends Player {

    public void play(Game game) {
        // Check if the game is already finished
        if (game.getRound() == game.getRows() * game.getColumns() ||
                game.getGameState() != GameState.PLAYING) {
            System.out.println("Game is finished already!");
            return;
        }

        // Check that it's the computer's turn
        if (game.nextBoxSymbol() != mySymbol) {
            System.out.println("Not my turn!");
            return;
        }

        // Find all empty cells
        int totalCells = game.getRows() * game.getColumns();
        int[] emptyCells = new int[totalCells];
        int emptyCount = 0;

        for (int i = 0; i < totalCells; i++) {
            // Utiliser BoxSymbol.EMPTY (pas Game.BoxSymbol)
            if (game.boxSymbolAt(i) == BoxSymbol.EMPTY) {
                emptyCells[emptyCount] = i;
                emptyCount++;
            }
        }

        // If no empty cells
        if (emptyCount == 0) {
            return;
        }

        // Choose a random empty cell
        int randomIndex = GameMain.generator.nextInt(emptyCount);
        int chosenCell = emptyCells[randomIndex];

        // Play the move
        game.play(chosenCell);
    }
}