

public class Game {

   /**
 * Le plateau du jeu, stocké sous forme de tableau 
 */
 private BoxSymbol[] board;


   /**
 * round enregistre le nombre de tours qui ont été
 * joué jusqu'à présent. Commence à 0.
 */
 private int round;

   /**
 * gameState enregistre l'état actuel du jeu.
 */
 private GameState gameState;


   /**
 * rows est le nombre de lignes dans la grille
 */
 private final int rows;

   /**
 * columns est le nombre de colonnes dans la grille
 */
 private final int columns;


   /**
 * numberWin est le nombre de cellules du même type
 * qu'il faut aligner pour gagner la partie
 */
 private final int numberWin;


   /**
 * constructeur par défaut, pour un jeu de 3x3, qui doit
 * aligner 3 cellules
 */
 public Game(){
  this(3,3,3);
 }

  
   /**
  * constructeur permettant de préciser le nombre de lignes
  * et le nombre de colonnes pour le jeu, ainsi que
  * le nombre de cellules qu'il faut aligner pour gagner.
    * @param rows
    *  the number of rows in the game
    * @param columns
    *  the number of columns in the game
    * @param numberWin
    *  the number of cells that must be aligned to win.
    */
 public Game(int rows, int columns, int numberWin){
  //VOTRE CODE ICI
 }



   /**
 * getter pour la variable rows
   * @return
   *  the value of rows
   */
 public int getRows(){
  return rows;
 }

   /**
 * getter pour la variable columns
   * @return
   *  the value of columns
   */
 public int getColumns(){
  return columns;
 }

   /**
 * getter pour la variable round
   * @return
   *  the value of roud
   */
 public int getRound(){
  return round;
 }


   /**
 * getter pour la variable gameState
   * @return
   *  the value of gameState
   */
 public GameState getGameState(){
  return gameState;
 }

   /**
 * getter pour la variable numberWin
   * @return
   *  the value of numberWin
   */
 public int getNumberWin(){
  return numberWin;
 }

  /**
 *renvoie le prochain BoxSymbol prevu,
 * Cette méthode ne modifie pas l'état du jeu.
   * @return 
   *  the value of the enum BoxSymbol corresponding
   * to the next expected symbol.
   */
 public BoxSymbol nextBoxSymbol(){
   if (round%2 == 0) return BoxSymbol.X;
   return BoxSymbol.O;
 }

 
   /**
 * renvoie la valeur de la case a l'index i.
 * Si l'index n'est pas valide, un message d'erreur est
 * imprimé. Le comportement est alors indéterminé
    * @param i
    *  the index of the Box in the array board
    * @return 
    *  the value at index i in the variable board.
    */
 public BoxSymbol boxSymbolAt(int i) {

  //VOTRE CODE ICI
 }

  /**
  * Cette méthode est appelée par le prochain joueur à jouer
  * à la case à l'index i.
  * Si l'index n'est pas valide, un message d'erreur est
  * imprimé. Le comportement est alors indéterminé
  * Si la case choisie n'est pas vide, un message d'erreur s'affiche.
  * Le comportement est alors indéterminé
  * Si le coup est valide, le plateau (board) est également mis à jour
  * ainsi que l'état du jeu. Doit appeler la méthode update.
    * @param i
    *  the index of the box in the array board that has been 
    * selected by the next player
    */
 public void play(int i) {

  if(i < 0 || i >= rows*columns){
   System.out.println("Illegal position: " + i);
   return;
  }
  //VOTRE CODE ICI
  
 }


   /**
 * Une méthode d'assistance qui met à jour la variable gameState
 * correctement après que la case à l'index i vient d'etre défini.
 * La méthode suppose qu'avant de paramétrer la case
 * à l'index i, la variable gameState a été correctement définie.
 * cela suppose aussi qu'elle n'est appelée que si le jeu n'a pas encore été
 * été terminé lorsque la case à l'index i a été jouée
 * (le jeu en cours). Il suffit donc de
 * Vérifiez si jouer à l'index i a terminé la partie.
    * @param i
    *  the index of the box in the array board that has just 
    * been set
   */

private void update(int index){
 
   //VOTRE CODE ICI
 
}

 

   /**
 * Renvoie une représentation sous forme de chaîne du jeu correspondant
 * à l'exemple fourni dans la description du devoir
    * @return
    *  String representation of the game
   */

 public String toString(){
  String res = "";
  //VOTRE CODE ICI
  return res ;
  
 }

}