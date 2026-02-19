
public class User extends Player {
  
  public  void play(Game game) {
    if(game.getRound() == game.getRows()*game.getColumns()){
      System.out.println("Game is finished already!");
   }

   // VOTRE CODE ICI
}