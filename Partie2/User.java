public class User extends Player {

    public void play(Game game) {
        // Check if the game is already finished
        if (game.getRound() == game.getRows() * game.getColumns() ||
                game.getGameState() != GameState.PLAYING) {
            System.out.println("Game is finished already!");
            return;
        }

        // Check that it's the human's turn
        if (game.nextBoxSymbol() != mySymbol) {
            System.out.println("Not your turn!");
            return;
        }

        boolean validMove = false;

        while (!validMove) {
            // Display the game
            System.out.print(game.toString());

            // Ask for the move
            System.out.print(mySymbol + " to play: ");
            String input = GameMain.console.readLine();

            try {
                int position = Integer.parseInt(input.trim());

                // Check if position is valid
                if (position < 0 || position >= game.getRows() * game.getColumns()) {
                    System.out.println("Invalid position. Try again.");
                    continue;
                }

                // Check if the cell is empty - Utiliser BoxSymbol.EMPTY (pas Game.BoxSymbol)
                if (game.boxSymbolAt(position) != BoxSymbol.EMPTY) {
                    System.out.println("This cell is already occupied. Try again.");
                    continue;
                }

                // Play the move
                game.play(position);
                validMove = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}