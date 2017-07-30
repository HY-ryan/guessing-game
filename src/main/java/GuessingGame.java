import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        Game game = new Game();
        Prompter prompter = new Prompter(game);

        prompter.promptForItem();
        prompter.promptForMax();
        
        int randomNum = random.nextInt(game.getMax() + 1);
        
        prompter.promptForGuess(randomNum);

        System.out.println("");


    }
}
