import java.util.Scanner;

class Prompter {
  private Game game;
  Scanner scanner = new Scanner(System.in);
  
  public Prompter(Game game) {
   this.game = game; 
  }

  public boolean promptForItem() {

    boolean isAcceptable = true;

    System.out.print("What type of item?  ");
    String itemInput = scanner.nextLine();
    game.setItem(itemInput);
    return isAcceptable;
  }

  public void promptForMax() {
    System.out.printf("What is the maximum amount of %s?  ", game.getItem());
    String itemMax = scanner.nextLine();
    int itemMaxInt = Integer.parseInt(itemMax);
    game.setMax(itemMaxInt);
  }

  public void displayItem() {
      System.out.printf("We are going to guess how many %s,.%n", game.getItem());
  }

  public boolean promptForGuess(int randomNum) {
    boolean correct = false;
    int guesses = 0;
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d.  ", game.getItem(), game.getMax());
      do {
        int guessInput = scanner.nextInt();
        if (guessInput == randomNum) {
            guesses += 1;
            System.out.printf("Congratulations - you guessed that there were %d %s in the jar! It took you %d guess(es) to get it right.%n", randomNum, game.getItem(), guesses);
            correct = true;
        } else {
            guesses += 1;
            System.out.printf("Wrong! Guesses:  %d.%n", guesses);
        }

      } while (!correct);

      return correct;
  }


}