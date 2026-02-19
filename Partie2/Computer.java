

public class Computer extends Player {

 /**
  * Plays a move by selecting a random empty box.
  * First checks if the game is already finished, then chooses
  * a random empty position from all available positions and plays it.
  *
  * @param game the game to play on
  */
 public void play(Game game) {
   // Check if game is already finished
   if(game.getRound() == game.getRows() * game.getColumns()){
     System.out.println("Game is finished already!");
     return;
   }

   // Find all empty positions
   java.util.ArrayList<Integer> emptyPositions = new java.util.ArrayList<>();
   for(int i = 0; i < game.getRows() * game.getColumns(); i++) {
     if(game.boxSymbolAt(i) == BoxSymbol.EMPTY) {
       emptyPositions.add(i);
     }
   }

   // If there are empty positions, choose one randomly and play
   if(emptyPositions.size() > 0) {
     int randomIndex = GameMain.generator.nextInt(emptyPositions.size());
     int position = emptyPositions.get(randomIndex);
     game.play(position);
   }
 }
}