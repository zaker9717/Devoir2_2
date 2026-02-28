import java.util.ArrayList;
import java.util.List;

public class Computer extends Player {

  public Computer(String name) {
    super(name);
  }

  @Override
  public void play(Game game) {
    // Vérifie que la partie est jouable
    if (game == null) {
      System.out.println("Error: game is null.");
      return;
    }
    if (game.getGameState() != GameState.PLAYING) {
      System.out.println("Game is finished already!");
      return;
    }
    if (game.getRound() >= game.getRows() * game.getColumns()) {
      System.out.println("Game is finished already!");
      return;
    }

    // Collecte toutes les cases vides
    int size = game.getRows() * game.getColumns();
    List<Integer> empty = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      if (game.boxSymbolAt(i) == BoxSymbol.EMPTY) {
        empty.add(i);
      }
    }

    // S'il n'y a aucun coup possible, c'est fini (sécurité)
    if (empty.isEmpty()) {
      System.out.println("Game is finished already!");
      return;
    }

    // Choix uniforme au hasard parmi les coups possibles
    int choiceIndex = GameMain.generator.nextInt(empty.size());
    int move = empty.get(choiceIndex);

    // L'ordinateur joue en silence
    game.play(move);
  }
}