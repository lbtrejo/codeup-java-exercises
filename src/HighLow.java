import java.util.Scanner;
import util.Input;

public class HighLow {
    public static int generateRandom(){
        int random = (int)(Math.random()*((100-1)+1))+1;
        System.out.println("random = " + random);
        return random;
    }

    public static void main(String[] args) {
        int guessNumber = generateRandom();
        int timesGuessed = 1;
        int guessLimit = 5;
        System.out.println("Welcome to the HighLow guessing game!");
        Input input = new Input();
        int playerGuess = input.getInt("Please guess a number between 1 and 100:");
        while (true){
            if (playerGuess > guessNumber){
                System.out.println("LOWER");
                timesGuessed++;
                if (timesGuessed > guessLimit){
                    System.out.println("You ran out of guesses. Better luck next time!");
                    break;
                }
                playerGuess = input.getInt("Try again:");
            } else if (playerGuess < guessNumber){
                System.out.println("HIGHER");
                timesGuessed++;
                if (timesGuessed > guessLimit){
                    System.out.println("You ran out of guesses. Better luck next time!");
                    break;
                }
                playerGuess = input.getInt("Try again:");
            } else {
                System.out.println("GOOD GUESS!");
                System.out.printf("You made %d guesses.%n", timesGuessed);
                break;
            }
        }
        System.out.println("Thanks for playing!");
    }
}
