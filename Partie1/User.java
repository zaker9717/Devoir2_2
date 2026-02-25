public class User extends Game.Player {
  public User(Game game, String name, Game.BoxSymbol symbol) {
    game.super(name, symbol);
  }

  public void play(Game game) {
    if (game.getRound() == game.getRows() * game.getColumns()) {
      System.out.println("Game is finished already!");
    } else if (game.getGameState() == Game.GameState.XWIN || game.getGameState() == Game.GameState.OWIN
        || game.getGameState() == Game.GameState.DRAW) {
      System.out.println("Game is finished already!");

    }
  }

}
