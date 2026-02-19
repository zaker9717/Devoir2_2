

public class Computer extends Player {

 public  void play(Game game) {
   if(game.getRound() == game.getRows()*game.getColumns()){
     System.out.println("Game is finished already!");
   }

     // Vérifier que c'est bien au tour de l'ordinateur de jouer
     if (game.nextBoxSymbol() != mySymbol) {
         System.out.println("It is not my turn!");
         return;
     }

     // Trouver toutes les cases vides
     int totalCells = game.getRows() * game.getColumns();
     int[] emptyCells = new int[totalCells];
     int emptyCount = 0;

     for (int i = 0; i < totalCells; i++) {
         if (game.boxSymbolAt(i) == BoxSymbol.EMPTY) {
             emptyCells[emptyCount] = i;
             emptyCount++;
         }
     }

     // S'il n'y a pas de cases vides, la partie devrait être terminée
     if (emptyCount == 0) {
         return;
     }

     // Choisir une case vide au hasard
     int randomIndex = GameMain.generator.nextInt(emptyCount);
     int chosenCell = emptyCells[randomIndex];

     // Jouer le coup
     game.play(chosenCell);
 }
}

}