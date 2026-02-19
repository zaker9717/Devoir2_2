
public class User extends Player {
  
  // Static Scanner instance shared by all User instances
  private static java.util.Scanner scanner = new java.util.Scanner(System.in);

  /**
   * Plays a move by prompting the user for input.
   * Prompts user to enter a position and plays the selected move.
   *
   * @param game the game to play on
   */
  public void play(Game game) {
    // Prompt user to play
    System.out.print(mySymbol + " to play: ");

    try {
      if(scanner.hasNextInt()) {
        int position = scanner.nextInt();
        game.play(position);
      } else {
        System.out.println("Invalid input!");
        scanner.nextLine(); // Clear the invalid input
      }
    } catch (java.util.NoSuchElementException e) {
      // Input stream ended
      System.out.println("Invalid input!");
    }
  }
}