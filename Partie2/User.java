import java.util.Scanner;

public class User extends Player {

  public User(String name) {
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

    // Invite l'utilisateur à jouer (l'affichage du plateau est géré par GameMain)
    BoxSymbol next = game.nextBoxSymbol();
    int maxIndex = game.getRows() * game.getColumns() - 1;

    Scanner sc = GameMain.scanner; // Scanner global fourni par GameMain
    while (true) {
      System.out.print(next + " to play: ");
      if (!sc.hasNextInt()) {
        // Consomme l'entrée invalide et redemande
        sc.next();
        System.out.println("Invalid input; please enter an integer between 0 and " + maxIndex + ".");
        continue;
      }

      int idx = sc.nextInt();
      System.out.println(idx); // pour reproduire l'exemple d'affichage (la valeur retapée)

      // Validation simple avant d'envoyer à game.play
      if (idx < 0 || idx > maxIndex) {
        System.out.println("Illegal position: " + idx);
        continue;
      }
      if (game.boxSymbolAt(idx) != BoxSymbol.EMPTY) {
        System.out.println("Position " + idx + " is not empty!");
        continue;
      }

      game.play(idx);
      return;
    }
  }
}